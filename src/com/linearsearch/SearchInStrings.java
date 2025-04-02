package com.linearsearch;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Abhijeet";
        char target = 'j';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name, target));
    }

    static boolean search(String name, char target){
        if(name.isEmpty()){
            return false;
        }

        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
