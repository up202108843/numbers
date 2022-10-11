package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListSorterTest {

    public static List<Integer> list1(){
        return Arrays.asList(3,5,2,4,6);
    }
    public static List<Integer> list2(){
        return Arrays.asList(4,3,2,1,5);
    }
    @Test
    public void sort() {
        List<Integer> list = Arrays.asList(3, 2, 6, 1, 4, 5, 7);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> expected1 = Arrays.asList(2,3,4,5,6);
        List<Integer> expected2 = Arrays.asList(1,2,3,4,5);

        ListSorter sorter = new ListSorter();
        List<Integer> sorted = sorter.sort(list);

        ListSorter sorter1 = new ListSorter();
        List<Integer> sorted1 = sorter1.sort(list1());

        ListSorter sorter2 = new ListSorter();
        List<Integer> sorted2 = sorter2.sort(list2());

        Assertions.assertEquals(expected, sorted);
        Assertions.assertEquals(expected1, sorted1);
        Assertions.assertEquals(expected2, sorted2);
    }
}
