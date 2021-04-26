package ExamenProgra;

//Aqu� van todas mis librer�as
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author dofh0
 */
public class ClaseAcordes {
    //Se crean 4 objetos de la clase Persona, dando así tres ejemplos de usar el constructor
    Persona usuario0 = new Persona ("Juana","Garcia","Seanez","Buenas tardes");
    Persona usuario1 = new Persona ("Mauricio","Hola");
    Persona usuario2 = new Persona ("David","Flores","Hola");
    Persona usuario3 = new Persona ("Crear nuevo usuario","Hola");
    
    
    //Declaramos nuestras variables
    int numusuario;
    String notas = "";
    //Variable de tipo boolean que nos dice si ya se creo un nuevo usuario
    boolean nuevousuario= false;
    //Instanciar escaner
    Scanner sim = new Scanner(System.in);
    int numNotas;
    ClaseAcordes (){
    }
    ClaseAcordes (int numNotas){
        this.numNotas=numNotas;
        
    }
    //Aqu� iniciamos nuestro proceso para solicitar datos al usuario
    public String pedir_notas(){
       //Se declara un arreglo con los nombre de los posibles usuarios del programa
       String [] usuarios={"Juana Garcia Seanez", "Joel Mauricio Gonzalez Perez",
                          "David Omar Flores Herrera", usuario3.getNombres()};
        //Cuadro de texto que dará cuatro opciones al usuario en cuestion. 
       numusuario =JOptionPane.showOptionDialog(null, "Seleccione una de las siguientes opciones: ",
               "Seleccionar opcion",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
               null, usuarios, usuarios[0]);
       //Switch para mostrar un mensaje dependiendo de la opcion que se haya seleccionado
       //Loading...
       switch(numusuario){
           case -1:
           break;
           case 0:
               JOptionPane.showMessageDialog(null, usuario0.getMensaje());
           break;
           case 1:
               JOptionPane.showMessageDialog(null, usuario1.getMensaje());
               break;
           case 2:
               JOptionPane.showMessageDialog(null, usuario2.getMensaje());
               break;
           case 3:
               //Se declara un if-else, para comprobar si el usuario 4 ya se ha creado.
               //En caso de que no, se hará pedirá al usuario el nombre y apellidos
               if(nuevousuario==false){  
               usuario3.setNombres(JOptionPane.showInputDialog(null, "Escribe el nombre"));
               usuario3.setPApellido(JOptionPane.showInputDialog(null, "Escribe el primer apellido"));
               usuario3.setMApellido(JOptionPane.showInputDialog(null, "Escribe el segundo apellido"));
               nuevousuario=true;
               JOptionPane.showMessageDialog(null, "¡Usuario creado con exito! "
                       + "\n-Numero de usuario: " + ++numusuario
                       + "\n-Nombre: "+ usuario3.getNombres()
                       + "\n-Apellidos: "+ usuario3.getPApellido()+" "+usuario3.getMApellido());
               JOptionPane.showMessageDialog(null, usuario3.getMensaje());
               break;
               //En caso de que ya exista el usuario 4, simplemente se mostrara el mensaje    
              }else if(nuevousuario==true){
               JOptionPane.showMessageDialog(null, usuario3.getMensaje());    
              }
       }        
       notas = JOptionPane.showInputDialog(null, "Bienvenido a nuestro repositorio identificador de notas fundamentales de acordes! \n Inserte la nota principal del acorde mayor que desea encontrar: \n(Notas disponibles: A,B,C,D,E,F,G   =   La,Si,Do,Re,Mi,Fa,Sol)"); 
       return notas;
       //Nos quedamos con el dato de la variable "notas" con el fin de reutilizarlo despu�s
    }
    //Hacemos un nuevo proceso para complementar el dato seg�n la informaci�n que solicite
    public void encontrar_acorde(){
        //Procedemos a dividir nuestra informaci�n con un "seg�n"
        JOptionPane.showMessageDialog(null,"El numero de notas es:"+ numNotas);
        switch(notas){
           //Todos los casos vienen con todas las formas de escribir la misma nota musical
           case "A":case "a":case "La":case "la":
               JOptionPane.showMessageDialog(null, "Las notas fundamentales del acorde de La Mayor son: \n A - E - C# / La - Mi - Do#"); 
               //Mostramos resultados
               break;
           case "B":case "b":case "Si":case "si":
               JOptionPane.showMessageDialog(null, "Las notas fundamentales del acorde de Si Mayor son: \n D# - F# - B / Re# - Fa# - Si");
               break;
           case "C":case "c":case "Do":case "do":
               JOptionPane.showMessageDialog(null, "Las notas fundamentales del acorde de Do Mayor son: \n C - E - G / Do - Mi - Sol"); 
               break;
           case "D":case "d":case "Re":case "re":
               JOptionPane.showMessageDialog(null, "Las notas fundamentales del acorde de Re Mayor son: \n D - F# - A / Re - Fa# - La"); 
               break;
           case "E":case "e":case "Mi":case "mi":
               JOptionPane.showMessageDialog(null, "Las notas fundamentales del acorde de Mi Mayor son: \n E - G# - B / Mi - Sol# - Si"); 
               break;
           case "F":case "f":case "Fa":case "fa":
               JOptionPane.showMessageDialog(null, "Las notas fundamentales del acorde de Fa Mayor son: \n A - F - C / Fa - La - Do"); 
               break;
           case "G": case"g": case"Sol":case "sol":
               JOptionPane.showMessageDialog(null, "Las notas fundamentales del acorde de Sol Mayor son: \n G - B - D / Sol - Si - Re"); 
               break;
           default: JOptionPane.showMessageDialog(null, "Por favor inserte una de las notas que corresponda a un acorde soportado por nuestro programa.");
           //Para evitar excepciones declaramos una opci�n por defecto
            break;
       }
    }
    //Iniciamos otro proceso que servir� para reproducir las veces que sea necesario nuestro programa
    public boolean repetir(boolean siono){
        //Declaramos la cadena donde ir� la informaci�n insertada por el usuario
        String opc = JOptionPane.showInputDialog(null, "�Desea volver a reproducir nuestro maravilloso programa? (S/N): "); 
        //Comparamos con el caracter que responde negativamente a repetir nuestro programa
        if(opc.equalsIgnoreCase("N")){
           /*Si la opci�n seleccionada por el usuario fue "no" 
             la variable binaria que mantiene al ciclo activo responde negativamente
             terminando con el ciclo y el programa
            */
           siono = false;
           //Mostramos un mensaje de despedida
           JOptionPane.showMessageDialog(null, "Corre a encintar las notas de tus instrumentos \nPuedes volver a consultar los acordes cuando gustes!!!");
        }
        //Retornamos el valor del dato insertado por el usuario
        return siono;
    }
}
