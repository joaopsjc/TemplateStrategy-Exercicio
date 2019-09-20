/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extende;

import implementa.BairroSaoPedro;
import modelo.Entrega;

/**
 *
 * @author ice
 */
public class Avenida extends Entrega{
    public Avenida()
    {
        this.bairro = new BairroSaoPedro();
    }
    public String getTipo()
    {
        return "da Avenida ";
    }
}
