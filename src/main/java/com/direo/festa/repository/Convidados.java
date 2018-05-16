package com.direo.festa.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.direo.festa.model.Convidado;


public interface Convidados extends JpaRepository<Convidado, Long>{

}
