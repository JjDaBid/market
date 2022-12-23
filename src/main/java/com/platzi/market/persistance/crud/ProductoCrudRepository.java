package com.platzi.market.persistance.crud;

import com.platzi.market.persistance.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {


//        @Query(value= "SELECT * FROM PRODUCTOS WHERE ID_CATEGORIA = ?", nativeQuery = true);
        List<Producto>findByIdCategoriaOrderByNombreAsc(int idCategoria);

        Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);


}
