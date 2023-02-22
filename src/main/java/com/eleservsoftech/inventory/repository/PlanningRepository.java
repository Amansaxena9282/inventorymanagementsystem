package com.eleservsoftech.inventory.repository;

import com.eleservsoftech.inventory.model.Planning;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface PlanningRepository extends JpaRepository<Planning,Long> {
}
