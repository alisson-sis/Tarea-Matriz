package co.edu.uniquindio.poo;

public class Espiral {
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        int espiral[][] = EspiralMatriz(matriz);
        mostrarMensaje(espiral);
    }

    //i=columna, por cada accion debo mirar su ubicacion para darle iinicio y fin
    public static int[][] EspiralMatriz(int matriz[][]) {
        int n = 5;
        int inicio = 0;
        int nlimite = n - 1;
        int contador = 1;
        while (inicio <= nlimite) {
//izquierda a derecha
            for (int i = inicio; i <= nlimite; i++) {
                matriz[inicio][i] = contador++;
            }

            //arriba a abajo
            for (int i = inicio + 1; i <= nlimite; i++) {
                matriz[i][nlimite] = contador++;
            }
            //derecha a izquierrda
            for (int i = nlimite - 1; i >= inicio; i--) {
                matriz[nlimite][i] = contador++;
            }
            //abajo a arriba
            for (int i = nlimite - 1; i >= inicio + 1; i--) {
                matriz[i][inicio] = contador++;
            }
            //rehacerlo pero mas pequeño
            inicio = inicio + 1;
            nlimite = nlimite - 1;
        }
        return matriz;
    }
    public static void mostrarMensaje(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
            }
        }
    }




