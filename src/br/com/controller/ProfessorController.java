package br.com.controller;

import br.com.model.negocio.Professor;
import br.com.model.persistencia.dao.ProfessorDAO;
import br.com.persistencia.ProfessorDAOImpl;
import java.util.List;

/**
 * @author mauricio_p_cardoso
 */
public class ProfessorController {

    public boolean salvar(Professor professor) {
        ProfessorDAO dao = new ProfessorDAOImpl();
        return dao.save(professor);

    }

    public boolean excluir(int id) {
        ProfessorDAO dao = new ProfessorDAOImpl();
        return dao.remove(Professor.class, id);

    }

    public List<Professor> listarProfessor() {
        ProfessorDAO dao = new ProfessorDAOImpl();
        return dao.getAll(Professor.class);
    }
    
    public List<Professor> listarProfessoresByNome(String nome) {
        ProfessorDAO dao = new ProfessorDAOImpl();
        return dao.getByNome(nome);
    }

    public Professor listarProfessorById(int id) {
        ProfessorDAO dao = new ProfessorDAOImpl();
        return dao.getById(Professor.class, id);

    }
     public Professor listarProfessorByNome(String nome){
     ProfessorDAO dao = new ProfessorDAOImpl();
     return dao.getProfessorByNome(Professor.class, nome);
     }
     
    
}
