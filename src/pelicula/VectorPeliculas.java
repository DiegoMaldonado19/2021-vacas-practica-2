package src.pelicula;
import src.tienda.*;
/**
 * Clase que se encarga de gestionar los vectores de peliculas
 */
public class VectorPeliculas{
    /**
     * Vector de peliculas y variable para almacenar posicion
     */
    private Pelicula[] peliculas = new Pelicula[100];
    private int siguienteCodigo;

    /**
     * Constructor por defecto
     */
    public VectorPeliculas(){
        siguienteCodigo = 1;
    }

    /**
     * Metodo para agregar una pelicula al arreglo de peliculas
     * @param nombre
     * @param categoria
     * @param anio
     */
    public void agregarPelicula(String nombre, String categoria, int anio){
        if(siguienteCodigo>100){
            System.out.println("Limite de peliculas alcanzado");
        }
        else{
            peliculas[siguienteCodigo-1] = new Pelicula(siguienteCodigo ,nombre, categoria, anio);
        }
        siguienteCodigo++;
    }

    /**
     * Metodo que pide los datos al usuario y los envia al metodo agregar pelicula
     */
    public void agregarPelicula(){
        String nombre = IngresoDatos.getTexto("Ingrese el nombre de la Pelicula: ");
        String categoria = IngresoDatos.getTexto("Ingrese la categoria de la Pelicula: ");
        int anio = IngresoDatos.getEntero("Ingrese el anio de la Pelicula: ", false);
        agregarPelicula(nombre, categoria, anio);
    }

    /**
     * Metodo para mostrar las peliculas en pantalla
     */
    public void mostrarPeliculas(){
        System.out.println("\n\n Peliculas Memorabilia");
        for(int i=0; i<(siguienteCodigo-1); i++){
            System.out.println("-"+(i+1)+") "+ peliculas[i].getInformacion());
        }
        System.out.println("\n\n");
    }

    /**
     * Metodo para ordenar ascendentemente o descendentemente el arreglo de peliculas
     * @param ascendente
     */
    public void ordenarPorNombre(boolean ascendente){

        boolean cambio=true;

        for(int i=1; i<(siguienteCodigo-1); i++){
            for(int j=0; j<(siguienteCodigo-1-i); j++){
                if(ascendente){
                    cambio = peliculas[j].getNombre().compareTo(peliculas[j+1].getNombre())>0;
                }
                else{
                    cambio = peliculas[j].getNombre().compareTo(peliculas[j+1].getNombre())<0;
                }
                if(cambio ){
                    //clientes i va antes que clientes j <0 descendente
                    Pelicula aux = peliculas[j];
                    peliculas[j] = peliculas[j+1];
                    peliculas[j+1]= aux;
                }
            }
        }
    }

    /**
     * Metodo para mostrar peliculas disponibles en el sistema
     */
    public void mostrarPeliculasDisponibles(){
        System.out.println("\n\n Peliculas disponibles Memorabilia");
        for(int i=0; i<(siguienteCodigo-1); i++){
            if(peliculas[i].isDisponible()==true){
                System.out.println("-"+(i+1)+") "+ peliculas[i].getInformacion());
            }
        }
        System.out.println("\n\n");
    }

    /**
     * Metodo para mostrar peliculas prestadas en el sistema
     */
    public void mostrarPeliculasPrestadas(){
        System.out.println("\n\n Peliculas prestadas Memorabilia");
        for(int i=0; i<(siguienteCodigo-1); i++){
            if(peliculas[i].isDisponible()==false){
                System.out.println("-"+(i+1)+") "+ peliculas[i].getInformacion());
            }
        }
        System.out.println("\n\n");
    }

    /**
     * Metodo para prestar una pelicula
     */
    public void prestamoPelicula(){
        int peliculaPrestada=0;

        mostrarPeliculasDisponibles();
        peliculaPrestada = IngresoDatos.getEntero("¿Qué pelicula deseas prestar?", true);
        peliculas[peliculaPrestada-1].setDisponible(false);
    }

    /**
     * Metodo para devolver pelicula
     */
    public void devolverPelicula(){
        int peliculaEnDevolucion=0;
        mostrarPeliculasPrestadas();
        peliculaEnDevolucion = IngresoDatos.getEntero("¿Qué pelicula deseas devolver?", true);
        peliculas[peliculaEnDevolucion-1].setDisponible(true);
    }
}