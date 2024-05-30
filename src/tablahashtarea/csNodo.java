package tablahashtarea;

public class csNodo {
    //Atributos
    String nombre, codigo;
    int promedio;
    csNodo siguiente;
    
    //Constructor
    public csNodo(String codigo, String nombre, int promedio){
        this.nombre = nombre;
        this.codigo = codigo;
        this.promedio = promedio;
        this.siguiente = null;
    }
    public csNodo(){
        this.nombre = "";
        this.codigo = "";
        this.promedio = 0;
        this.siguiente = null;
    }
    
    //Metodos
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public void setPromedio(int promedio){
        this.promedio = promedio;
    }
    public int getPromedio(){
        return this.promedio;
    }
}
