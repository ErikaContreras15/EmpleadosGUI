
package excepciones;

/**
 *
 * @author Erika
 */
public class ValidadorCedula extends Exception{
    public final static String mensaje = "Cedula incorrecta";
    
    public ValidadorCedula(){
        super(mensaje);
    }

    @Override
    public String getMessage() {
        return mensaje;
    }

}
