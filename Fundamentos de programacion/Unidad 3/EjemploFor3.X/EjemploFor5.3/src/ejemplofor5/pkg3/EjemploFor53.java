package ejemplofor5.pkg3;
public class EjemploFor53 {
    public static void main(String[] args) {
 // a
    int suma=0;
      for (int cuenta=1;cuenta<=90;cuenta++)
          if (cuenta%2==1)
          {
          suma=suma+cuenta;
          }   
        System.out.println("Suma = "+suma);

 //b       
 double val=2.5, b;
 b = Math.pow(val,3);
        System.out.println("valor = "+b);

//c 
int i=1;
while(i<=20){
System.out.println(i);
if(i%5==0)
System.out.println();
else 
System.out.println("\t");
i++;
}

//d 

for(i=1;1<=20;i++){
System.out.println(i);
if(i%5==0)
System.out.println();    
else
System.out.println("\t");
}




}     
}
    


