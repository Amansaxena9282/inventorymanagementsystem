package com.eleservsoftech.inventory.repository;

import com.eleservsoftech.inventory.model.Stagging;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface StaggingRepository extends JpaRepository<Stagging,Long> {
}
