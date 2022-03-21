package week7;

import java.util.Scanner;

public class Programme16 {
    char ch;

       public void identifyNumber(char ch){
           if(ch == '-'){
               System.out.println("Negative Number:");
           }else if (ch != '-' && ch != '0'){
               System.out.println("Positive Number: ");
           } else {
               System.out.println("zero Number: ");
           }

       }
    public static void main(String[] args) {
        Programme16 obj = new Programme16();
        Scanner input = new Scanner(System.in);
        System.out.println("Check Number:");
        obj.ch = input.next().charAt(0);
        obj.identifyNumber(obj.ch);


    }
}
