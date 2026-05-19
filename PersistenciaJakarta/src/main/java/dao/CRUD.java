package dao;

import java.util.List;

public interface CRUD<T> {

    public List<T> listar();
    public void guardar(T Object);
    public void eliminar(int id);
    public T buscar(int id);
}
