public class entrenador extends empleado{
    private int idEntrenador, experiencia;
    private String nacionalidad;
    //Constructor de la clase entrenador que hereda de empleado
    public entrenador(int idEntrenador, int idRol, int edad, int telefono, 
        String nombre, String apellido, String email,
        String eps, int idEmpleado, int experiencia, String nacionalidad) {
            // Se inicializan los atributos de la clase padre
        super(idEntrenador, idRol, edad, telefono, nombre, apellido, email, eps);
        idEmpleado = idEntrenador;
        this.experiencia = experiencia;
        this.nacionalidad = nacionalidad;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    //Funciones entregador
    public static void dirige_partidos(){
    System.out.println("El entrenador dirige partidos");
    System.out.println("**********************");  
    }

    public static void entrena_futbolistas(){
    System.out.println("El entrenador entrena futbolistas");
    System.out.println("**********************");  
    }



    // metodo para mostrar los datos del entrenador
    @Override
    public String mostrarDatos(){
        return "nombre: " +nombre +"\n apellido: " +apellido + "\n edad: "+ edad + "\n eps: " +eps +"\n idEmpleado2" +idEntrenador + "\n Tiempo de experiencia como entrenador: " +experiencia + "\n nacionalidad: " +nacionalidad;
    }
    
}