package week7;

import java.util.Scanner;

//Input any alphabet from “A" to “F” and print their city name accordingly
// (use if else) if any other alphabet should be invalid entry
public class Programme8 {
    String cityName;
    public String cityName(String city){
        this.cityName = city;

        if(this.cityName.equals("A")){
            System.out.println("AHMEDABAD");
        } else if(this.cityName.equals("B")) {
            System.out.println("BARODA");
        }else if(this.cityName.equals("C")) {
            System.out.println("COCHIN");
        }else if(this.cityName.equals("D")) {
            System.out.println("DEHRADUN");
        }else if(this.cityName.equals("E")) {
            System.out.println("ELLORA");
        }else if(this.cityName.equals("F")) {
            System.out.println("FORT");
        }
        else {
            System.out.println("Not valid input :");
        }
        return cityName;
    }
    public static void main(String[] args) {
        Programme8 obj = new Programme8();

        Scanner s = new Scanner(System.in);
        System.out.println(("Enter Alphabet: "));
        obj.cityName = s.nextLine();

        obj.cityName(obj.cityName);
    }
}
