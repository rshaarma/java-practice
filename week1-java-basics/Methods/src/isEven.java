public class isEven {
    static boolean isEvenMethod(int a){
        return a % 2 == 0;
    }
    static void main(String...args){
        boolean num = isEvenMethod(5);
        System.out.println(num);
    }
}
