package src.pelicula;
/**
 * Clase Pelicula
 */
public class Pelicula{
    /**
     * Atributos de la clase pelicula
     */
    private int id;
    private String nombre;
    private String categoria;
    private int anio;
    private boolean disponible;

    /**
     * Constructor por defecto el cual recibe todos los parametros para instanciar una pelicula
     * @param id
     * @param nombre
     * @param categoria
     * @param anio
     * @param disponible
     */
    public Pelicula(int id, String nombre, String categoria, int anio, boolean disponible){
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.anio = anio;
        this.disponible = disponible;
    }

    /**
     * Constructor que no solicita el atributo booleano de pelicula
     */
    public Pelicula(int id, String nombre, String categoria, int anio){
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.anio = anio;
        this.disponible = true;
    }

    /**
     * Getters y setters para aplicar encapsulamiento
     * @param nombre
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * 
     * @return
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * 
     * @param categoria
     */
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    /**
     * 
     * @return
     */
    public String getCategoria(){
        return categoria;
    }

    /**
     * 
     * @param disponible
     */
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    /**
     * 
     * @return
     */
    public boolean isDisponible(){
        return disponible;
    }

    /**
     * 
     * @return
     */
    public int getId(){
        return id;
    }

    /**
     * 
     * @return
     */
    public int getAnio(){
        return anio;
    }

    /**
     * 
     * @param anio
     */
    public void setAnio(int anio){
        this.anio = anio;
    }

    /**
     * Metodo para mostrar la informacion de las peliculas en el sistema
     * @return
     */
    public String getInformacion(){
        String resultado = "Id: "+id+" Nombre de la pelicula: " + nombre;
        return resultado;
    }

}