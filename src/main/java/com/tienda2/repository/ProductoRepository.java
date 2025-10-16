/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda2.repository;

import com.tienda2.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Juan
 */
public interface ProductoRepository extends JpaRepository<Categoria, Integer>{
    
}
