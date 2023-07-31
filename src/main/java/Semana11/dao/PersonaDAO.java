package Semana11.dao;

import Semana11.dto.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {

    public static List<Persona> listar() {
        try {
            String sql = "SELECT * FROM persona";
            PreparedStatement pstmt;
            pstmt = MySQL.getInstance().getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            List<Persona> lista = new ArrayList<>();
            while (rs.next()) {
                Persona temp = new Persona();
                temp.setCodiPers(rs.getInt(1));
                temp.setAppaPers(rs.getString(2));
                temp.setApmaPers(rs.getString(3));
                temp.setNombPers(rs.getString(4));
                lista.add(temp);
            }
            return lista;
        } catch (Exception ex) {
            return null;
        }
    }
    
    public static void mostrar(){
        List<Persona> lista = listar();
        for (Persona persona : lista) {
            System.out.println(persona);
        }
    }

}
