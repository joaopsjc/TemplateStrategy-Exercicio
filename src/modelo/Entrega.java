/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ice
 */
public abstract class Entrega {
    protected Bairro bairro;
    public String local;

    public abstract String getTipo();
    
    public String getFrete()
    {
        return bairro.obterFrete();
    }
    
    public String getDadosEntrega()
    {
        return "O frete " + getTipo() + getLocal() + " será " + getFrete();
    }
    
    public String getLocal() {
        return local;
    }
    public void setLocal(String local)
    {
        this.local = local;
    }
    
}
