
package arrayderegistro;
/**
 *
 * @author miguel angel ruiz
 */
import java.util.Scanner;
public class ArrayDeRegistro {
    // SE Decclaran los arreglos a usar dentro del programa de registo
   static String[] sede = new String[10]; // registra la sede del alumno
   static String[] matricula = new String[10];// Registra el valor de la matricula del alumno
   static String[] nombre = new String[10]; // Nombre del alumno
   static String[] identificacion = new String[10];// Identificacion del alumno
   static int pos = 0; // La posicion o el numero del alumno en la lista de registro
   static Scanner Datostec = new Scanner (System.in);// Funcion Para ingreso de datos por teclado
   static String opcion; 
    public static void main(String[] args) {
       System.out.println("BIEVENIDO INGRESE LOS DATOS QUE SE LE PIDAN ACONTINUACION");// Muestra un mensaje en pantalla 
       
    menu(); //Llama A La funcion Menu
    }
    
    private static void menu(){
           
        System.out.println("\n\nElija una opcion.\n"        //Se encarga de mostrar en pantalla el menu de opciones
            + "1.- Registar Alumno\n"
            + "2.- Consultar alumno\n"
            + "3.- Eliminar alumno\n"
            + "4.- Actualizar datos del alumno\n"
            + "5.- Salir");
             
    switch(opcion = Datostec.next()){   // se encarga de poder seleccionar opciones en el menu
        case "1":// se enccarga de recibir los datos por teclado de los alumnos y almacenarlos en una variable x
           registro();
           menu();
        break;
         case "2": // se encarga de la consulta de dichos datos.
          consulta();
          menu();
        break;
         case "3":
                 eliminar();
                 menu();
             break;
         case "4":
             actualizar();
             menu();
             break;
         case "5":
         break;
         default: System.out.println("OPCION NO VALIDA");
        
           }
         }
    private static void registro(){
    System.out.println("Escriba la sede de la UPC a la que asiste");
           String sd= Datostec.next();// Lee el dato de la sede
           sede[pos] = sd;
           System.out.println("Escriba Su nombre");// lee el Dato Del nombre
           String name= Datostec.next();
           nombre[pos]= name;
           System.out.println("Escriba Valor de su matricula");// lee el Dato De la matricula
           String matri = Datostec.next();
           matricula[pos] = matri;
           System.out.println("Escriba Su CEDULA");// lee el Dato De la cedula
           String codigo = Datostec.next();
           identificacion[pos]= codigo;
           pos++;
           System.out.println("Los datos fueron ingresados correctamente");
    }  
    private static void consulta(){

           System.out.println("Escriba la Cedula del estudiante");
           String cod1=Datostec.next();
           for(int i=0; i < 10; i++){ // se encarga de buscar los datos 
               if(cod1.equals(identificacion[i])){
               pos = i;
               }
           }
           if(pos<0 ||(identificacion[pos] == null & nombre[pos]== null & sede[pos]==null & matricula[pos]==null)){
               System.out.println("No hay registros de ningun estudiante"); // verifica que halla datos en el array
           }else{
           System.out.println("Los datos del estudiante son:\n");//muestra los datos si los encontro
           System.out.print("La identificaion del estudiante es :");
           System.out.println(identificacion[pos]);
           System.out.print("El nombre del estudiante es :");
           System.out.println(nombre[pos]);
           System.out.print("La Sede a la que asiste el estudiante es :");
           System.out.println(sede[pos]);
           System.out.print("El coste de la matricula del estudiante es :");
           System.out.println(matricula[pos]);
           
           }
    }
    private static void eliminar(){
               int i;
        System.out.println("Escriba la Cedula del estudiante que desea eliminar");
           String cod1=Datostec.next();
           for(i=0; i < 10; i++){ // se encarga de buscar los datos 
               if(cod1.equals(identificacion[i])){
               pos = i;
               }
           }
           if(pos<0){
               System.out.println("No hay registros de ningun estudiante"); // verifica que halla datos en el array
           }else{
                if(pos == 10){// Se encarga de eliminar el ultimo valor del array
                    i = pos-1;
                
                } else{
                    for(i = pos;i<10;i++){// Se encarga de eliminar valores del array
                        identificacion[pos] = null;// Elimina los valores de las posiciones
                        nombre[pos]= null;
                        sede[pos]=null;
                        matricula[pos]=null;                                           
                        }
                    if( identificacion[pos] == null & nombre[pos]== null & sede[pos]==null & matricula[pos]==null){
                        System.out.println("Los Datos Del Estudiante han sido Borrrados Correctamente");
                    }

                }
              
    
    
                }
   
}  
    private static void actualizar(){
           System.out.println("Escriba la Cedula del estudiante al que desea modificarle algun dato");
           String cod1=Datostec.next();
           for(int i=0; i < 10; i++){ // se encarga de buscar los datos 
               if(cod1.equals(identificacion[i])){
               pos = i;
               }
           }
           if(pos<0 ||(identificacion[pos] == null & nombre[pos]== null & sede[pos]==null & matricula[pos]==null)){
               System.out.println("No hay registros de ningun estudiante"); // verifica que halla datos en el array
           }else{
               System.out.println("\n\nElija una opcion de lo que se va actualizar.\n"        //Se encarga de mostrar en pantalla el menu de opciones
            + "1.- SEDE\n"
            + "2.- NOMBRE\n"
            + "3.- IDENTIFICACION O CEDULA\n"
            + "4.- COSTO DE MATRICULA\n");
               switch(opcion = Datostec.next()){   // se encarga de poder seleccionar opciones en el menu
        case "1":// se enccarga de recibir los datos por teclado de los alumnos y almacenarlos en una variable x
           System.out.println("Escriba la sede a la cual se va a actualizar");
            String sederem= Datostec.next();// lee los datos de la sede y los actualiza
            sede[pos] = sederem;
            System.out.println("DATOS ACTUALIZADOS CON EXITO");
        break;
         case "2": 
             System.out.println("Escriba el nombre al que se va a actualizar");
          String namerem= Datostec.next();// lee los datos del nombre y los actualiza
           nombre[pos]= namerem;
           System.out.println("DATOS ACTUALIZADOS CON EXITO");
        break;
         case "3":
             System.out.println("Escriba el docucmento al que se va a actualizar");
             String codigorem = Datostec.next();
           identificacion[pos]= codigorem;// lee los datos de la Cedula o documento y los actualiza
           System.out.println("DATOS ACTUALIZADOS CON EXITO");
             break;
         case "4":
             System.out.println("Escriba el valor de matricula al que se va a actualizar");
             String matrirem = Datostec.next();// lee los datos del valor de la matricula y los actualiza
           matricula[pos] = matrirem;
           System.out.println("DATOS ACTUALIZADOS CON EXITO");
             break;
         default: System.out.println("OPCION NO VALIDA");
        
               }
           }
   
    }
    
}