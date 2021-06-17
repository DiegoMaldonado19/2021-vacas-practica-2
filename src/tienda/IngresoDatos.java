package src.tienda;
import java.util.*;
/**
 * Clase ingreso de datos para parametrizar el ingreso de datos
 */
public class IngresoDatos {
    /**
     * Objeto scanner para poder leer datos desde consola
     */
    static Scanner scanner = new Scanner(System.in);

    /**
     * Metodo para imprimir un mensaje desde consola
     * @param mensaje
     */
    private static void imprimirMensaje(String mensaje){
        System.out.print("\n"+mensaje+" ");
    }

    /**
     * Metodo para pedir un numero entero desde consola, almacenarlo y posteriormente retornarlo
     * @param mensaje
     * @param negativo
     * @return
     */
    public static int getEntero(String mensaje, boolean negativo){
        imprimirMensaje(mensaje);
        int tmp = scanner.nextInt();
        scanner.nextLine();

        if( negativo ){
            return tmp;
        }

        if (tmp<0){
            do{
                imprimirMensaje("\n\n No puede ingresar números negativos\n");
                imprimirMensaje(mensaje);
                tmp = scanner.nextInt();
            } while(tmp<0);
        }

        return tmp;
    }

    /**
     * Metodo para pedir una cadena en consola, almacenarla y luego retornarla
     * @param mensaje
     * @return
     */
    public static String getTexto(String mensaje){
        imprimirMensaje(mensaje);
        String res = scanner.nextLine();
        return res;
    }
    
}
