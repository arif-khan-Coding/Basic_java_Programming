import java.util.Scanner;

public class LargestBtwThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number = ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd Number = ");
        int num3 = sc.nextInt();

        if((num1 > num2) && (num1 > num3)){
            System.out.println("Your 1st Entered Number are larger .");
        } else if (num2 > num3) {
            System.out.println("Your 2nd Entered Number are larger .");
        }else {
            System.out.println("Your 3rd Entered Number are larger." );
        }
    }
}
