package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {
    public static List<Integer> list1(){
        return Arrays.asList(1,3,5,8,8);
    }
    @Test
    public void deduplicate() {
        class StubListSorter implements GenericListSorter{
            @Override public List<Integer> sort(List<Integer> list) {
                return  Arrays.asList(1, 2, 4, 5);
            }
        }
        StubListSorter sorter = new StubListSorter();
        ListDeduplicator deduplicator = new ListDeduplicator(sorter);
        List<Integer> distinct = deduplicator.deduplicate(list1());
        Assertions.assertEquals(Arrays.asList(1, 2, 4, 5), distinct);
    }

    @Test
    public void bug_deduplicate_8726() {
        List<Integer> list = Arrays.asList(1,2,4,2);
        class StubListSorter implements GenericListSorter{
            @Override public List<Integer> sort(List<Integer> list) {
                return  Arrays.asList(1, 2, 2, 4);
            }
        }
        StubListSorter sorter = new StubListSorter();
        ListDeduplicator deduplicator = new ListDeduplicator(sorter);
        List<Integer> distinct = deduplicator.deduplicate(list);
        Assertions.assertEquals(Arrays.asList(1, 2, 4), distinct);
    }
}
