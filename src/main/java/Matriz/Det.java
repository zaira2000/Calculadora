/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz;

/**
 *
 * @author duvan
 */
public class Det {
        static void cofactor(int mat1[][],int temp[][],int tamaño,int p, int q){
         int i=0,j=0;
            for (int fila = 0; fila < tamaño; fila++) {
                for (int columna = 0; columna < tamaño; columna++) {
                    if (fila != p && columna != q) {
                        temp[i][j++]=mat1[fila][columna];
                        if (j ==tamaño-1) {
                            j=0;
                            i++;
                        }
                    }
                    
                }
            }
    }
    static int determinanteMatriz(int mat1[][], int tamaño){
        int determinante=0;
        if (tamaño==1) {
            return mat1[0][0];
        }
        int temp[][]=new int [tamaño][tamaño];
        int multiplicador=1;
        for (int h = 0; h < tamaño; h++) {
            cofactor(mat1,temp,tamaño,0,h);
            determinante += multiplicador*mat1[0][h]*determinanteMatriz(temp,tamaño-1);
            multiplicador= -multiplicador;
        }
        return determinante;
    }
}
