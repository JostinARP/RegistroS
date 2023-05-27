/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeldao;

import config.Conexion;
import interfaz.MeAprendiz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Aprendiz;


/**
 *
 * @author APRENDIZ
 */
public class AprendizDao implements MeAprendiz {

    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Aprendiz ap=new Aprendiz();
    
    
    
    @Override
    public Aprendiz list(int id) {
        String sql="select * from aprendiz where id="+id;
        try{
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        
        while(rs.next()){
            ap.setId(rs.getInt("id"));
            ap.setDocuA(rs.getInt("Docu"));
            ap.setNombreA(rs.getString("Nombrea"));
            ap.setApellidoA(rs.getString("Apellidoa"));
            ap.setCorreoA(rs.getString("Correoa"));
            ap.setTeleA(rs.getInt("Numcontacto"));
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se puede traer la informacion");
        }
        return ap;
    }

    @Override
    public List listadoA() {
        ArrayList<Aprendiz> lista= new ArrayList<Aprendiz>();
        String sql="select * from aprendiz";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            Aprendiz usu=new Aprendiz();
            usu.setId(rs.getInt("id"));
            usu.setDocuA(rs.getInt("Docu"));
            usu.setNombreA(rs.getString("Nombrea"));
            usu.setApellidoA(rs.getString("Apellidoa"));
            usu.setCorreoA(rs.getString("Correoa"));
            usu.setTeleA(rs.getInt("Numcontacto"));
            lista.add(usu);
            }
        }catch(Exception e){
        
        }
        return lista;
    }

    @Override
    public boolean registrarA(Aprendiz ap) {
        String sql="insert into aprendiz(Docu,Nombrea,Apellidoa,Correoa,Numcontacto) values('"+ap.getDocuA()+"','"+ap.getNombreA()+"','"+ap.getApellidoA()+"','"+ap.getCorreoA()+"','"+ap.getTeleA()+"')";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Aprendiz Registrado");
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Usuario ya esta regist ya esta registrado");
        }
        return false;
    }

    @Override
    public boolean actualizarA(Aprendiz ap) {
        String sql="update aprendiz set Docu='"+ap.getDocuA()+"',Nombrea='"+ap.getNombreA()+"',Apellidoa='"+ap.getApellidoA()+"',Correoa='"+ap.getCorreoA()+"',Numcontacto='"+ap.getTeleA()+"' where id="+ap.getId();
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        }catch(Exception e){
            
        }
    
    return false;
    }
    

    @Override
    public boolean eliminarA(int id) {
        
        String sql="delete from aprendiz where id="+id;
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Aprendiz Eliminado");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"El usuario no se pudo eliminar");
        }
        return false;
        
    }
    
}
