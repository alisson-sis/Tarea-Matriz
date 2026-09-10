package co.edu.uniquindio.poo;
//tarea#2:sumar una matriz
public class Tarea2 {
    public static void main(String[] args) {
        int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int suma = sumarMatriz(matriz);
        mostrarMensaje(suma);
    }

    public static int sumarMatriz(int matriz[][]) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }

        }
        return suma;
    }
    public static void mostrarMensaje(int suma){
        System.out.println(suma);
    }
}
