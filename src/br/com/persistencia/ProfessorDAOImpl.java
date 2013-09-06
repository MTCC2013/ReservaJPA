
package br.com.persistencia;

import br.com.model.negocio.Professor;
import br.com.model.persistencia.dao.ProfessorDAO;
import java.util.List;
import javax.persistence.Query;

/**
 * @author mauricio_p_cardoso
 */
public class ProfessorDAOImpl extends DAOImpl<Professor, Integer> implements ProfessorDAO {

  
    public List<Professor> getByNome(String nome) {
        return getEntityManager().createQuery("select c from Professor c where c.nome like "
                + "'%" + nome + "%'").getResultList();
    }

  
    public Professor getProfessoresByNome(String nome) {
       Query q = getEntityManager().createQuery("select c from Professor c where c.nome like "
                + "'%" + nome + "%'", Professor.class);
        List<Professor> profs = q.getResultList();
        Professor c1 = new Professor();
        for (Professor c : profs) {
            c1 = c;
        }
        return c1;
    }

  
   
    public Professor getProfessorByNome(Class<Professor> Class, String nome) {
          Query q = getEntityManager().createQuery("select c from Professor c where c.nome"
                + " like '%"+ nome +"%'", Professor.class);
        List<Professor> profs = q.getResultList();
        Professor c1 = new Professor();
        for (Professor c : profs) {
            c1 = c;
        }
        return c1;
            
    }



}
