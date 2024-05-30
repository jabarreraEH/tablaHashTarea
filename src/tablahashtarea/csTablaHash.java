package tablahashtarea;

public class csTablaHash {
    //Atributos
    private int tamanio;
    private csNodo[] tabla;
    
    //Constructor
    public csTablaHash(int tamanio){
        this.tamanio = tamanio;
        this.tabla = new csNodo[tamanio];
    }
    
    //Metodos
    public void insertar(String codigo, String nombre, int promedio){
        int i = dispersion(hash(codigo));
        if(tabla[i] == null){
            tabla[i] = new csNodo(codigo, nombre, promedio);
        }else{
            csNodo nuevo = new csNodo(codigo, nombre, promedio);
            nuevo.siguiente = tabla[i];
            tabla[i] = nuevo;
        }
    }
    
    public void imprimir(){
        for (int i = 0; i < tamanio; i++) {
            if(tabla[i] != null){
                csNodo temp = tabla[i];
                System.out.println("Indice: " + i 
                                + ", Codigo: " + temp.getCodigo() 
                                + ", Nombre: " + temp.getNombre() 
                                + ", Promedio: " + temp.getPromedio());
                temp = temp.siguiente;
                while(temp != null){
                    System.out.println("Indice: *" + i 
                                + ", Codigo: " + temp.getCodigo() 
                                + ", Nombre: " + temp.getNombre() 
                                + ", Promedio: " + temp.getPromedio());
                    temp = temp.siguiente;
                }
            }
        }
    }
    
    //Función hash
    long hash(String key) {
        long hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash += key.charAt(i);
        }
        return hash;
    }

    static final double R = 0.618034;

    static int dispersion(long x) {
        double t;
        int v;
        t = R * x - Math.floor(R * x); //Parte decimal
        v = (int) Math.floor(60 * t); //Multiplicar por el tamaño de la tabla
        return v; //Retornar el valor
    }
}
