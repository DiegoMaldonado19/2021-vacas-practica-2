package src.clientes;
/**
 * Cliente
 */
public class Cliente {
    /**
     * Atributos para la clase cliente
     */
    private int id;
    private String nombre;
    private int telefono;

    /**
     * Constructor que pide como parametros todos los atributos del cliente
     * @param id
     * @param nombre
     * @param telefono
     */
    public Cliente(int id, String nombre, int telefono){
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    /**
     * Constructor por si no ingresan el numero de telefono
     * @param id
     * @param nombre
     */
    public Cliente(int id, String nombre){
        this(id, nombre, 0);
    }

    /**
     * Getters y setters para aplicar encapsulamiento
     * @return
     */
    public int getId(){
        return id;
    }

    /**
     * 
     * @return
     */
    public int getTelefono(){
        return telefono;
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
     * @param nombre
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * 
     * @param telefono
     */
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    /**
     * Metodo para obtener la informacion del cliente
     * @return
     */
    public String getInformacion(){
        String resultado = "Id: "+id+" Nombre del cliente: " + nombre;
        return resultado;
    }
    
}