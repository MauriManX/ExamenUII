package ExamenProgra;

/**
 *
 * @author David Flores, Joel Gonz�lez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Aqu� mandamos a llamar e instanciamos nuestra clase  
        ClaseAcordes acorde = new ClaseAcordes(8);
        ClaseAcordes acordenumero = new ClaseAcordes(7);
        //Declaramos el booleano con el que se ciclar� el programa las veces que sea necesario
        boolean siono = true;
        //Iniciamos el ciclo entrando una vez al contenido
        do{
        //Inicializamos el m�todo "pedir notas"
        acorde.pedir_notas();
        //Termina el m�todo anterior e inicia el pr�ximo llamado "encontrar acorde"
        acorde.encontrar_acorde();
        //Ambos procesos fueron llevados a cabo desde la instancia "acorde" de la clase "ClaseAcordes"
        }while(acorde.repetir(siono) == true);
        /*Finalizamos el ciclo con valores tambi�n de la instancia "acorde" de
          la clase "ClaseAcordes", con la finalidad de no alterar el orden de nuestro c�digo
          en el Main Class
        */
    }
}
