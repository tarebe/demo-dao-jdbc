package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj); //fara a inserção
	void update(Seller obj); //fara a atualização
	void deleteById(Integer id); //Deletara por ID
	Seller findById(Integer id); //Verifica se o ID existe
	List<Seller> findAll(); //Retorna todos os Sellers
	
}
