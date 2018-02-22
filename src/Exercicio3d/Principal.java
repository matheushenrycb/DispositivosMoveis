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
public class Principal {
    public static void main (String []args){
    Pessoa pes[] = new Pessoa[3];
        pes[0] = new Pessoa("mario","lopes",0,0);
        pes[1] = new Pessoa("Lucas", "Mendes", 2000,2000);
        pes[2] = new Pessoa("Raphael", "Lira", 500,500);
        pes[0].getNomeCompleto();
        pes[0].getSalarioPrimeiraParcela();
        pes[0].getSalarioSegundaParcela();
        pes[1].getNomeCompleto();
        pes[1].getSalarioPrimeiraParcela();
        pes[1].getSalarioSegundaParcela();
        pes[2].getNomeCompleto();
        pes[2].getSalarioPrimeiraParcela();
        pes[2].getSalarioSegundaParcela();
    }
}
