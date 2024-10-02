
public class CheckEvenOddInt {
    public static void main(String[] args) {
        CheckEvenOddInt res = new CheckEvenOddInt();
        res.checkEvenOdd();
    }
    public void checkEvenOdd (){
        InputFromUser input = new InputFromUser();
        System.out.println("Enter Your Number to Check Even Or Odd.");
        int num = input.getInput();

        if(num % 2 == 0 ){

            System.out.println("Entered Number is Even.");
        }else {
           System.out.println("Your Entered Number are Odd.");
        }

    }

}
