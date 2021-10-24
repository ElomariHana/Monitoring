package org.ee.dao;
import org.ee.entities.Fmkhalfflow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FmkhalfflowRepository extends JpaRepository<Fmkhalfflow,Long>{

}