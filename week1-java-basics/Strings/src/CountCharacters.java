public class CountCharacters {
    static void main(String...args){
        String text = "Java is fun";
        int count = 0;

        for (int i = 0; i <= text.length() - 1; i++){
            if(text.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
