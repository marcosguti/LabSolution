package dao;

import java.util.List;

import hibernateUtil.BussinessException;

import clases.Paciente;

public interface PacienteDAO extends GenericDAO<Paciente, Integer> {
	public List< Paciente> getByCed(String cedula) throws BussinessException;
//	public boolean deleteByCed(String cedula) throws BussinessException;
}
