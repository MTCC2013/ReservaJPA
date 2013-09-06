package br.com.controller;

import br.com.model.negocio.Reserva;
import br.com.model.persistencia.dao.ReservaDAO;
import br.com.persistencia.ReservaDAOImpl;
import java.util.List;

/**
 * @author mauricio_p_cardoso
 */
public class ReservaController {

    public boolean salvar(Reserva professor) {
        ReservaDAO dao = new ReservaDAOImpl();
        return dao.save(professor);

    }

    public boolean excluir(int id) {
        ReservaDAO dao = new ReservaDAOImpl();
        return dao.remove(Reserva.class, id);

    }

    public List<Reserva> listarReserva() {
        ReservaDAO dao = new ReservaDAOImpl();
        return dao.getAll(Reserva.class);
    }
    
    public List<Reserva> listarReservasByNome(String nome) {
        ReservaDAO dao = new ReservaDAOImpl();
        return dao.getByNome(nome);
    }

    public Reserva listarReservaById(int id) {
        ReservaDAO dao = new ReservaDAOImpl();
        return dao.getById(Reserva.class, id);

    }
     public Reserva listarReservaByNome(String nome){
     ReservaDAO dao = new ReservaDAOImpl();
     return dao.getReservaByNome(Reserva.class, nome);
     }
     
    
}
