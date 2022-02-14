package ejemplofor3.pkg3;
public class EjemploFor33 {

    public static void main(String[] args) {
      int renIni=1;
      int renFin=6;
      int colIni=5;
      
      for(int i=renIni; i<=renFin; i++)
      {
      for(int j=1;j<=colIni;j++)
          System.out.print("*");
          colIni++;
          System.out.println("");
      }
   
    }
    
}
