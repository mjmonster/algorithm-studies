package com.mj.demo;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseStringVowels {

    @Test
    public void test(){
        System.out.println(reverseVowels("Ice Cream"));
    }

    Set<String> vowel = Set.of("a","e","i","o","u");

    public String reverseVowels(String s) {
        String[] charArr = s.split("");
        List<String> strList = Arrays.asList(charArr);
        List<Character> vowels = new ArrayList<>();
        List<Integer> position = new ArrayList();
        for (int i = 0; i < s.length() ; i ++){
            if (checkForVowel(String.valueOf(s.charAt(i)))){
                vowels.add(s.charAt(i));
                position.add(i);
            }
        }
        ListIterator<Integer> listIterator = position.listIterator();

        Collections.reverse(vowels);
        for(char vowel: vowels){
            strList.set(listIterator.next(), String.valueOf(vowel));
        }

        return String.join("", strList);
    }

    public boolean checkForVowel(String c){
        return vowel.contains(c.toLowerCase());
    }
}
