import java.util.Scanner;

public class Test {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
//first task

        float A = -5 + 8 * 6;
        float b = (55 + 9) % 9;
        float c = 20 + -3 * 5 / 8;
        float d = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println(A);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        //second task


        int fn = 125;
        int sn = 24;
        int sum = fn+sn;
        int minus = fn-sn;
        int multiply = fn*sn;
        int divide =fn%sn;
        System.out.println(fn + "+" + sn + "=" + sum);
        System.out.println(fn + "-" + sn + "=" + minus);
        System.out.println(fn + "*" + sn + "=" + multiply);
        System.out.println(fn + "/" + sn + "=" + divide);
        System.out.println(fn + "mod" + sn + "=" + divide);

        //third task

        int  A1 = 8;
        float b1 = 8*2;
        float c1 = 8*3;
        System.out.println(A1+"x"+ "1" + "=" + A1);
        System.out.println(A1+"x"+ "2" + "=" + b1);
        System.out.println(A1+"x"+ "3" + "=" + c1);


        //5th task


        double A2= (25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5);
        System.out.println(A2);



        //6th task

        double A3= 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(A3);




        //7th task
        double R=7.5;
        double P= 2*3.142*R;
        double A4 = 3.142*(7.5*7.5);

        System.out.println("Perimeter is =" + P );
        System.out.println("Area is =" + A4 );

    }
}