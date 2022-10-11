package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAggregatorTest {

    public static List<Integer> list1(){
        List<Integer> list = Arrays.asList(1,3,6,4,6,7);
        return list;
    }
    public static List<Integer> list2(){
        List<Integer> list = Arrays.asList(1,2,5,4,5,4);
        return list;
    }
    public static List<Integer> max_bug_7263(){
        return Arrays.asList(-1,-4,-5);
    }
    @Test
    public void sum() {
        List<Integer> list = Arrays.asList(1,2,4,2,5);

        ListAggregator aggregator = new ListAggregator();
        int sum = aggregator.sum(list);
        int sum1 = aggregator.sum(list1());
        int sum2 = aggregator.sum(list2());

        Assertions.assertEquals(14, sum);
        Assertions.assertEquals(27,sum1);
        Assertions.assertEquals(21,sum2);
    }

    @Test
    public void max() {
        List<Integer> list = Arrays.asList(1,2,4,2,5);

        ListAggregator aggregator = new ListAggregator();
        int max = aggregator.max(list);
        int max1 = aggregator.max(list1());
        int max2 = aggregator.max(list2());
        int max3 = aggregator.max(max_bug_7263());

        Assertions.assertEquals(5, max);
        Assertions.assertEquals(7, max1);
        Assertions.assertEquals(5, max2);
        Assertions.assertEquals(-1,max3);

    }

    @Test
    public void min() {
        List<Integer> list = Arrays.asList(1,2,4,2,5);

        ListAggregator aggregator = new ListAggregator();
        int min = aggregator.min(list);
        int min1 = aggregator.min(list1());
        int min2 = aggregator.min(list2());

        Assertions.assertEquals(1, min);
        Assertions.assertEquals(1,min1);
        Assertions.assertEquals(1,min2);
    }

    @Test
    public void distinct() {
        List<Integer> list = Arrays.asList(1,2,4,2,5);

        ListAggregator aggregator = new ListAggregator();
        int distinct = aggregator.distinct(list);
        int distinct1 = aggregator.distinct(list1());
        int distinct2 = aggregator.distinct(list2());

        Assertions.assertEquals(4, distinct);
        Assertions.assertEquals(5,distinct1);
        Assertions.assertEquals(5,distinct2);
    }
}
