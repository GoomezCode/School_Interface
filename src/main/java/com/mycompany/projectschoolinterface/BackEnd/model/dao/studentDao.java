package com.mycompany.projectschoolinterface.BackEnd.model.dao;

import com.mycompany.projectschoolinterface.BackEnd.conexao.conexao;
import com.mycompany.projectschoolinterface.BackEnd.model.bean.student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class studentDao {

    public void createStudent(student s) throws SQLException {

        Connection conn = conexao.getConnection();
        PreparedStatement ps = null;

        String sql = "insert into student "+
                "(nome, nascimento, rg, cpf,serieEscolar,residencia,sexo) values "+
                "(?,?,?,?,?,?,?)";
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1, s.getNome());
            ps.setString(2, s.getNascimento());
            ps.setString(3, s.getRg());
            ps.setString(4, s.getCpf());
            ps.setString(5, s.getSerieEscolar());
            ps.setString(6, s.getResidencia());
            ps.setString(7, s.getSexo());
            ps.executeUpdate();

            System.out.println("Salvo com sucesso: ");
        } catch (SQLException e) {
            System.out.println("Erro ao salvar"+ e);
        }finally {
            conexao.closeConnection(conn,ps);
        }
    }


    public List<student> dataStudent() throws SQLException {
        Connection conn = conexao.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from student";

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        List<student> listaStudent = new ArrayList<>();

        while(rs.next()){
            student student = new student();

            student.setIdResponsavel(rs.getInt("idResponsavel"));
            student.setNome(rs.getString("nome"));
            student.setNascimento(rs.getString("nascimento"));
            student.setRg(rs.getString("rg"));
            student.setCpf(rs.getString("cpf"));
            student.setSerieEscolar(rs.getString("serieEscolar"));
            student.setResidencia(rs.getString("residencia"));
            student.setSexo(rs.getString("sexo"));

            listaStudent.add(student);

        }
        conexao.closeConnection(conn,ps,rs);
        return listaStudent;
    }


}
