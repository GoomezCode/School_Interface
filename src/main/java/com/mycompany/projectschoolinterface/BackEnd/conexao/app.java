package com.mycompany.projectschoolinterface.BackEnd.conexao;


import com.mycompany.projectschoolinterface.BackEnd.model.bean.student;
import com.mycompany.projectschoolinterface.BackEnd.model.dao.studentDao;

import java.sql.SQLException;

public class app {
    public static void main(String[] args) throws SQLException {
        student student = new student();
        student.setNome("Daniel");
        student.setNascimento("2008-03-12");
        student.setRg("124361524");
        student.setCpf("5347624");
        student.setSerieEscolar("2Ano");
        student.setResidencia("Antônio Ambrósio");
        student.setSexo("M");
        new studentDao().createStudent(student);


        for(student s: new studentDao().dataStudent()){
            System.out.println("nome: "+ s.getNome());
            System.out.println("nascimento: "+ s.getNascimento());
            System.out.println("Rg: "+ s.getRg());
            System.out.println("cpf: "+ s.getCpf());
            System.out.println("SerieEscolar: "+ s.getSerieEscolar());
            System.out.println("Residencia: "+ s.getResidencia());
            System.out.println("sexo: "+ s.getSexo());
            System.out.println("===========================================");
        }




    }
}
