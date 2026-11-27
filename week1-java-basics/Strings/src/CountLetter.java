public class CountLetter {
    static void main(String...args){
        String text = "programming";
        int count = 0;

        for (int i = 0; i <= text.length() -1; i++){
            if (text.charAt(i) == 'm'){
                count++;
            }
        }
        System.out.println(count);
    }
}
