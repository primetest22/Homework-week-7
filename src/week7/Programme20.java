package week7;

import java.util.Scanner;

public class Programme20 {
    public static void main(String[] args) {
        int b;
        int a[] = {14, 25, 17, 18, 100, 5000};

        Scanner s = new Scanner(System.in);
        System.out.println("Enter input");
        b = s.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (b == a[i]) {
                System.out.println("Matching from Array:");
                break;
            } //else {System.out.println("Entered input not from Array:");}

        }
        System.out.println("Entered input not from Array:");

    }

    }

