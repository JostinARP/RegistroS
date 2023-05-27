/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import java.util.List;
import modelo.Programa;

/**
 *
 * @author APRENDIZ
 */
public interface MePrograma {
    public Programa List(int id);
    public List listadopro();
    public boolean registrarpro(Programa pro);
    public boolean actualizarpro(Programa pro);
    public boolean eliminarpro(int id);
    
    
}
