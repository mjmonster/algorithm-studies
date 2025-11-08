package com.mj.demo;

public class MergeStringsAlternatively {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        if(checkNull(word1))
            return word2;
        if(checkNull(word2))
            return word1;
        int i = word1.length();
        int j = word2.length();
        int bigger = Math.max(i, j);
        for(int k = 0; k < bigger; k++){
            if(k<i)
                merged.append(word1.charAt(k));
            if(k<j)
                merged.append(word2.charAt(k));
        }

        return merged.toString();
    }

    public boolean checkNull(String str){
        return null == str || str.trim().isEmpty();
    }
}
