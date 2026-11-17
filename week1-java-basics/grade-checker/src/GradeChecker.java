import java.util.Scanner;

class GradeChecker{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks (0 - 100) : ");
        int marks = sc.nextInt();

        if(marks >= 90){
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
        sc.close();
    }
}