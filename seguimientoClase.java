package co.edu.uniquindio.poo;
// Tarea #1-2:
public class seguimientoClase {
    public static void main(String[] args) {
        int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int imprimir = imprimirMatriz(matriz);
        mostrarMensaje(imprimir);
    }

    public static int imprimirMatriz(int matriz[][]){
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
                contador++;

            }
            System.out.println();
        }
        return contador;
    }
    public static void mostrarMensaje(int imprimir){
        System.out.println(imprimir);
    }
}
