import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Prueba {
    private ArrayList<Persona> personas = new ArrayList<Persona>();

    public void llenarDatos(){
        Scanner lector =  new Scanner(System.in);

        int numRegistros =  Integer.parseInt(lector.nextLine());
        float nombre = 0;
        float genero = 0;
        String datos = "";

        for(int i=0;i<numRegistros;i++){
            String registro = lector.nextLine();
        
            String [] datosDivididos = registro.split(" ");
            if (nombre != Float.parseFloat(datosDivididos[0])){
                if(nombre != 0){
                    personas.add(new Persona(nombre,genero,datos));
                }
                nombre = Float.parseFloat(datosDivididos[0]);
                genero = Float.parseFloat(datosDivididos[1]);
                datos = datosDivididos[2] + " " + datosDivididos[3] +"\n";
            }else{
                datos += datosDivididos[2] + " " + datosDivididos[3] +"\n";
            }

            if(i==numRegistros-1){
                personas.add(new Persona(nombre,genero,datos));
            }
        }
        
    }
    public void mostrarDatos(){
        System.out.println("\n"+"Datos almacenados");
        for(int i=0; i<personas.size();i++){
            float nombre = personas.get(i).getNombre();
            float genero = personas.get(i).getGenero();
            for(float tels: personas.get(i).getTelefonos().keySet()){
                System.out.println(nombre + " "+ genero + " "+tels+" "+personas.get(i).getTelefonos().get(tels));
            }
        }
    }

    public float sumaTelefonos(){
        float sumatoria=0;
        for(int i=0; i<personas.size();i++){

            for(float tels: personas.get(i).getTelefonos().keySet()){
               sumatoria += personas.get(i).getTelefonos().get(tels);
            }
        }

        return sumatoria;
    }
    
}
