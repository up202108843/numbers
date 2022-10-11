package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {
    public static List<Integer> list1(){
        return Arrays.asList(1,3,5,8,8);
    }
    public static List<Integer> list2(){
        return Arrays.asList(2,3,4,6,5);
    }
    @Test
    public void deduplicate() {
        List<Integer> list = Arrays.asList(1,2,4,2,5);
        List<Integer> expected = Arrays.asList(1,2,4,5);
        List<Integer> expected1 = Arrays.asList(1,3,5,8);
        List<Integer> expected2 = Arrays.asList(2,3,4,6,5);

        ListDeduplicator deduplicator = new ListDeduplicator();
        List<Integer> distinct = deduplicator.deduplicate(list);

        ListDeduplicator deduplicator1 = new ListDeduplicator();
        List<Integer> distinct1 = deduplicator1.deduplicate(list1());

        ListDeduplicator deduplicator2 = new ListDeduplicator();
        List<Integer> distinct2 = deduplicator2.deduplicate(list2());

        Assertions.assertEquals(expected, distinct);
        Assertions.assertEquals(expected1, distinct1);
        Assertions.assertEquals(expected2, distinct2);
    }
}
