import java.util.Scanner;

class numberSignChecker{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        
        if(number == 0){
            System.out.println("Number is Zero");
        } else if (number > 0) {
            System.out.println("Number is a positive number");
        }else{
            System.out.println("Number is a negative number");
        }
        sc.close();
    }
}
