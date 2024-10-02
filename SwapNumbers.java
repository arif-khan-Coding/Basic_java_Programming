import java.util.Scanner;

public class SwapNumbers {
    public static void main(String [] args) {
        SwapNumbers swap = new SwapNumbers();
        swap.swapNumbers();
        swapping();
    }
//1. Method for Swapping Numbers.

    public void swapNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First Number ");
        int num1 = sc.nextInt();
        System.out.print("Enter your Second Number ");
        int num2 = sc.nextInt();

// Swapping using third variable.

        int c = num1;
        num1 = num2;
        num2 = c;

        System.out.println("After Swapping Your Numbers are : ");
        System.out.println(num1);
        System.out.println(num2);
    }

// Swapping without using third variable.

    public static void swapping() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of X = ");
        int X = sc.nextInt();
        System.out.print("Enter Value of Y = ");
        int Y = sc.nextInt();

        X = X+Y;
        Y = X-Y;
        X = X-Y;

        System.out.println("After Swapping of X and Y ");
        System.out.println("X = "+X +" and Y = "+Y);
    }

}
