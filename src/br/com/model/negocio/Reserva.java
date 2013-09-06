
package br.com.model.negocio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author mauricio_p_cardoso
 */

@Entity
public class Reserva implements Serializable {
    
    
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    @JoinColumn(name = "idProfessor", referencedColumnName = "id")
    private Professor prof;    
    private String dtAula;
    private String dtCad;
    private String sala;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Professor getProf() {
        return prof;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }

    public String getDtAula() {
        return dtAula;
    }

    public void setDtAula(String dtAula) {
        this.dtAula = dtAula;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getDtCad() {
        return dtCad;
    }

    public void setDtCad(String dtCad) {
        this.dtCad = dtCad;
    }

    
    
}

