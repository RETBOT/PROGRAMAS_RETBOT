/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appexeregular1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author admin
 */
public class AppExeRegular1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // String to be scanned to find the pattern.
     String line = "This order was placed for QT3000! OK?";
      String pattern = "(.*)(\\d+)(.*)";
     //String pattern = "((\\d+)?)";

      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(line);
      if (m.find( )) {
         System.out.println("Found value: " + m.group(0) );
         System.out.println("Found value: " + m.group(1) );
         System.out.println("Found value: " + m.group(2) );
      }else {
         System.out.println("NO MATCH");
      }
    }
    
}
