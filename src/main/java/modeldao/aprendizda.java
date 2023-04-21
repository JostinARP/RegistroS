/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeldao;

import Interfaz.MeAprendiz;
import Modelo.Aprendiz;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author APRENDIZ
 */
public class aprendizda implements MeAprendiz{
 Conexion co=new Conexion();
    Connection cn; 
    PreparedStatement pc;
    ResultSet rs;
    Aprendiz ap= new Aprendiz();
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
        cn=co.getConnection();
        pc=cn.prepareStatement(sql);
        rs=pc.executeQuery();
        /*while(rs.next()){
        ap.setId(rs.getInt("Id"));
        ap.setDocuA(rs.getInt("Docu"));
        ap.setNombreA(rs.getString("Nombrea"));
        ap.setApellidoA(rs.getString("Apellidoa"));
        ap.setCorreoA(rs.getString("Correoa"));
        ap.setTeleA(rs.getInt("Numcontacto"));
        }*/
    }catch(Exception e){
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
