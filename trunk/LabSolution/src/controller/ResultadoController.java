package controller;

import java.util.List;

import hibernateUtil.BussinessException;

import clases.Paciente;
import clases.Resultado;
import dao.PacienteDAO;
import dao.PacienteDAOImpl;
import dao.ResultadoDAO;
import dao.ResultadoDAOImpl;

public class ResultadoController {

           ResultadoDAO resultadoDAO;

    public ResultadoController() {
        resultadoDAO = new ResultadoDAOImpl();
    }

    public void guardar(Resultado resultado) throws BussinessException {

        resultadoDAO.saveOrUpdate(resultado);
    }
  public List<Resultado> getAll() throws BussinessException {
        return resultadoDAO.findAll();
    }


    public void delete(String id) throws BussinessException {
        resultadoDAO.delete(id);
    }
}
