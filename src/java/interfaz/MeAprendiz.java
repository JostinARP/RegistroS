/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;
   

import java.util.List;
import modelo.Aprendiz;

public interface MeAprendiz {
    public Aprendiz list (int id);
    public List listadoA();
    public boolean registrarA(Aprendiz ap);
    public boolean actualizarA(Aprendiz ap);
    public boolean eliminarA(int id);
}
