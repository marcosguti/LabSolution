package dao;

import java.util.List;
import java.util.logging.Level;

import org.hibernate.Query;
import org.hibernate.Session;

import clases.Paciente;

import hibernateUtil.BussinessException;


public class PacienteDAOImplHibernate extends GenericDAOImplHibernate<Paciente, Integer> implements PacienteDAO {

	@Override
	public List< Paciente> getByCed(String cedula) throws BussinessException {
		
		Session session = sessionFactory.getCurrentSession();
		try {
			Query query = 
					session.createQuery(
							"SELECT e FROM Paciente e WHERE e.cedula = ?");
			query.setParameter(0, cedula);
			List<Paciente> paciente = (List<Paciente>) query.list();
			return paciente;
			
			
			
//			session.beginTransaction();
//			Paciente entity = (Paciente) session.get(, cedula);
//			session.getTransaction().commit();
//
//			return entity;
		} catch (javax.validation.ConstraintViolationException cve) {
			try {
				if (session.getTransaction().isActive()) {
					session.getTransaction().rollback();
				}
			} catch (Exception exc) {
exc.printStackTrace()	;		}
			throw new BussinessException(cve);
		} catch (org.hibernate.exception.ConstraintViolationException cve) {
			try {
				if (session.getTransaction().isActive()) {
					session.getTransaction().rollback();
				}
			} catch (Exception exc) {
				exc.printStackTrace();			}
			throw new BussinessException(cve);
		} catch (RuntimeException ex) {
			try {
				if (session.getTransaction().isActive()) {
					session.getTransaction().rollback();
				}
			} catch (Exception exc) {
				exc.printStackTrace();					}
			throw ex;
		} catch (Exception ex) {
			try {
				if (session.getTransaction().isActive()) {
					session.getTransaction().rollback();
				}
			} catch (Exception exc) {
				exc.printStackTrace();					}
			throw new RuntimeException(ex);
		}
	}

}
