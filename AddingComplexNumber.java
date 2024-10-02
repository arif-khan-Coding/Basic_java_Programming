import java.util.Scanner;

public class AddingComplexNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value Of a = ");
        int a = sc.nextInt();
        System.out.print("Enter value of b = ");
        int bi = sc.nextInt();
        int sumOfComplexNum = ( (a+bi) + (a+bi) );
        System.out.println(sumOfComplexNum);
    }
}
