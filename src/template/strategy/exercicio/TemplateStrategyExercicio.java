/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.strategy.exercicio;

import extende.*;
import modelo.*;

/**
 *
 * @author ice
 */
public class TemplateStrategyExercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entrega entrega1 = new Rua();
        Entrega entrega2 = new Avenida();
        
        entrega1.setLocal("rua1");
        entrega2.setLocal("avenida1");
        
        System.out.println(entrega1.getDadosEntrega());
        System.out.println(entrega2.getDadosEntrega());

    }
    
}
