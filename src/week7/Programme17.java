package week7;

import java.util.Arrays;

public class Programme17 {
    public static void main(String[] args) {

        int a [] = {4,5,8,6,2,9};
        String b [] = {"Paris", "London", "Tokyo"};

        System.out.println("Before sorting arrays a and b:");
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]); }

        for(int j=0; j<b.length; j++){
            System.out.println(b[j]);
        }
        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println("After sorting arrays a and b:");
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]); }

        for(int j=0; j<b.length; j++){
            System.out.println(b[j]);
        }
    }
}
