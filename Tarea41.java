package co.edu.uniquindio.poo;

public class Tarea41 {
        public static void main(String[] args){
            int matriz[][] = new int[3][3];
            int espiral[][] = espiralMatriz(matriz);
            mostrarMensaje(espiral);
        }
        public static int[][] espiralMatriz(int matriz[][]){
            int numero = 1;
            int inicioFila = 0;
            int finalFila = matriz.length - 1;
            int inicioColumna = 0;
            int finalColumna = matriz[0].length - 1;

            while(inicioFila <= finalFila && inicioColumna <= finalColumna){

                for(int j = inicioColumna; j <= finalColumna; j++){
                    matriz[inicioFila][j] = numero;
                    numero++;
                }
                inicioFila++;

                for(int i = inicioFila; i <= finalFila; i++){
                    matriz[i][finalColumna] = numero;
                    numero++;
                }
                finalColumna--;

                for(int j = finalColumna; j >= inicioColumna; j--){
                    matriz[finalFila][j] = numero;
                    numero++;
                }
                finalFila--;

                for(int i = finalFila; i >= inicioFila; i--){
                    matriz[i][inicioColumna] = numero;
                    numero++;
                }
                inicioColumna++;
            }

            return matriz;
        }

        public static void mostrarMensaje(int espiral[][]){
            for(int i = 0; i < espiral.length; i++){
                for(int j = 0; j < espiral[i].length; j++){
                    System.out.print(espiral[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

