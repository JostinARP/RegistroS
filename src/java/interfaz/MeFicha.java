/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import java.util.List;
import modelo.Ficha;



public interface MeFicha  {
    public Ficha List(int id);
    public List listaFicha();
    public boolean registrarFicha(Ficha Fi);
    public boolean actualizarFicha(Ficha Fi);
    public boolean eliminarFicha(int id);
}
