import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        System.out.print("Enter Number to display on screen = ");
       InputFromUser input = new InputFromUser();
        System.out.println("Your Entered number is :- "+input.getInput());
    }

//Method of get input from user

    public int getInput() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }
}