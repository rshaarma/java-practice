import java.util.Scanner;

class ReverseANumber{
    public static void main(String ...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int numInput = sc.nextInt(); //1234
        int reverseNumber = 0;

        while(numInput > 0){
            reverseNumber = numInput % 10; // 4
            numInput /= 10;
            System.out.print(reverseNumber);
        }
    }
}
