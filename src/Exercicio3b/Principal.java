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
public class Principal {

    public static void main(String[] args) {
        Funcionario sal[] = new Funcionario[4];
        sal[0] = new Funcionario(1, 6000,6000);
        sal[1] = new Funcionario(2, 4000,4000);
        sal[2] = new Funcionario(3, 2000,2000);
        sal[3] = new Funcionario(4, 3000,3000);

        sal[0].getparcelaUm();
        sal[0].getparcelaDois();
        sal[1].getparcelaUm();
        sal[1].getparcelaDois();
        sal[2].getparcelaUm();
        sal[2].getparcelaDois();
        sal[3].getparcelaUm();
        sal[3].getparcelaDois();
    }
}
