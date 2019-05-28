/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoa;

/**
 *
 * @author ifnmg
 */
public class Teste {
public static void main(String[] args) {
        Pessoa p = new Pessoa ("João", "Rua Dr Duque", "11111111");        
        p.mostrar();
        
        Fornecedor f = new Fornecedor ("Celestino", "Rua L", "1333333", 100, 500);
        f.mostrar();
        
        Empregado e = new Empregado ("Lilian", "Rua Oiapok", "1551111", 10, 500, 0.075);
        e.mostrar();
        
        System.out.println(f.obterSaldo());
        System.out.println(e.calcularSalario());
        
    }    
}
