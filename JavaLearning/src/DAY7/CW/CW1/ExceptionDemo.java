package DAY7.CW.CW1;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        try {
            System.out.println("Result: " + (num1 / num2));
            String s = null;
            System.out.println(s.length());
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            sc.close();
        }

        try {
            String s2 = "Apple";
            System.out.println(Integer.parseInt(s2));
            int[] array = {1, 2, 3, 4, 5};
            System.out.println(array[5]);
            String s3 = null;
            System.out.println(s3.length());
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Last line of the program");
    }
}
