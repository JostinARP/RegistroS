/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeldao;

import config.Conexion;
import interfaz.MePrograma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Programa;

/**
 *
 * @author APRENDIZ
 */
public class ProgramaDao implements MePrograma {
        
        Conexion cn= new Conexion();
        Programa po= new Programa();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
    
        @Override
    public Programa List(int id) {
        String sql="select * from programa where codpro="+id;
        try{
        con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            po.setCodprograma(rs.getInt("codpro"));
            po.setNomprograma(rs.getString("nompro"));
            
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se puede traer la informacion");
        
        }
        return po;
    }

    @Override
    public java.util.List listadopro() {
        ArrayList<Programa>lista=new ArrayList<Programa>();
        String sql="select * from programa";
        try{
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
            Programa pro=new Programa();
            pro.setCodprograma(rs.getInt("codpro"));
            pro.setNomprograma(rs.getString("nompro"));
            lista.add(pro);
            
        }
        }catch(Exception e){
        }
        return lista;
    }

    @Override
    public boolean registrarpro(Programa pro) {
       String sql="insert into programa(codpro,nompro)values('"+pro.getCodprograma()+"','"+pro.getNomprograma()+"')"; 
       try{
           con=cn.getConnection();
           ps=con.prepareStatement(sql);
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "Programa Registrado");
       }catch(Exception e){
       
       }
       return false;
    }

    @Override
    public boolean actualizarpro(Programa pro) {
        String sql="update programa set codpro='"+pro.getCodprograma()+"',nompro='"+pro.getNomprograma()+"' where codpro="+pro.getCodprograma();
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
        
        }
        return false;
    }

    @Override
    public boolean eliminarpro(int codpro) {
        String sql="delete from programa where codpro="+codpro;
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Programa Eliminado");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Programa no Eliminado");
        }
        return false;
    }
    
}
