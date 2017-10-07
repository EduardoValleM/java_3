/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos2017;

/**
 *
 * @author T-107
*/
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mensajito {
    @Id//este no es el nobre del campo solo es la notacion que nos identificara el id del campo, nunca cambia de nobre e identifica 
            //a la primary key
    @GeneratedValue//esta notacion es para decir que se incrementa automaticamente
    private Integer id;
    
    private String titulo;
    
    private String cuerpo;

    public Mensajito(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    public Mensajito(Integer id) {
        this.id = id;
    }

    public Mensajito(Integer id, String titulo, String cuerpo) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    public Mensajito() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
}
