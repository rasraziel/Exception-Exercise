/*Define a new exception, called ExceptionLineTooLong, that prints out the error message "The strings is too long". 
Write a program that reads all lines of a file and throws an exception of type ExceptionLineTooLong 
in the case where a string of the file is longer than 30 characters. 
Handle also all exceptions that could be thrown by the program.
*/
import java.io.*;
import java.util.*;

public class Exercise1 {
    public static void main(String[] args) throws IOException{
    Scanner myFile = new Scanner(new File("tolstoy.txt"));
      while (myFile.hasNextLine()){
         try{
            String myStr = myFile.nextLine();
            if(myStr.length() > 30) {
               throw new ExceptionLineTooLong();
            } else {
               throw new ExceptionLineTooSmall();
            }
         }catch(ExceptionLineTooLong e){
            System.out.println(e.getMessage());
         }catch(ExceptionLineTooSmall e){
            System.out.println(e.getMessage());
         }
      }
   }
}
