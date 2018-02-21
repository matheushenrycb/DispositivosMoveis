/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3b;

/**
 *
 * @author Matheus HEnry
 */
public class Funcionario extends Principal {

    int matricula;
    double salario1=3000;
    double salario2=2000;

//    public Funcionario(int matricula,double salario1) {
//        this.matricula= matricula;
//        this.salario1 = salario1*0.40 ;
//        
//    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario1() {
        return salario1;
    }

    public void setSalario1(double salario1) {
        this.salario1 = salario1*0.40;
    }

    public double getSalario2() {
        return salario1;
    }

    public void setSalario2(double salario2) {
        this.salario2 = salario2- getSalario1();
    }

    public void getparcelaUm() {
        System.out.println("-------------------------------------------------");
        System.out.println("Primeira parcela do Salario: " + this.getSalario1());
    }

    public void getparcelaDois() {
        
        System.out.println("Segunda parcela do Salario: " + this.getSalario2());
    }
}
