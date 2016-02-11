package dao;

import java.util.List;

import com.fpmislata.persistencia.hibernate.util.BussinessException;

import clases.Paciente;

public interface PacienteDAO extends GenericDAO<Paciente, Integer> {
	public List< Paciente> getByCed(String cedula) throws BussinessException;
//	public boolean deleteByCed(String cedula) throws BussinessException;
}
