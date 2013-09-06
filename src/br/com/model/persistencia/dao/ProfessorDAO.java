
package br.com.model.persistencia.dao;

import br.com.model.negocio.Professor;
import java.util.List;

/**
 * @author mauricio_p_cardoso
 */
public interface ProfessorDAO extends DAO<Professor, Integer>{
    
    List<Professor> getByNome (String nome);
    Professor getProfessoresByNome(String nome);
    Professor getProfessorByNome(Class<Professor> aClass, String nome);


   
  
}
