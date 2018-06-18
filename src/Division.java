import java.util.Scanner;

class Division {
    public static void main(String[] args) {

        int a, b, result = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");

        a = input.nextInt();
        b = input.nextInt();

        try {
            result = a / b;
            System.out.println("Result = " + result);
        }
        catch (Exception e)
        {
            System.out.println("We cannot divide by 0");
        }
        finally {
            System.out.println("finally block will execute.");
        }

    }
}