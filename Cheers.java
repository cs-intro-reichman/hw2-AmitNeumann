// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
         String name=args[0],specialLetters="AEFHILMNORSX";
         char chr,chrS;
         boolean isLike;
         int rows=Integer.parseInt(args[1]);
         name=name.toUpperCase();
         for(int i=0; i<name.length();i++) { // going over letters of name
                chr=name.charAt(i);
                isLike=false;
                for(int j=0;j<specialLetters.length();j++) { // בודקת אות מהמילה מול כל אות אסורה
                        if (chr==specialLetters.charAt(j))
                                isLike=true;
                }  if (isLike) {
                        System.out.println("Give me an "+chr+": "+chr+"!");
                } else {
                        System.out.println("Give me a "+chr+": "+chr+"!");
                }
           } System.out.println("What does that spell?");
           for (int k=0;k<rows;k++) {
                System.out.println(name+" ! ! !");
           }

         }
        
 }
        
        
        
       