package ejemplofor3.pkg4; 
public class EjemploFor34 {

    /**
     * Programa que imrpima en forma tabular todos los numeros impares 
     * su cuadrado y su cubo en rango de 1000 a 2000
     */
    public static void main(String[] args) {
    
       double a,b; 
        System.out.printf("\tNumeros impares \tAl cuadrado\tAl cubo\n");
       for(int num=1000;num<=2000;num++){
       if (num%2==1){
       a = Math.pow(num,2);
       b = Math.pow(num,3);
        System.out.printf("\t"+num+"             \t"+(long)a+"\t  "
        + "      "+(long)b+"\n");          

       }
       }
    }
    
}
