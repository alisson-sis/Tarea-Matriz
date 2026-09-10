package co.edu.uniquindio.poo;
//tarea#3=Sumar los numeros de la diagonal de una matriz
public class Tarea3 {
    public static void main(String[] args){
        int matriz[][]={{1,2,3}, {4,5,6}, {7,8,9}};
        int diagonal=sumarDiagonal(matriz);
        mostrarMensaje(diagonal);
    }
    public static int sumarDiagonal(int matriz[][]){
        int suma=0;
        for(int i=0; i<matriz.length; i++){
                suma += matriz[i][i];
            }

        return suma;
    }
    public static void mostrarMensaje(int diagonal){
        System.out.println(diagonal);
    }
}
