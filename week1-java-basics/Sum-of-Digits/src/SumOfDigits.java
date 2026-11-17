import java.util.Scanner;

class SumOfDigits{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number greater than 10 : ");
        int number  = sc.nextInt();

        int sum  = 0;
        while(number > 0){
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
}
