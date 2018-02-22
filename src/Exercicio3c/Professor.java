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
public class Professor extends Funcionario {

   public void getSalarioPrimeiraParcela() {
        System.out.println("-------------------------------------------------");
        System.out.println("Primeira parcela do Salario: " + this.getSalario());
    }

    public void getSalarioSegundaParcela() {
        System.out.println("Segunda parcela do Salario: " + this.getSalario2());
    }
}
