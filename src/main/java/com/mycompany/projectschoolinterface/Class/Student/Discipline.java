package com.mycompany.projectschoolinterface.Class.Student;

import java.util.Arrays;
import java.util.Objects;

public class Discipline {
    private String Discipline;
    private Double[] nota = new Double[4];

    public Double geSomaNota(){
        Double somaNotas = 0.0;
        for(int i =0; i < getNota().length; i ++){
         somaNotas += getNota()[i];
        }
        return somaNotas / 4;
    }

    public String getDiscipline() {
        return Discipline;
    }

    public void setDiscipline(String discipline) {
        Discipline = discipline;
    }

    public Double[] getNota() {
        return nota;
    }

    public void setNota(Double[] nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Discipline that = (Discipline) o;
        return Objects.equals(Discipline, that.Discipline) && Objects.deepEquals(nota, that.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Discipline, Arrays.hashCode(nota));
    }
}
