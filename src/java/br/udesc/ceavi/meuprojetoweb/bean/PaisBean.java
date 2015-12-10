/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.meuprojetoweb.bean;

import br.udesc.ceavi.meuprojetoweb.entity.Pais;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import org.apache.jasper.tagplugins.jstl.ForEach;

/**
 *
 * @author farah
 */
@Named
@ManagedBean
@SessionScoped
public class PaisBean implements Serializable {
    private Pais pais = new Pais();

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    private List<Pais> paises= new ArrayList<Pais>();

    public List<Pais> getPaises() {
        return paises;
    }

    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }
    
    
    public void salvar(){
        System.out.println("salvar");
        this.paises.add(this.pais);
        for(Pais p: this.paises){
            System.out.println(p.getNome());
        }
        this.pais = new Pais();
    }
}
