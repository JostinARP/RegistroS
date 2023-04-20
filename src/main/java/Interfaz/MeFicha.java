
package Interfaz;

import Modelo.Ficha;
import java.util.List;


public interface MeFicha {
    public Ficha list (int CodF);
    public List ListadoFicha ();
    public boolean registrarFicha(Ficha F);
    public boolean actualizarFicha(Ficha F);
    public boolean eliminarFicha(Ficha F);
}
