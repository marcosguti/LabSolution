package controller;

import java.util.List;

import hibernateUtil.BussinessException;

import clases.Paciente;
import dao.PacienteDAO;
import dao.PacienteDAOImpl;





public class PacienteController {

	
    PacienteDAO pacienteDAO;

    public PacienteController() {
        pacienteDAO=new PacienteDAOImpl();
    }

    public void guardar(Paciente paciente) throws BussinessException {

    	pacienteDAO.saveOrUpdate(paciente);
    }
    
    public Paciente getByNombreCedula(String nombre, String cedula) throws BussinessException {

    	return pacienteDAO.getByNombreCedula(nombre,cedula);
    }
    public List< Paciente >getAll( ) throws BussinessException {

    	return pacienteDAO.findAll();
    }
 

}
