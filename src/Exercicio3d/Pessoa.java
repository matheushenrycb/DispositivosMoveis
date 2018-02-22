/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3d;

/**
 *
 * @author Matheus HEnry
 */
public class Pessoa {

    public Pessoa(String nome, String sobrenome, double salario , double salario2) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        this.salario2 = salario2;
    }
    private String nome;
    private String sobrenome;
    private double salario;
    private double salario2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario * 0.40;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario2() {
        return salario2 * 0.60;
    }

    public void setSalario2(double salario2) {
        this.salario2 = salario2;
    }

    public void getNomeCompleto() {
        System.out.println("-------------------------------------------------");
        System.out.println("O nome do funcionario é:" + this.getNome() + " " + this.getSobrenome());
    }

    public void getSalarioPrimeiraParcela() {

        System.out.println("Primeira parcela do Salario: " + this.getSalario());
    }

    public void getSalarioSegundaParcela() {
        System.out.println("Segunda parcela do Salario: " + this.getSalario2());
    }
}
