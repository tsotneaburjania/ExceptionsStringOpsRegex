package ge.tbc.testautomation.exceptions;

import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws LimitException {
//        System.out.println(10/0); // ისვრის ArithmeticExceptions
//        Throwable throwable = new Throwable(); // სროლვადი Throwable არის უბრალო ობიექტი, თუ მას არ ვისვრით

        // მომხმარებლისგან ვითხოვთ მონაცემის შეტანას (10-ჯერ)
        int x = 0;
        while (x < 10){
            String userInput = new Scanner(System.in).next();
            double result = division(10, Integer.parseInt(userInput));
            System.out.println(result);
            x++;
        }

        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(2);
        Circle circle3 = new Circle(2);
        Circle circle4 = new Circle(2);
//        Circle circle5 = new Circle(2); // მეხუთე ობიექტი ვეღარ შეიქმნება, ლიმიტია 4.

    }

    /* ამ ფუნქციაში გამოსროლილ ექსეფშენებს ვიჭერთ
    * ამიტომ პროგრამა ჩვეულებრივად აგრძელებს ეგზეკუციას */
    public static double division(double a, double b){
        try {
            if (b == 0){
                throw new ArithmeticException();
            }
            else {
                return a / b;
            }
        } catch (ArithmeticException runtimeException){
            b = 1;
            return division(a, b);
        }
        finally {
            System.out.println("I EXECUTE ALWAYS");
        }
    }
}
