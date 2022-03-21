package week7;

import java.util.Scanner;

public class Programme9 {

        String cityName;

        public String cityName(String city) {
            this.cityName = city;

            switch (this.cityName) {
                case "A":
                    System.out.println("AHMEDABAD");
                    break;
                case "B":
                    System.out.println("BARODA");
                    break;
                case "C":
                    System.out.println("COCHIN");
                    break;
                case "D":
                    System.out.println("DARJILING");
                    break;
                case "E":
                    System.out.println("ELLORA");
                    break;
                case "F":
                    System.out.println("FORT GOA");
                    break;
                default:
                    System.out.println("Enter valid input:");
            }
            return cityName;
        }

        public static void main(String[] args) {
            week7.Programme8 obj = new week7.Programme8();

            Scanner s = new Scanner(System.in);
            System.out.println(("Enter Alphabet: "));
            obj.cityName = s.nextLine();

            obj.cityName(obj.cityName);
        }

    }


