package homework_day02;

import java.util.Random;

public class Test4 {
    Random r=new Random();

    int i=r.nextInt();
    double a= Math.random();

    public static void main(String[] args) {
        Test4 t=new Test4();

        System.out.println(t.a);
    }
}
