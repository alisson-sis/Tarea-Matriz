package co.edu.uniquindio.poo;
//saber si hay un numero repetido
public class tarea1 {
    public static void main(String[] args){
        int arreglo[]={1,2,3,4,4,5};
        boolean verificar=verificarNumero(arreglo);
        mostrarMensaje(verificar);
    }
    public static boolean verificarNumero(int[]arreglo){
        boolean bandera=false;
        for(int i=0; i<arreglo.length; i++){
            for(int j=i+1; j<arreglo.length;j++){
                if(arreglo[i]==arreglo[j]){
                    bandera=true;

                }

            }
        }
        return bandera;
    }
    public static void mostrarMensaje(boolean verificar){
       if (verificar){
           System.out.println("SI hay un numero repetido");
       }
       else{
           System.out.println("No hay numeros repetidos");
       }
    }
}
