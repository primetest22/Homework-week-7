package week7;
//7. Write a java program input sales id, seller's name, sales amount, and salary basic
// and then fined this sales
//Commission Sales amount >= 50,000 35%
// Sales amount >= 30,000 20%
// >= 20,000 10%
// >= 10,000 5%
// < 10,000 2%

import java.util.Scanner;

public class Programme7 {

    static double id,amount,salary,commission;
    static String name;
    public static void saleDetails(){
      // Programme7 obj = new Programme7();

        System.out.println("Sale id "+ id);
        System.out.println("Seller Name " + name);
        System.out.println("Sale amount " + amount);
        System.out.println("Basic Salary " +salary);
    }

    public static void salesCommission() {

        if(amount >= 50000){
            commission = (amount * 35)/100;
            System.out.println("Sales commission for over 50000 is:" + commission);
        } else if (amount >=30000 && amount< 50000) {
            commission = (amount * 20) / 100;
            System.out.println("Sales commission for over 30000 is:" + commission);
        } else if (amount >=20000 && amount< 30000) {
            commission = (amount * 10) / 100;
            System.out.println("Sales commission for over 20000 is:" + commission);
        } else if (amount >=10000 && amount< 20000) {
            commission = (amount * 5) / 100;
            System.out.println("Sales commission for over 10000 is:" + commission);
        } else {
            commission = (amount * 2) / 100;
            System.out.println("Sales commission for under 10000 is:" + commission);
        }

        }


    public static void main(String[] args) {
       // Programme7 obj = new Programme7();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter id");
        id = s.nextInt();
        System.out.println("Enter name");
        name = s.next();
        System.out.println("Enter amount");
        amount = s.nextInt();
        System.out.println("Enter salary");
        salary = s.nextInt();

        saleDetails();
        salesCommission();
    }
}
