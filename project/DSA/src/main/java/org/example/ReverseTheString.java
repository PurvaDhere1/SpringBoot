package org.example;

import java.util.ArrayList;

public class ReverseTheString {

    public static void main(String[] args) {
        String str = "purvadhere";
        int left = 0;
        char[] arr = str.toCharArray();
        int right = arr.length-1;

        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(arr));
    }
}
