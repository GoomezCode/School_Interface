package com.mycompany.projectschoolinterface.Class.Employee;

import com.mycompany.projectschoolinterface.Class.superClass;

import java.util.Arrays;
import java.util.Objects;

public class employee extends superClass {
    private String[] funcao = {"Estágiario", "Professor", "Diretor", "Coordenador", "Limpeza"};
    private String residencia;
    private Boolean contrato;
    private Boolean student;
    private String[] turno = {"Manhã", "integral", "tarde"};


// ================== Getters and Setters ==================
    public String[] getFuncao() {
        return funcao;
    }

    public void setFuncao(String[] funcao) {
        this.funcao = funcao;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public Boolean getContrato() {
        return contrato;
    }

    public void setContrato(Boolean contrato) {
        this.contrato = contrato;
    }

    public Boolean getStudent() {
        return student;
    }

    public void setStudent(Boolean student) {
        this.student = student;
    }

    public String[] getTurno() {
        return turno;
    }

    public void setTurno(String[] turno) {
        this.turno = turno;
    }
// ================== Getters and Setters ==================

// ================== HashCode and Equals ==================
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        employee employee = (employee) o;
        return Objects.deepEquals(funcao, employee.funcao) && Objects.equals(residencia, employee.residencia) && Objects.equals(contrato, employee.contrato) && Objects.equals(student, employee.student) && Objects.deepEquals(turno, employee.turno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Arrays.hashCode(funcao), residencia, contrato, student, Arrays.hashCode(turno));
    }
// ================== HashCode and Equals ==================

// ================== ToString ==================
    @Override
    public String toString() {
        return "employee{" +
                "funcao=" + Arrays.toString(funcao) +
                ", residencia='" + residencia + '\'' +
                ", contrato=" + contrato +
                ", student=" + student +
                ", turno=" + Arrays.toString(turno) +
                '}';
    }
// ================== ToString ==================


}
