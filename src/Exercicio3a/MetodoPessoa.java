/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3a;

import javax.swing.JOptionPane;

/**
 *
 * @author Matheus HEnry
 */
public class MetodoPessoa {
     public void getNomeCompleto(){      
    Pessoa nomecompleto= new Pessoa();
    String nome = JOptionPane.showInputDialog("Insira o Nome da pessoa");
    String sobrenome = JOptionPane.showInputDialog("Insira o sobrenome da pessoa");
    nomecompleto.setSobrenome(sobrenome);
    nomecompleto.setNome(nome);
    
    JOptionPane.showMessageDialog(null,"O nome: " +nome+ sobrenome+" Foi adicionado com sucesso ");
    }
}
