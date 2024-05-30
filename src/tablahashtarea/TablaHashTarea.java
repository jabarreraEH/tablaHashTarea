package tablahashtarea;

import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class TablaHashTarea {

    public static void main(String[] args) {
        
        System.out.println("DATOS DE ESTUDIANTE");
        try {
            System.out.println("=========================");
            System.out.println("5190-22-13723, Julian Andres Barrera Garcia, Sección: C.");
            System.out.println("5190-11-552, Moises Enrique Montenegro Ramos, Sección: C.");
            System.out.println("5190-16-15827, Héctor Adolfo Santos Hernández, Sección: C.");
            System.out.println("\nIP Address: " + InetAddress.getLocalHost().getHostAddress());
            System.out.println("=========================");
        } catch (UnknownHostException ex) {
            System.out.println( ex.getMessage() );
        }

        //Ingresar los datos de la tabla hash en una lista
        ArrayList<csNodo> lista = new ArrayList<csNodo>();

        for (int i = 0; i < 60; i++) {
            csNodo nodo = new csNodo("TX-0"+(12+i)+"Y", "Nombre" + i, (int) (Math.random()*100));
            lista.add(nodo);
        }

        //Usando la función hash y la función de dispersión, se insertan los datos de la lista en la tabla hash
        csTablaHash tabla = new csTablaHash(60);
        for (int i = 0; i < lista.size(); i++) {
            tabla.insertar(lista.get(i).getCodigo(), lista.get(i).getNombre(), lista.get(i).getPromedio());
        }
        tabla.imprimir();
    }

}
