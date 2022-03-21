package week7;

public class Person {
    String firstName, lastName;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String setFirstName(String a) {

        return firstName = a;
    }

    public String setLastName(String b) {

        return lastName = b;
    }

    public int setAge(int c) {
        if (c < 0 || c > 100) {
            return age = 0;
        } return age =c;
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty() || lastName.isEmpty()){
            return firstName;
        } else if (lastName.isEmpty()) {
            return lastName;
        } else {
            return firstName + " " + lastName;

        }

    }


    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

    }


}
