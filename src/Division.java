import java.util.Scanner;

class Division {
    public static void main(String[] args) {

        int a, b, result;

        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");

        a = input.nextInt();
        b = input.nextInt();
        while(b==0)
        {
            System.out.println("b should be bigger than 0");
            System.out.println("Input a integer");
            b = input.nextInt();
        }
        result = a / b;

        System.out.println("Result = " + result);
    }
}