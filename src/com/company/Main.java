package com.company;
import java.util.*;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        List<Integer> digits;
        try
        {
            digits = Arrays.asList(1,2,3,1,1,3,3);
        }catch (NullPointerException e)
        {
            digits = Arrays.asList();
        }
        List<Integer> groups = lottery(digits, 3);
        System.out.println(groups); // [1,3]

    }

    private static List<Integer> lottery(List<Integer> collections, Integer digit)
    {
        if (digit ==(null))
        {
            digit = 0;
        }

        Set<Integer> lotterySet = new HashSet<>(collections);
        ArrayList groups = new ArrayList<>();

        for (Integer i : lotterySet) {
            if (Collections.frequency(collections, i) == digit)
            {
                groups.add(i);
            }
        }

        return groups;
    }
}

