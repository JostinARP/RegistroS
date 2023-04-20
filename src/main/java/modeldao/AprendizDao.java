
package modeldao;

import Interfaz.MeAprendiz;
import Modelo.Aprendiz;
import java.util.List;


public class AprendizDao implements MeAprendiz {

    @Override
    public Aprendiz list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List listadoA() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean registrarA(Aprendiz ap) {
    String sql="insert into Aprendiz(Docu,Nombrea,Apellidoa,Correoa,Numcontacto)values('"+ap.getDocuA()+"','"+ap.getNombreA()+"','"+ap.getApellidoA()+"','"+ap.getCorreoA()+"','"+ap.getTeleA()+"')";
        try{
    
    }catch(){
    }
    return false;
    }

    @Override
    public boolean actualizarA(Aprendiz ap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminarA(Aprendiz ap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
