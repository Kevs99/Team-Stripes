package com.proy.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proy.tienda.model.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
