package com.mj.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MostCandies {

    @Test
    public void test(){
        int[] candies = new int[]{2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies).toString());

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int largest = Arrays.stream(candies).max().getAsInt();

        for (int candy : candies) {
            if (candy + extraCandies >= largest)
                result.add(true);
            else
                result.add(false);
        }

        return result;
    }
}
