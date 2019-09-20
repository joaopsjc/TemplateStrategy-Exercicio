/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementa;

import modelo.Bairro;

/**
 *
 * @author ice
 */
public class BairroSaoPedro implements Bairro{

    public String obterFrete() {
        return "R$5.00";
    }

    public String obterBairro() {
        return " São Pedro";
    }    
}
