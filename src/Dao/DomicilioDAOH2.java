package Dao;

import Model.Domicilio;

import java.util.List;

public class DomicilioDAOH2 implements iDao<Domicilio>{
    @Override
    public Domicilio guardar(Domicilio domicilio) {
        return null;
    }

    @Override
    public void actualizar(Domicilio domicilio) {

    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public List<Domicilio> listarTodos() {
        return List.of();
    }

    @Override
    public Domicilio buscarPorId(Integer id) {
        return null;
    }
}
