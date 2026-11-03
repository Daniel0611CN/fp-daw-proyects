package org.iesvegademijas.tienda_informatica.dao;

import java.util.List;
import java.util.Optional;

import org.iesvegademijas.tienda_informatica.controlador.Pagina;
import org.iesvegademijas.tienda_informatica.modelo.Fabricante;

public interface FabricanteDAO {
		
	public void create(Fabricante fabricante);
	
	public List<Fabricante> getAll();

	Integer getAllCount();

	public Pagina<Fabricante> getAllPagina(int numPag, int tamanioPag);

    public Optional<Fabricante>  find(int id);
	
	public void update(Fabricante fabricante);
	
	public void delete(int id);

	public void deleteAllProductosByIdFabricante(int idFabricante);

}
