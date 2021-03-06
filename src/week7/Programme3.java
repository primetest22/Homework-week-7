package week7;

//Write a java program to input student Name, roll No,
// and three subjects Math, Science and English marks (marks is between 0 to 100
// and if it is out of range print error message “Invalid Input, Marks should between 0 to 100”)
// and find out total, percentage and result.
//If he is pass or fail on basis of percentage (pass>=35)
// and also give them grade if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C
// And print Mark Sheet in following format

import java.util.Scanner;

public class Programme3 {
    static String name;
    static double number, marks, marks1, marks2, total, percentage;
    //static double percentage;

    public static void markSheet() {
        System.out.println(" ________________________________ ");
        System.out.println("|                                |");
        System.out.println("|         Mark Sheet             |");
        System.out.println("|________________________________|");
    }

    public static void nameAndRoll() {


        System.out.println("|         Name    :       "+name+"| ");
        System.out.println("|         Roll No :     "+number+"| ");
        System.out.println("|_________________________________|");
    }

    public static void subjectMark() {
        System.out.println("|         Subjects : Marks        |");
        System.out.println("|_________________________________|");
        System.out.println("|         Math     : "+marks+"    |");
        System.out.println("|         Science  : "+marks1+"   |");
        System.out.println("|         English  : "+marks2+"   |");
        System.out.println("|_________________________________|");
    }

    public static void total() {
        System.out.println("|         Total :" + total + "   |");
        System.out.println("|______________________________|");
    }

    public static void finalResult() {
        System.out.println("|         Percentage :" + percentage + "  |");

        if (percentage >= 35) {
            System.out.println("|         Result     : Pass        |");
        } else {
            System.out.println("|         Result     : Fail        |");
        }
        if (percentage >= 80) {
            System.out.println("|         Grade :       A+       |");
        } else if (percentage >= 60) {
            System.out.println("|         Grade :    A          |");
        } else if (percentage >= 50) {
            System.out.println("|         Grade :    b          |");
        } else {
            System.out.println("|         Grade :    C         |");
        }

        System.out.println("|_______________________________");
}
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Student name");
        name =s.nextLine();
        System.out.println("Enter roll no:");
        number = s.nextInt();

        System.out.println("Enter Marks For Math:");
        marks = s.nextInt();
        if(marks<0 || marks>100){
            System.out.println("“Invalid Input, Marks should between 0 to 100");
        }
        System.out.println("Enter Marks For Science:");
        marks1 = s.nextInt();
        if(marks1<0 || marks1>100){
            System.out.println("“Invalid Input, Marks should between 0 to 100");
        }
        System.out.println("Enter Marks For English:");
        marks2 = s.nextInt();
        if(marks2<0 || marks2>100){
            System.out.println("“Invalid Input, Marks should between 0 to 100");
        }
        total = marks + marks1 + marks2;
        percentage = ((total/300)*100);


        markSheet();
        nameAndRoll();
        subjectMark();
        total();
        finalResult();
    }
}
