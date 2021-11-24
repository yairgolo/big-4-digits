package com.yair.model;

import java.util.Arrays;

public class SearchDigits {
    public static void searchTheBigDigits(int[] arr){
        int a = Arrays.stream(arr).min().getAsInt();
        int b = Arrays.stream(arr).min().getAsInt();
        int c = Arrays.stream(arr).min().getAsInt();
        int d = Arrays.stream(arr).min().getAsInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= d){
                a = b;
                b = c;
                c = d;
                d = arr[i];
            } else if (arr[i] >= c){
                a = b;
                b = c;
                c = arr[i];
            } else if (arr[i] >= b){
                a = b;
                b = arr[i];
            } else if (arr[i] >= a){
                a = arr[i];
            }
        }
        System.out.println(d + "" + c + "" + b + "" + a);
    }
}
