import java.util.HashMap;

public class Persona {
    private float nombre;
    private float genero;
    private HashMap<Float,Float> telefonos = new HashMap<Float,Float>();
    
    public Persona(float nombre,float genero,String telefonos){
        this.nombre= nombre;
        this.genero = genero;
        String [] telDivididos= telefonos.split("\n");
        for(int i=0; i<telDivididos.length;i++){
            String [] datos = telDivididos[i].split(" ");
            this.telefonos.put(Float.parseFloat(datos[0]), Float.parseFloat(datos[1]));

        }
    }

    public void setNombre(float nombre){
        this.nombre = nombre;
    }

    public float getNombre(){
        return this.nombre;
    }

    public void setGenero(float genero){
        this.genero = genero;
    }

    public float getGenero(){
        return this.genero;
    }

    public HashMap<Float,Float> getTelefonos(){
        return this.telefonos;
    }

}
