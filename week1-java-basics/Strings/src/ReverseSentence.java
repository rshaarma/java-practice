public class ReverseSentence {
    static void main(String...args) {
    String text = "Hello World";
    String str = "";

    for (int i = text.length() -1; i >= 0; i--){
        str = str + text.charAt(i);
    }
        System.out.println(str);

    }
}
