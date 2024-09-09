package Dao;

import Model.Paciente;

import java.util.List;

public class PacienteDAOH2 implements iDao<Paciente>{
    @Override
    public Paciente guardar(Paciente paciente) {
        return null;
    }

    @Override
    public void actualizar(Paciente paciente) {

    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public List<Paciente> listarTodos() {
        return List.of();
    }

    @Override
    public Paciente buscarPorId(Integer id) {
        return null;
    }
}
