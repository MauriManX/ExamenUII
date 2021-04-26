package ExamenProgra;

/**
 *
 * @author Mauricio
 */
public class Persona {
//Declaración de variables, la cuales serán private
    private String nombres="",PApellido="",MApellido="",Saludo="";
    
    //Creación de metodos constructores y sobrecarga de estos
  Persona (String nombres, String Saludo){
     this.nombres=nombres;
     this.Saludo=Saludo;
  }
  Persona (String nombres, String PApellido, String Saludo){
     this.nombres=nombres;
     this.PApellido=PApellido;
     this.Saludo=Saludo;
 }
  Persona (String nombres, String PApellido, String MApellido, String Saludo){
     this.nombres=nombres;
     this.PApellido=PApellido;
     this.MApellido=MApellido;
     this.Saludo=Saludo;
 } 

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPApellido() {
        return PApellido;
    }

    public void setPApellido(String PApellido) {
        this.PApellido = PApellido;
    }

    public String getMApellido() {
        return MApellido;
    }

    public void setMApellido(String MApellido) {
        this.MApellido = MApellido;
    }
  
  //Metodo que mostrará un mensaje
  String getMensaje (){
      return Saludo+", "+nombres+" "+PApellido+" "+MApellido;
  }
}
