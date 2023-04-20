
package Interfaz;

import Modelo.Aprendiz;
import java.util.List;

public interface MeAprendiz {
    
    public Aprendiz list (int id);
    public List listadoA();
    public boolean registrarA(Aprendiz ap);
    public boolean actualizarA(Aprendiz ap);
    public boolean eliminarA(Aprendiz ap);
}
