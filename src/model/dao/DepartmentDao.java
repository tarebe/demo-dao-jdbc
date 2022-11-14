package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj); //fara a inserção
	void update(Department obj); //fara a atualização
	void deleteById(Integer id); //Deletara por ID
	Department findById(Integer id); //Verifica se o ID existe
	List<Department> findAll(); //Retorna todos os Departments.
}
