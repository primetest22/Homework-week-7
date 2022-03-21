package week7;

public class Programme19 {

    public static void main(String[] args) {
        int sum =0;
        double avg;
        int x[] = {10, 30, 40, 50, 90};

        for (int i = 0; i < x.length; i++) {

        sum = sum + x[i];
            //System.out.println(sum);

        }
        avg = sum/x.length;
        System.out.println(avg);
    }
}
