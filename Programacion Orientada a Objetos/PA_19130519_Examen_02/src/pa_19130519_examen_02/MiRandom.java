/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_19130519_examen_02;

import java.util.Random;

/**
 *
 * @author admin
 */
public class MiRandom extends Random {

    private String[] nom = {"Juan","Luis","Pedro","Laura","Diana","Patricia",
        "Fernanda","Natalia","Ulises","Jorge","Javier","Marina","Silvia","Karla",
        "Martha","Jose","Raul","Luis","Jesus","Roberto","Pablo","Julio","Abril",
        "Cielo","Angelica","Mateo","Daniel","Pablo","Álvaro","Adrián","David",
        "Diego","Javier","Mario","Sergio","Marcos","Manuel","Martin","Nicolas",
        "Jorge","Iván","Carlos","Miguel","Lucas"}; 
     
    private String[] ape = {"Lopez","Perez","Ruiz","Rangel","Salazar","Gonzales", 
        "Martinez","Montes","Gomez","Hernandez","Mendez","Vazquez","Santoyo",
        "Ramirez","Fernandez","Garcia","Luevanos","Palacios","Esquivel",
        "Troncoso","Canales","Acosta","Romo","Carillo","Gonzalez","Rodriguez",
        "Martinez","Sanches","Alvarez","Dias","Ruiz","Gutierrez","Blanco",
        "Jimenez","Moreno","Muñoz","Gil","Ramos","Romero","Torres","Iglesias",
        "Navarro","Rubio","Serrano","Santos","Delgado","Sanz"}; 

    public MiRandom() {
        super(); //manda a llamar al constructor del random 
    }

    public MiRandom(int semilla) {
        super(semilla);
    }

    public String nextNombre() {
        return nom[nextInt(nom.length)];
    }

    public String nextApellido() {
        return ape[nextInt(ape.length)];
    }

    public String nextNombreCorto() {
        return nom[nextInt(nom.length)] + " "
                + ape[nextInt(ape.length)];
    }

    public String nextNombreCompleto() {
        return nom[nextInt(nom.length)] + " "
                + ape[nextInt(ape.length)] + " "
                + ape[nextInt(ape.length)];
    }

    public String nextNombreFormal() {
        return ape[nextInt(ape.length)] + " "
                + ape[nextInt(ape.length)] + " "
                + nom[nextInt(nom.length)];
    }
    
    public int nextInt(int ini, int fin){
    return ini+ nextInt(fin-ini+1);
    }
    
    public int nextInt(int ini, int fin,int multiplo){
    return nextInt(ini/multiplo,fin/multiplo)*5;
    }
    
    public double nextInt(int ini, int fin,double multiplo){
    return nextInt((int) (ini/multiplo), (int)(fin/multiplo))*5;
    }    
}
