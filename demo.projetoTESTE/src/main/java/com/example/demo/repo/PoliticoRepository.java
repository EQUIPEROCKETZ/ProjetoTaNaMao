package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Politico;

public interface PoliticoRepository  extends JpaRepository<Politico,Long>{

}
