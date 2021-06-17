package src.clientes;
import src.tienda.*;
/**
 * Clase que gestione el vector de clientes
 */
public class VectorClientes {
    /**
     * Vector de clientes y variable entera para posicion
     */
    private Cliente[] clientes = new Cliente[50];
    private int siguienteCodigo;

    /**
     * Constructor por defecto
     */
    public VectorClientes(){
        siguienteCodigo = 1;
    }

    /**
     * Metodo para agregar clientes en el sistema
     * @param nombre
     * @param telefono
     */
    public void agregarCliente(String nombre, int telefono){
        if (siguienteCodigo > 50){
            System.out.println("Límite de clientes alcanzado");
        }
        else{
            clientes[(siguienteCodigo-1)] = new Cliente(siguienteCodigo, nombre, telefono);
        }
        siguienteCodigo++;
    }

    /**
     * Metodo que solo efectua el llamado a agregar cliente
     */
    public void agregarCliente(){
        String nombre = IngresoDatos.getTexto("Ingrese el nombre del cliente: ");
        int telefono = IngresoDatos.getEntero("Ingrese el número de telefono: ", false);
        agregarCliente(nombre, telefono);
    }

    /**
     * Metodo para mostrar clientes en el sistema
     */
    public void mostrarClientes(){
        System.out.println("\n\n Clientes de memorabilia");
        for (int i = 0; i < (siguienteCodigo-1); i++) {
            System.out.println("-"+(i+1)+") "+clientes[i].getInformacion());
            
        }

        System.out.println("\n\n");
    }

    /**
     * Metodo de ordenamiento burbuja para poder mostrar el arreglo de forma ascendente o descendente
     * @param ascendente
     */
    public void ordenarPorNombre(boolean ascendente){
        boolean cambio = true;

        for (int i = 1; i < (siguienteCodigo-1); i++) {
            for (int j = 0; j < (siguienteCodigo-1-i); j++) {
                //  String.compareTo(String)
                //   [-oo , + oo]
                if (ascendente)
                    cambio= (clientes[j].getNombre().compareTo(clientes[j+1].getNombre()) > 0 );
                else 
                    cambio= (clientes[j].getNombre().compareTo(clientes[j+1].getNombre()) < 0 );

                if(cambio ){
                    //clientes i va antes que clientes j <0 descendente
                    Cliente aux = clientes[j];
                    clientes[j] = clientes[j+1];
                    clientes[j+1]= aux;
                }
            }
        }

    }


    
}
