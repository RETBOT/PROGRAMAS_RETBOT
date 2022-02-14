package validausuario;
import java.util.Scanner;
public class ValidaUsuario 
{
    public static void main(String[] args) 
    {
     String usoReg = "alumno";
     String PswdReg = "aactiva16";
     
     Scanner entrada = new Scanner(System.in);
     System.out.print("Usuario: ");
     String usuario = entrada.next();
     System .out.print("Password: ");
     
     String pass = entrada.next();
     if(usuario.equals(usoReg))
     if(pass.equals(PswdReg))
     System.out.println("Usuario valido");
     else System.out.println("Usuario no valido");
     
     else System.out.println("Usuario no valido");
    }
}
