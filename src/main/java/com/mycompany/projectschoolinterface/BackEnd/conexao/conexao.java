package com.mycompany.projectschoolinterface.BackEnd.conexao;

import javax.swing.*;
import java.sql.*;

public class conexao {
    private final static String DRIVE = "com.mysql.jdbc.Driver";
    private final static String url = "jdbc:mysql://127.0.0.1:3306/softwareSchool";
    private final static String user = "root";
    private final static String password = "";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVE);
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão: " + ex);
        }
    }
    public static void closeConnection(Connection con) throws SQLException {
        if (con != null) {
            con.close();
        }
    }
    public static void closeConnection(Connection con, PreparedStatement ps) throws SQLException {
        closeConnection(con);

        if (ps != null) {
            ps.close();
        }
    }
    public static void closeConnection(Connection con, PreparedStatement ps, ResultSet rs) throws SQLException {
        closeConnection(con,ps);
        if (rs != null) {
            rs.close();
        }
    }


}
