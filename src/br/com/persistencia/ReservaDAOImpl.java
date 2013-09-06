
package br.com.persistencia;

import br.com.model.negocio.Reserva;
import br.com.model.persistencia.dao.ReservaDAO;
import java.util.List;
import javax.persistence.Query;

/**
 * @author mauricio_p_cardoso
 */
public class ReservaDAOImpl extends DAOImpl<Reserva, Integer> implements ReservaDAO {

  
    public List<Reserva> getByNome(String nome) {
        return getEntityManager().createQuery("select c from Reserva c where c.sala like "
                + "'%" + nome + "%'").getResultList();
    }

  
    public Reserva getReservasByNome(String nome) {
       Query q = getEntityManager().createQuery("select c from Reserva c where c.nome like "
                + "'%" + nome + "%'", Reserva.class);
        List<Reserva> profs = q.getResultList();
        Reserva c1 = new Reserva();
        for (Reserva c : profs) {
            c1 = c;
        }
        return c1;
    }

  
   
    public Reserva getReservaByNome(Class<Reserva> Class, String sala) {
          Query q = getEntityManager().createQuery("select c from Reserva c where c.sala"
                + " like '%"+ sala +"%'", Reserva.class);
        List<Reserva> profs = q.getResultList();
        Reserva c1 = new Reserva();
        for (Reserva c : profs) {
            c1 = c;
        }
        return c1;
            
    }



}
