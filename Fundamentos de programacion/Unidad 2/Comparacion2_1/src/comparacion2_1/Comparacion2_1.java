package comparacion2_1;
import java.io.IOException;
public class Comparacion2_1 
{
    public static void main(String[] args) throws IOException {
        char car;
        
        System.out.println("Teclee una letra");
        car = (char) System.in.read();
        
        if (car>='A'&&car<='Z')
        {
        System.out.println(car+", es una letra mayuscula");
        }   
        else
        {
        System.out.println(car+", no es una letra mayuscula");
        }    
    }
    
}
