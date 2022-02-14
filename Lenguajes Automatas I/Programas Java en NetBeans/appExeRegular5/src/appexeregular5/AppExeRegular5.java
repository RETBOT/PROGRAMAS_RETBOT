/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appexeregular5;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author admin
 */
public class AppExeRegular5 {

    /**
     * @param args the command line arguments
     */
   private static String REGEX = "dog";
   private static String INPUT = "The dog says meow. " + "All dogs say meow.";
   private static String REPLACE = "cat";

   public static void main(String[] args) {
      Pattern p = Pattern.compile(REGEX);
      
      // get a matcher object
      Matcher m = p.matcher(INPUT); 
      INPUT = m.replaceAll(REPLACE);
      System.out.println(INPUT);
   }
    
}
