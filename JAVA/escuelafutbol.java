public class escuelafutbol{
    public static void main(String[] ags) {
            //Instanciar objetos de la clase futbolista
            //futbolista jugador= new futbolista();
            //entrenador entr = new entrenador();
            //coordinador tecnico tec=new coordinadorTecnico();

            //datos del futbolista
        empleado per=new futbolista(30,06,23,300505033,"Oscar", "javier","ojavier@gmail.com","Compensar", 200,15,9,"Defensa");
        System.out.println("Los datos del Futbolista son: \n" +per.mostrarDatos());    
        //Funciones del futbolista
        futbolista.jugar_partidos();
        futbolista.viajar();
        futbolista.preparacion_fisica();
                
                //datos del entrenador
        entrenador entr=new entrenador(07, 12, 12, 313381315, "Sergio", "Alejandro", "Salejandro@gmail.com", "Sura", 9, 2, "Mexicano");
        System.out.println("Los datos del Entrenador son: \n" +entr.mostrarDatos());
        //Funciones del entrenador 
        entrenador.dirige_partidos();
        entrenador.entrena_futbolistas();

        //datos del cordinador tecnico
        coordinador tec=new coordinador(17,06,22,31241983,"Diego","Andres","andiego@gmail.com","Sanitas",23);
        System.out.println("Los datos del Coordinador son: \n" +tec.mostrarDatos());
            //Funciones del coordinador
        coordinador.administra_recursos();
    }   


}