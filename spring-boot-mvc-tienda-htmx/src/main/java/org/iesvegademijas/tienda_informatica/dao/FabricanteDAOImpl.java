package org.iesvegademijas.tienda_informatica.dao;

import java.util.List;
import java.util.Optional;

import org.iesvegademijas.tienda_informatica.controlador.Pagina;
import org.iesvegademijas.tienda_informatica.modelo.Fabricante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class FabricanteDAOImpl  implements FabricanteDAO{

	 @Autowired
	 private JdbcTemplate jdbcTemplate;
	
	/**
	 * Inserta en base de datos el nuevo fabricante, actualizando el id en el bean fabricante.
	 */
	@Override	
	public void create(Fabricante fabricante) {
		
		jdbcTemplate.update("INSERT INTO fabricante (nombre) VALUES (?)",fabricante.getNombre());
		
	}

	/**
	 * Devuelve lista con todos loa fabricantes.
	 */
	@Override
	public List<Fabricante> getAll() {
		
		List<Fabricante> listFab = jdbcTemplate.query(
                "SELECT * FROM fabricante",
                (rs, rowNum) -> new Fabricante(rs.getInt("codigo"),rs.getString("nombre"))
        );
			
        return listFab;
        
	}

	@Override
	public Integer getAllCount() {

		return jdbcTemplate.queryForObject(
				"SELECT COUNT(*) FROM fabricante", Integer.class
		);

	}

	@Override
	public Pagina<Fabricante> getAllPagina(int numPag, int tamPag) {

		int offset =(numPag-1)*tamPag;
		int total = this.getAllCount();
		offset = (offset > total ? offset -tamPag: offset);

		List<Fabricante> listFab = jdbcTemplate.query(
				"SELECT * FROM fabricante LIMIT ?, ?",
				(rs, rowNum) -> new Fabricante(rs.getInt("codigo"),rs.getString("nombre")),
				offset,
				tamPag
		);

		return Pagina.<Fabricante>builder()
				.totalElementos(total)
				.tamanio(tamPag)
				.numeroDePagina(numPag)
				.inicioRangoDePagina(offset+1)
				.finalRangoDePagina(offset - tamPag  > total ? total : offset + tamPag)
				.numeroTotalDePaginas((int)(total / tamPag) + (total % tamPag > 0 ? 1: 0))
				.listado(listFab)
				.build();
	}

	/**
	 * Devuelve Optional de fabricante con el ID dado.
	 */
	@Override
	public Optional<Fabricante> find(int id) {
		
		Fabricante fab =  jdbcTemplate
				.queryForObject("SELECT * FROM fabricante WHERE codigo = ?"														
								, (rs, rowNum) -> new Fabricante(rs.getInt("codigo"),rs.getString("nombre"))  
								, id
								);
		
		if (fab != null) return Optional.of(fab);
		else return Optional.empty();
        
	}
	/**
	 * Actualiza fabricante con campos del bean fabricante según ID del mismo.
	 */
	@Override
	public void update(Fabricante fabricante) {
		
		int rows = jdbcTemplate.update("UPDATE fabricante SET nombre = ?  WHERE codigo = ?", fabricante.getNombre(), fabricante.getCodigo());

		if (rows == 0) System.out.println("Update de fabricante con 0 registros actualizados.");
    
	}

	/**
	 * Borra fabricante con ID proporcionado.
	 */
	@Override
	public void delete(int id) {
		
		int rows = jdbcTemplate.update("DELETE FROM fabricante WHERE codigo = ?", id);
		
		if (rows == 0) System.out.println("Update de fabricante con 0 registros actualizados.");		
		
	}

	@Override
	public void deleteAllProductosByIdFabricante(int idFabricante) {

		int rows = jdbcTemplate.update("DELETE FROM producto WHERE id_fabricante = ?", idFabricante);

		if (rows == 0) System.out.println("Delete de producto con 0 registros afectados.");
	}

}
