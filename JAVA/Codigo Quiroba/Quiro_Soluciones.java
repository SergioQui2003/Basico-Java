import java.time.LocalDate;
import java.util.Scanner;

public class Quiro_Soluciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rol = "Operadora";
        String clave = "2003";

        // Solicitar credenciales de acceso
        System.out.println("--------------------------");
        System.out.println(" ** CREDENCIALES DE ACCESO **");
        System.out.print("Digita tú rol (Operadora): ");
        String inputUsuario = scanner.next();
        System.out.print("Clave: ");
        String inputClave = scanner.next();
        System.out.println("--------------------------");

        // Validar las credenciales de acceso
        boolean accesoConcedido = false; // Variable para rastrear si el acceso se concede

        while (!accesoConcedido) {
            if (rol.equals(inputUsuario) && clave.equals(inputClave)) {
                System.out.println("Acceso concedido. Bienvenido, " + rol + "!");
                ejecutarSistema(scanner); // Llamar a la función para ejecutar el sistema
                accesoConcedido = true; // Establecer accesoConcedido a true para salir del bucle
            } else {
                System.out.println("Credenciales incorrectas. Acceso denegado.");
                // Pide nuevas credenciales al usuario
                System.out.print("Digita tú rol (Operadora): ");
                inputUsuario = scanner.next();
                System.out.print("Clave: ");
                inputClave = scanner.next();
            }
        }
    }

    public static void ejecutarSistema(Scanner scanner) {

        String respuesta = null;

        do {

            // Generar un ID de cliente único y datos del cliente 
            int idCliente = (int) (Math.random() * 10000000);
            System.out.print("Ingresa el nombre del cliente: ");
            String nombreCliente = scanner.next();

            // Solicitar una ciudad de la lista 
            System.out.println("-----------------------------------------------");
            System.out.println("Digite una Ciudad:");
            System.out.println("Bogotá");
            System.out.println("Medellín");
            System.out.println("Cali");
            System.out.println("Bucaramanga");
            System.out.println("Cúcuta");
            System.out.println("-----------------------------------------------");
            String ciudadEquipos = scanner.next();

            while (!ciudadEquipos.equalsIgnoreCase("Bogota") && !ciudadEquipos.equalsIgnoreCase("Medellin") && !ciudadEquipos.equalsIgnoreCase("Cali") && !ciudadEquipos.equalsIgnoreCase("Bucaramanga") && !ciudadEquipos.equalsIgnoreCase("Cucuta")) {
                System.out.println("-----------------------------------------------");
                System.out.println("¡Error!, Ingresa algunas de estás ciudades: Bogotá, Medellín, Cali, Bucaramanga, Cúcuta");
                ciudadEquipos = scanner.next();
            }

            System.out.print("Dirección: ");
            String direccion = scanner.next();

            // Solicitar la opción de tipo
            System.out.println("-----------------------------------------------");
            System.out.println("Digite un tipo de equipo:");
            System.out.println("Escritorio");
            System.out.println("Portatil");
            System.out.println("-----------------------------------------------");
            String tipoEquipos = scanner.next();

            while (!tipoEquipos.equalsIgnoreCase("Escritorio") && !tipoEquipos.equalsIgnoreCase("Portatil")) {
                System.out.println("-----------------------------------------------");
                System.out.println("¡Error!, ingresa Escritorio o Portatil");
                tipoEquipos = scanner.next();
            }

            // Solicitar la opción de especificaiones
            System.out.println("-----------------------------------------------");
            System.out.println("Digite una especificaion de equipo:");
            System.out.println("Básico");
            System.out.println("Programar");
            System.out.println("Diseño");
            System.out.println("-----------------------------------------------");
            String especificacionEquipo = scanner.next();

            while (!especificacionEquipo.equalsIgnoreCase("Basico") && !especificacionEquipo.equalsIgnoreCase("Programar") && !especificacionEquipo.equalsIgnoreCase("Basico")) {
                System.out.println("-----------------------------------------------");
                System.out.println("¡Error!, ingresa Basico, Programar o Diseño");
                System.out.println("-----------------------------------------------");
                especificacionEquipo = scanner.next();
            }

            // Solicitar la cantidad de equipos a alquilar y los días de alquiler
            System.out.println("-----------------------------------------------");
            System.out.println("Cuantos equipos va alquilar ** mínimo: 2, máximo: 10 **");
            System.out.println("-----------------------------------------------");
            int numeroEquipos = scanner.nextInt();

            while (numeroEquipos < 2 || numeroEquipos > 10) {
                System.out.println("-----------------------------------------------");
                System.out.println("¡Error!, El número de equipos debe estar entre 2 y 10.");
                System.out.println("-----------------------------------------------");
                numeroEquipos = scanner.nextInt();
                System.out.println(" ");
            }

            System.out.println("-----------------------------------------------");
            System.out.println("Por cuántos días va hacer el alquiler de los equipos ** minimo 1, máximo: 12 **");
            System.out.println("-----------------------------------------------");
            int diasEquipos = scanner.nextInt();

            while (diasEquipos < 1 || diasEquipos > 12) {
                System.out.println("-----------------------------------------------");
                System.out.println("¡Error!, El número de días debe estar entre 1 y 12.");
                System.out.println("-----------------------------------------------");
                diasEquipos = scanner.nextInt();

            }

            // Solicitar la opción de alquiler
            System.out.println("-----------------------------------------------");
            System.out.println("Seleccione su opción de alquiler");
            System.out.println("1. Dentro de la ciudad");
            System.out.println("2. Fuera de la ciudad");
            System.out.println("3. Dentro del establecimiento");
            System.out.println("-----------------------------------------------");
            int opcionEquipos = scanner.nextInt();

            while (opcionEquipos < 1 || opcionEquipos > 3) {
                System.out.println("¡Error!, Debe seleccionar una opción del 1 al 3.");
                opcionEquipos = scanner.nextInt();
                System.out.println(" ");

            }

            // Calcular el valor de los días por los equipos que requiera
            double valorTotal = numeroEquipos * diasEquipos * 35000;

            // Aplicar incrementos o descuentos según la opción de alquiler
            if (opcionEquipos == 2) {
                valorTotal *= 1.05; // Incremento del 5%
            } else if (opcionEquipos == 3) {
                valorTotal *= 0.95; // Descuento del 5%
            }

            // Preguntar si desea agregar días adicionales
            System.out.println("-----------------------------------------------");
            System.out.println("¿Quiere agregar más días de alquiler? (S/N): ");
            System.out.println("-----------------------------------------------");
            System.out.println(" ");
            String rta = scanner.next();
            // Si se desea agregar días adicionales
            if (rta.equalsIgnoreCase("S")) {
                System.out.println("-----------------------------------------------");
                System.out.println("Ingrese el número de días adicionales ** minimo 1, máximo: 3 **:");
                System.out.println("-----------------------------------------------");
                int diasAdicionales = scanner.nextInt();

                while (diasAdicionales < 1 || diasAdicionales > 3) {
                    System.out.println("-----------------------------------------------");
                    System.out.println("¡Error!, los días máximos son 3.");
                    System.out.println("-----------------------------------------------");
                    diasAdicionales = scanner.nextInt();
                }

                valorTotal += diasAdicionales * (valorTotal * 0.02); // Descuento del 2% por cada día adicional
            }

            // Menu de metodo de pago 
            System.out.println("-----------------------------------------------");
            System.out.println("Seleccione su opción de método de pago");
            System.out.println("Efectivo");
            System.out.println("Tarjeta");
            System.out.println("-----------------------------------------------");
            String metodoPago = scanner.next();

            while (!metodoPago.equalsIgnoreCase("Efectivo") && !metodoPago.equalsIgnoreCase("Tarjeta")) {
                System.out.println("¡Error!, el método de pago solo puede ser Efectivo o Tarjeta");
                metodoPago = scanner.next();
            }

            //Cancelar el alquiler
            System.out.println("-----------------------------------------------");
            System.out.println("¿Quiere cancelar alquiler? (S/N): ");
            System.out.println("-----------------------------------------------");
            String rtaCancelar = scanner.next();

            if (rtaCancelar.equalsIgnoreCase("S")) {
                System.out.println("-----------------------------------------------");
                System.out.println("Ha cancelado su alquiler");
                System.out.println("-----------------------------------------------");
                System.exit(0);
            } else if (rtaCancelar.equalsIgnoreCase("N")) {
                System.out.println("-----------------------------------------------");
                System.out.println("Su alquiler ha sido exitoso");
                System.out.println("-----------------------------------------------");
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese S o N.");
            }

            // Generar la factura para el cliente
            System.out.println("---------------------  FACTURA  --------------------");
            LocalDate date = LocalDate.now();
            System.out.println("Fecha de impresión " + date);
            System.out.println("Id de Cliente: " + idCliente);
            System.out.println("Nombre: " + nombreCliente);
            System.out.println("Ciudad: " + ciudadEquipos);
            System.out.println("Barrio y dirección: " + direccion);
            System.out.println("Tipo de equipos: " + tipoEquipos);
            System.out.println("Especificaciones de equipo: " + especificacionEquipo);
            System.out.println("Opción Alquiler: " + opcionEquipos);
            System.out.println("Número Equipos: " + numeroEquipos);
            System.out.println("Número días: " + diasEquipos);
            System.out.println("Su método de pago es:" + metodoPago);

            if (opcionEquipos == 2) {
                System.out.println("Se incrementa el domicilio del 5%");
            } else if (opcionEquipos == 3) {
                System.out.println("Se le hace un descuento del 5%");
            }
            System.out.println("El valor a pagar es de $: " + valorTotal);
            System.out.println("----------------------  ---------  ----------------");

            //Quiere que la factura sea enviada por correo
            System.out.println("-----------------------------------------------");
            System.out.println("¿Quiere que la factura sea enviada por correo? (S/N): ");
            System.out.println("-----------------------------------------------");
            String envioCorreo = scanner.next();

            if (envioCorreo.equalsIgnoreCase("S")) {
                System.out.print("Ingrese su correo:");
                String correo = scanner.next();
                System.out.println("-----------------------------------------------");
                System.out.println("Su factura se enviara correctamente al correo " + correo);
                System.out.println("-----------------------------------------------");
            } else if (envioCorreo.equalsIgnoreCase("N")) {
                System.out.println("-----------------------------------------------");
                System.out.println("Se la haremos llegar a su casa");
                System.out.println("-----------------------------------------------");
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese S o N.");
            }

            System.out.println("¿Estás seguro de que quieres salir del programa? (S/N)");
            respuesta = scanner.next();

            if (respuesta.equalsIgnoreCase("N")) {
                ejecutarSistema(scanner);
                System.out.println("-----------------------------------------------");
                System.out.println("------------------ Nuevo Cliente -------------");
                System.out.println("-----------------------------------------------");
            }

        } while (respuesta == "S");
        System.out.println("Quiroba  Soluciones te espera luego, ¡Hasta pronto!");

    }
}
