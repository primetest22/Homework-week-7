package week7;

import java.util.Scanner;

public class Programme5 {
    static double num, salary, hra, da, ta, pf, grossSalary;
    static String name1;

    public static void salary() {
        System.out.println(" ______________________________ ");
        System.out.println("|         Salary Slip          |");
        System.out.println("|______________________________|");
    }

    public static void idName() {

        System.out.println("|      Employee Id :" + num + "  |");
        System.out.println("|      Employee Name :" + name1 + " |");
        System.out.println("|_______________________________|");
    }

    public static void salaryAndDeduction() {
        System.out.println("|   Basic Salary :" + salary + "    |");
        System.out.println("|   HRA 10%      :" + hra + "       |");
        System.out.println("|   TA 8%        :" + ta + "        |");
        System.out.println("|   DA 9%        :" + da + "        |");
        System.out.println("|   PF - 20&     :" + pf + "        | ");
        System.out.println("|_______________________________|");

    }

    public static void grossSalary() {
        System.out.println("|  Gross Salary :" + grossSalary + "|");
        System.out.println("|                               |");
        System.out.println("|===============================|");
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter ID:");
        num = s.nextInt();
        System.out.println("Enter name:");
        name1 = s.next();
        System.out.println("Enter basic salary");
        salary = s.nextInt();

        hra = (salary * 10) / 100;

        ta = (salary * 8) / 100;

        da = (salary * 9) / 100;

        pf = (salary * 20) / 100;
        grossSalary = salary + hra + ta + da + pf;


        salary();
        idName();
        salaryAndDeduction();
        grossSalary();
    }
}


