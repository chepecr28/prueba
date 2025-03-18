/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.prueba.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.prueba.domain.Categoria;

    public interface CategoriaDao extends JpaRepository<Categoria, Long>{
    
}
