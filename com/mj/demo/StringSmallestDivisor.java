package com.mj.demo;

import org.junit.Test;

public class StringSmallestDivisor {
    @Test
    public void testRun(){
        System.out.println("Divisor is : "+gcdOfStrings("acdacd","acdacd"));
    }
    public String gcdOfStrings(String str1, String str2) {
        if(str1.isEmpty() || str2.isEmpty() || str1.length() >999 || str2.length() > 999){
            return "";
        }
        char startingChar = str1.charAt(0);
        StringBuilder substring = new StringBuilder().append(str1.charAt(0));
        int i = 1;
        while(i<str1.length()){
            if(str2.length()<i)
                return "";
            if (str1.substring(0,i).equals(str2.substring(0,i))){
                System.out.println(substring);
                if(str1.charAt(i) == startingChar){
                    if(isSubSet(str1,str2,str1.substring(0,i)))
                    {
                        return str1.substring(0,i);
                    } else {
                        substring.append(str1.charAt(i));
                        i++;
                    }

                } else {
                    substring.append(str1.charAt(i));
                    i++;
                }
            } else {
                return "";
            }
        }
        if (str1.equals(str2))
            return str1;
        return "";
    }

    public boolean isSubSet(String str1, String str2, String substring){
        int sublength = substring.length();
        int i,j;
        for(i = 0; i < str1.length()/sublength ; i++){
            if(!str1.substring(sublength*i, sublength*(i+1)).equals(substring))
                return false;
        }
        for (j = 0; j < str2.length()/sublength; j++){
            if(!str2.substring(sublength*j, sublength*(j+1)).equals(substring))
                return false;
        }
        if(i*sublength != str1.length() || j*sublength != str2.length()) {
            return false;
        }
        return true;
    }

}
