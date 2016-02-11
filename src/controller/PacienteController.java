package controller;

import java.util.List;

import hibernateUtil.BussinessException;

import clases.Paciente;
import dao.PacienteDAO;
import dao.PacienteDAOImplHibernate;





public class PacienteController {

	
    PacienteDAO pacienteDAO;

    public PacienteController() {
        pacienteDAO=new PacienteDAOImplHibernate();
    }

    public void guardar(Paciente paciente) throws BussinessException {

    	pacienteDAO.saveOrUpdate(paciente);
    }
    
    public List< Paciente >getByCed(String cedula) throws BussinessException {

    	return pacienteDAO.getByCed(cedula);
    }
    public List< Paciente >getAll( ) throws BussinessException {

    	return pacienteDAO.findAll();
    }
 

}
