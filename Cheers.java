// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
         String name=args[0],specialLetters="AEFHILMNORSX",finalName="";
         int rows=Integer.parseInt(args[1]);
         name=name.toUpperCase();
         for (int i=0;i<name.length();i++) {
              if(Character.isLetter(name.charAt(i))){
                if(specialLetters.indexOf(name.charAt(i))==-1){ 
                        System.out.println("Give me a  " + name.charAt(i) + ": " + name.charAt(i) + "!");
                      } else {
                         System.out.println("Give me an  " + name.charAt(i) + ": " + name.charAt(i) + "!");     
                         } 
                finalName+=name.charAt(i);              
              }
         } System.out.println("What does that spell?");
         finalName=finalName.toUpperCase();
         for (int j=0;j<rows;j++) {
                System.out.println(finalName+"!!!");
         }
   }
        
 }

       
        
       