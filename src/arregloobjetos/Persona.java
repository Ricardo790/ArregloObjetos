package arregloobjetos;


public class Persona {

    private String Nombre;
    private int edad;
    private String genero;
    private String estadoCivil;

    public Persona(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.estadoCivil = EstadoCivil;
    }

  
  

    
}
