package com.mj.demo;

import org.junit.Test;

import java.util.Arrays;

public class PlantNewFlowers {

    @Test
    public void test(){
        int[] flowerbed = new int[]{0};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));
        System.out.println(Arrays.toString(flowerbed));
    }
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int maxPlant = 0;
        for(int i = 0 ; i < flowerbed.length ; i++){
            if (flowerbed[i] == 1)
                //occupied slot
                continue;
            else {
                //empty slot, need to check prev & next if vacant
               if (emptyNext(flowerbed, i) && emptyPrev(flowerbed, i)) {
                   flowerbed[i] = 2;
                   maxPlant++;
               }
            }
        }
        return maxPlant >= n;
    }

    public boolean emptyPrev(int[] flowerbed, int i){
        if (i == 0)
            return true;
        return flowerbed[i-1]==0;
    }
    public boolean emptyNext(int[] flowerbed, int i){
        if (i == flowerbed.length-1)
            return true;
        return flowerbed[i+1]==0;
    }
}
