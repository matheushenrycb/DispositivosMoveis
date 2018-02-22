/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3c;

/**
 *
 * @author Matheus HEnry
 */
public class Funcionario {
    private double salario;
    private double salario2;

    public double getSalario2() {
        return salario2;
    }

    public void setSalario2(double salario2) {
        this.salario2 = salario2;
    }
    public Funcionario() {
        this.salario = this.getSalario();
    }

    public double getSalario() {
        return 3000;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
     
}
