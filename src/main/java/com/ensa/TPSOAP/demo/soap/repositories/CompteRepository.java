package com.ensa.TPSOAP.demo.soap.repositories;

import com.ensa.TPSOAP.demo.soap.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
}