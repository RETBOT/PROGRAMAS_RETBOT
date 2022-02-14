/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmatriz;

/**
 *
 * @author admin
 */
public class Matriz {
    
    public static int [] nones(int mat[][]){
    int non [] = new int[mat.length];
        
     for(int r=0;r<mat.length;r++)
            for(int c=0;c<mat[0].length;c++)
                if(mat[r][c]%2!=0)
                   non[r]++;
     return non;
    }
    
    public static int [] pares(int mat[][]){
     int [] par = new int[mat[0].length];
        
    for(int c=0;c<mat[0].length;c++)
               for(int r=0;r<mat.length;r++)
                   if(mat[r][c]%2==0)
                      par[c]++;
     return par;
    }
    
    public static double promDP(int mat[][]){
        double prom=0;
        if(mat.length==mat[0].length){
            for(int i=0;i<mat.length;i++)
                prom+=mat[i][i];
        
        return prom/=mat.length;
        }
        return -1;
    }
 
    public static double promDI(int mat[][]){
        double prom=0;
        if(mat.length==mat[0].length){
            for(int i=mat[0].length-1,j=0; i>=0; i--,j++)
                prom+=mat[i][j];
            
            return prom/=mat.length;
        }
        return -1;
    }
    
    public static int[][] transponer(int [][] mat){
        int[][] tran = new int[mat[0].length][mat.length];
    
        for(int r=0;r<mat.length;r++)
           for(int c=0;c<mat[0].length;c++)
            tran[c][r] = mat[r][c];
    
    return tran;
    }
    
    public static int [][] multiplicar(int matA[][], int matB[][]){
        
        int matC [][] = new int[matA.length][matB[0].length];
        
        if(matA[0].length==matB.length){
        for(int r=0;r<matA.length;r++){
            for(int c=0;c<matB[0].length;c++){
                matC[r][c]=0;
                for(int k=0;k<matB[0].length;k++)
                    matC[r][c] = matC[r][c] + matA[r][k]*matB[k][c];
                    }
                }
            }
        return matC;
        }
        
    }

