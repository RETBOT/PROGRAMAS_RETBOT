package preypostinc;
public class PreyPostInc 
{
    public static void main(String[] args) 
    {
     /*
     Prueba de pre-incremento
     ++i
     */      
       int i=2;
       int op = 2*++i;
      System.out.println("i= "+i+" "+op );
        
     /*
      prueba del post-incremento
     j++
      */
     int j=2;
     op = 2*j++;
     System.out.println("j= "+j+" "+op);
     
     
     /*
     Notacion simple de x = x+3 es x+=3
     */ 
     int x=1;
        System.out.println("x+=3 : "+(x+=3));
    
        // y = y*5
    int y=3; 
        System.out.println("y*=5 : "+(y*=5));
    
    }
    }
