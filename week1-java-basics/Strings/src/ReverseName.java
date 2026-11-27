public class ReverseName {
    static void main(String...args){
        String name = "Rohit";
        String str = "";

        for (int i = name.length() - 1; i >= 0; i--){
            str = str + name.charAt(i);
        }
        System.out.println(str);
    }
}
