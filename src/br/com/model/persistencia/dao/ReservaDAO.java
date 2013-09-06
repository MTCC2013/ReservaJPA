
package br.com.model.persistencia.dao;

import br.com.model.negocio.Reserva;
import java.util.List;

/**
 * @author mauricio_p_cardoso
 */
public interface ReservaDAO extends DAO<Reserva, Integer>{
    
    List<Reserva> getByNome (String nome);
    Reserva getReservasByNome(String nome);
    Reserva getReservaByNome(Class<Reserva> aClass, String nome);


   
  
}
