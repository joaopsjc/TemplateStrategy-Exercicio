/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extende;

import implementa.BairroCascatinha;
import modelo.Entrega;

/**
 *
 * @author ice
 */
public class Rua extends Entrega{
    public Rua()
    {
        this.bairro = new BairroCascatinha();
    }
    public String getTipo()
    {
        return "da rua ";
    }
}
