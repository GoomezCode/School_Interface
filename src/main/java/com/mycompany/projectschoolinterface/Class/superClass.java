package com.mycompany.projectschoolinterface.Class;

import java.util.Objects;

public abstract class superClass {
    private String nome;
    private int idade;
    private String serieEscolar;
    private String cpf;
    private String rg;


// ================== Getters and Setters ==================
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSerieEscolar() {
        return serieEscolar;
    }

    public void setSerieEscolar(String serieEscolar) {
        this.serieEscolar = serieEscolar;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
// ================== Getters and Setters ==================

// ================== ToString ==================
    @Override
    public String toString() {
        return "superClass{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", serieEscolar='" + serieEscolar + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                '}';
    }
// ================== ToString ==================

// ================== Equals and HashCode ==================
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        superClass that = (superClass) o;
        return idade == that.idade && Objects.equals(nome, that.nome) && Objects.equals(serieEscolar, that.serieEscolar) && Objects.equals(cpf, that.cpf) && Objects.equals(rg, that.rg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, serieEscolar, cpf, rg);
    }
// ================== Equals and hashCode ==================
}
