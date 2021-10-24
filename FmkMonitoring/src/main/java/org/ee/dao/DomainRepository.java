package org.ee.dao;

import org.ee.entities.Domaine;
import org.ee.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DomainRepository extends JpaRepository<Domaine,Long>  {
	
}
