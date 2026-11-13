package week1;

import java.util.Scanner;

public class UserInputExample {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        String ageStr = sc.nextLine();

        int age = Integer.parseInt(ageStr);
        System.out.println("Next year your age will be: " + (age + 1));
        sc.close();
    }
}
