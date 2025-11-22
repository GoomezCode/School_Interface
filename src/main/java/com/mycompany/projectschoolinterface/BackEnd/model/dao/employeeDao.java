package com.mycompany.projectschoolinterface.BackEnd.model.dao;

import com.mycompany.projectschoolinterface.BackEnd.conexao.conexao;
import com.mycompany.projectschoolinterface.BackEnd.model.bean.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class employeeDao {
    public void createEmployee(employee e){
        Connection conn = conexao.getConnection();
        PreparedStatement ps = null;

        String sql = "insert into employee\n" +
                "(nome, nascimento,sexo,rg,cpf,funcao,residencia,contrato,estudante,turno) values\n" +
                "(?,?,?,?,?,?,?,?,?,?,)";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,  e.getNome());
            ps.setString(2,e.getNascimento());
            ps.setString(3,e.getSexo());
            ps.setString(4,e.getRg());
            ps.setString(5,e.getCpf());
            ps.setString(6,e.getFuncao());
            ps.setString(7,e.getResidencia());
            ps.setBoolean(8, e.getContrato());
            ps.setBoolean(9, e.getEstudante());
            ps.setString(10, e.getTurno());
            ps.executeUpdate();
            conexao.closeConnection(conn,ps);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<employee> dataEmployee() throws SQLException {
        Connection conn = conexao.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from employee";


        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

        List<employee> employeeList = new ArrayList<>();


        while(rs.next()){
            employee e = new employee();
            e.setId(rs.getInt("id"));
            e.setNome(rs.getString("nome"));
            e.setNascimento(rs.getString("nascimento"));
            e.setSexo(rs.getString("sexo"));
            e.setRg(rs.getString("rg"));
            e.setCpf(rs.getString("cpf"));
            e.setFuncao(rs.getString("funcao"));
            e.setResidencia(rs.getString("residencia"));
            e.setContrato(rs.getBoolean("contrato"));
            e.setEstudante(rs.getBoolean("estudante"));
            e.setTurno(rs.getString("turno"));
            employeeList.add(e);
        }
        conexao.closeConnection(conn,ps,rs);
        return employeeList;
    }
}
