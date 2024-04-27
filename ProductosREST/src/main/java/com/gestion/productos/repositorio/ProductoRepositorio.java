package com.gestion.productos.repositorio;

import com.gestion.productos.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

//heredara de JpaRepository
public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {
}
