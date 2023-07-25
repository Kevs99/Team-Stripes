package com.proy.tienda.service;

import java.util.List;
import java.util.Optional;

import com.proy.tienda.model.Orden;
import com.proy.tienda.model.Usuario;

public interface IOrdenService {
	List<Orden> findAll();
	Optional<Orden> findById(Integer id);
	Orden save (Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario (Usuario usuario);
}
