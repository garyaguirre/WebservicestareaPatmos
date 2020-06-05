
package wsdad;

import alumno.Alumno;
import alumno.AlumnoImpl;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;


@WebService(serviceName = "saludoWSdad")
public class saludoWSdad {

   
 
    @WebMethod(operationName =  "getEgresados")
    public ArrayList<Alumno> getEgresados() throws Exception {
        alumno.AlumnoImpl am= new  AlumnoImpl();
        return am.listaEgresados("2004");
    }
}
