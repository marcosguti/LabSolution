/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import clases.Paciente;
import clases.Prueba;
import clases.PruebaResultado;
import clases.Resultado;
import hibernateUtil.BussinessException;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author marcosguti
 */
public class ResultadoDAOImpl extends GenericDAOImplHibernate<Resultado, Integer> implements ResultadoDAO {

  
    
    @Override
    public boolean delete(String idResultado) throws BussinessException {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        try {
            Query query
                    = session.createQuery(
                            "SELECT e FROM Resultado e WHERE e.resultado = ?");
            query.setParameter(0, idResultado);
            Resultado resultado = (Resultado) query.uniqueResult();
            session.getTransaction().commit();
            if (resultado != null) {
                delete(resultado.getId());
            }

//			session.beginTransaction();
//			Paciente entity = (Paciente) session.get(, cedula);
//			session.getTransaction().commit();
//
//			return entity;
        } catch (Exception w) {
            w.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Resultado get(String id) throws BussinessException {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        try {
            Query query
                    = session.createQuery(
                            "SELECT e FROM Resultado e WHERE e.id = ?");
            query.setParameter(0, id);
            Resultado resultado = (Resultado) query.uniqueResult();
            session.getTransaction().commit();
            if (resultado != null) {
                return resultado;
            }

        } catch (Exception w) {
            w.printStackTrace();
        }
        return null;
    }


 
}
