/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeldao;

import config.Conexion;
import interfaz.MeFicha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Ficha;

/**
 *
 * @author APRENDIZ
 */
public class FichaDao implements MeFicha{

        Ficha Fi=new Ficha();
        Conexion cn=new Conexion();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
    @Override
    public Ficha List(int id) {
        String sql="select * from ficha where Codficha= "+id;
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            Fi.setCodFicha(rs.getInt("Codficha"));
            Fi.setCantaprendices(rs.getInt("Cantapre"));
            Fi.setCodprograma(rs.getInt("Codprod"));
            Fi.setCodaprendiz(rs.getInt("Codaprendiz"));
            }
        }catch(Exception e){
            /*JOptionPane.showMessageDialog(null, "No se puede traer la informacion");*/
        
        }
        return Fi;
    }

    @Override
    public java.util.List listaFicha() {
        
        ArrayList<Ficha>lista=new ArrayList<Ficha>();
        String sql="select * from ficha";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            Ficha fi=new Ficha();
            fi.setCodFicha(rs.getInt("Codficha"));
            fi.setCantaprendices(rs.getInt("Cantapre"));
            fi.setCodprograma(rs.getInt("Codprod"));
            fi.setCodaprendiz(rs.getInt("Codaprendiz"));
            lista.add(fi);
            }
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "No se puede traer la informacion");
        }
        return lista;
    }

    @Override
    public boolean registrarFicha(Ficha Fi) {
        String sql="insert into ficha(Codficha,Cantapre,Codprod,Codaprendiz) values ('"+Fi.getCodFicha()+"','"+Fi.getCantaprendices()+"','"+Fi.getCodprograma()+"','"+Fi.getCodaprendiz()+"') ";
        
        try{
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        ps.executeUpdate();
        
            JOptionPane.showMessageDialog(null, "Ficha Registrada");
        }catch(Exception e){
        
        }
        return false;
    }

    @Override
    public boolean actualizarFicha(Ficha Fi) {
        String sql="update ficha set Codficha='"+Fi.getCodFicha()+"',Cantapre='"+Fi.getCantaprendices()+"',Codprod='"+Fi.getCodprograma()+"',Codaprendiz='"+Fi.getCodaprendiz()+"' where Codficha="+Fi.getCodFicha();
        try{
            
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        
        }catch(Exception e){
        
        }
        return false;
    }

    @Override
    public boolean eliminarFicha(int CodFicha) {
        String sql="delete from ficha where Codficha="+CodFicha;
        try{
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        ps.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Ficha Eliminada");
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "No se pudo eliminar la ficha");
        }
        
        return false;
    }
    
}
