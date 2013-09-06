
package br.com.model.negocio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author mauricio_p_cardoso
 */

@Entity
public class Professor implements Serializable {
    
    
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String formacao;    
    private String dtCad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getDtCad() {
        return dtCad;
    }

    public void setDtCad(String dtCad) {
        this.dtCad = dtCad;
    }

    
    public String toString() {
        return this.nome;
    }
    
}
