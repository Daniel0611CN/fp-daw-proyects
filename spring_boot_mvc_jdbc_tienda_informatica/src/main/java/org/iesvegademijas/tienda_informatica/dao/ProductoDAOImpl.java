package org.iesvegademijas.tienda_informatica.dao;

import org.iesvegademijas.tienda_informatica.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoDAOImpl implements ProductoDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(Producto producto) {
        jdbcTemplate.update("INSERT INTO producto (nombre, precio, id_fabricante) VALUES (?, ?, ?)",
                producto.getNombre(), producto.getPrecio(), producto.getId_fabricante());
    }

    @Override
    public List<Producto> getAll() {

        List<Producto> listProd = jdbcTemplate.query(
                "SELECT * FROM producto",
                (rs, rowNum) -> new Producto(rs.getInt("codigo"),
                                                          rs.getString("nombre"),
                                                          rs.getDouble("precio"),
                                                          rs.getInt("id_fabricante"))
        );

        return listProd;
    }

    @Override
    public Optional<Producto> find(int id) {

        Producto prod = jdbcTemplate.queryForObject(
                "SELECT * FROM producto WHERE codigo = ?",
                (rs, rowNum) -> new Producto(rs.getInt("codigo"),
                                                          rs.getString("nombre"),
                                                          rs.getDouble("precio"),
                                                          rs.getInt("id_fabricante")),
                id
        );

        if (prod != null) return Optional.of(prod);
        else return Optional.empty();
    }

    @Override
    public void update(Producto producto) {

        int rows = jdbcTemplate.update("UPDATE producto SET nombre = ?, precio = ?, id_fabricante = ? WHERE codigo = ?",
                producto.getNombre(), producto.getPrecio(), producto.getId_fabricante(), producto.getCodigo());
        if (rows == 0) System.out.println("Update de productos con 0 registros actualizados.");
    }

    @Override
    public void delete(int id) {
        int rows = jdbcTemplate.update("DELETE FROM producto WHERE codigo = ?", id);

        if (rows == 0) System.out.println("Update de producto con 0 registros actualizados.");
    }
}
