package src.tienda;
import src.clientes.VectorClientes;
import src.pelicula.VectorPeliculas;

/**
 * Clase que contiene el metodo main y todos los llamados a la logica
 */
public class Principal {

    public static void main(String[] args){
        /**
         * Objeto de la clase principal
         */
        Principal principal = new Principal();
    }

    /**
     * Vectores de clientes y peliculas
     */
    private VectorClientes tablaClientes = new VectorClientes();
    private VectorPeliculas tablaPeliculas = new VectorPeliculas();

    /**
     * Constructor donde se encuentra toda nuestra logica 
     */
    public Principal(){

        /**
         * Mostramos menu mientras menu sea positivo o cero
         */
        int menu = 0;

        while(menu >= 0){
            System.out.println("Bienvenido a memorabilia \n\n");
            System.out.println("1) Ingreso de Clientes");
            System.out.println("2) Mostrar Clientes");
            System.out.println("3) Ordenar Clientes Ascente");
            System.out.println("4) Ordenar Clientes Descendente");
            System.out.println("5) Ingreso de Peliculas");
            System.out.println("6) Mostrar Peliculas");
            System.out.println("7) Ordenar Peliculas Ascendente");
            System.out.println("8) Ordenar Peliculas Descendente");
            System.out.println("9) Prestar Pelicula");
            System.out.println("10) Devolver Pelicula");
            System.out.println("-1) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", true);

            /**
             * Ciclo para desarrollar una logica diferente dependiendo de la opcion
             */
            switch(menu){
                case 1:
                    tablaClientes.agregarCliente();
                break;

                case 2:
                    tablaClientes.mostrarClientes();
                break;

                case 3:
                    System.out.println("Desordenado:");
                    tablaClientes.mostrarClientes();
                    System.out.println("\n\nOrdenado:");
                    tablaClientes.ordenarPorNombre(true);
                    tablaClientes.mostrarClientes();
                break;

                case 4:
                    System.out.println("Desordenado:");
                    tablaClientes.mostrarClientes();
                    System.out.println("\n\nOrdenado:");
                    tablaClientes.ordenarPorNombre(false);
                    tablaClientes.mostrarClientes();
                break;

                case 5:
                    tablaPeliculas.agregarPelicula();
                break;

                case 6:
                    tablaPeliculas.mostrarPeliculas();
                break;

                case 7:
                    System.out.println("Desordenado:");
                    tablaPeliculas.mostrarPeliculas();
                    System.out.println("\n\nOrdenado:");
                    tablaPeliculas.ordenarPorNombre(true);
                    tablaPeliculas.mostrarPeliculas();
                break;

                case 8:
                    System.out.println("Desordenado:");
                    tablaPeliculas.mostrarPeliculas();
                    System.out.println("\n\nOrdenado:");
                    tablaPeliculas.ordenarPorNombre(false);
                    tablaPeliculas.mostrarPeliculas();
                break;

                case 9:
                    tablaPeliculas.prestamoPelicula();
                break;

                case 10:
                    tablaPeliculas.devolverPelicula();
                break;

                case -1:
                    System.out.println("Estas saliendo......");
                    System.out.println("Esperamos vuelvas pronto");
                break;

                default:
                    System.out.println("\n\n");
                    System.out.println("Ingresa una opcion correcta");
                break;
            }
        }
    }
}
