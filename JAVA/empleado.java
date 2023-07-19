public class coordinador extends empleado {
    private int idCoordinador;

    //constructor de la clase coordinador que hereda de la clase empleado
    public coordinador(int idEmpleado, int idRol, int edad, int telefono, 
        String nombre, String apellido, String email,
        String eps, int idCoordinador) {
         //se inicializan los atributos de la clase padre   
        super(idEmpleado, idRol, edad, telefono, nombre, apellido, email, eps);
        this.idCoordinador = idCoordinador;
    }

    public void setIdCoordinador(int idCoordinador) {
        this.idCoordinador = idCoordinador;
    }


    //Funciones coordinador
    public static void administra_recursos(){
    System.out.println("El coordinador administra los recursos");
    System.out.println("**********************");  
    }



        //metodos para mostrar los datos del coordinador
    @Override
    public String mostrarDatos(){
        return "nombre: " +nombre +"\n apellido: " +apellido + "\nedad: "+ edad + "\n eps: " +eps +"\n  idCoordinador: " +idCoordinador;
    }
    

}