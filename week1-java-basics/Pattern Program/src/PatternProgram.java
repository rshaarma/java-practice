class PatternProgram{
     public static void main(String...args){
          String str = "*";

         for(int i = 1; i <= 5; i++){
              for (int j = 1; j<=i; j++){
                  System.out.print(str);
              }
             System.out.println();
         }
     }
}