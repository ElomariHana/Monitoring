package org.ee.dao;

import org.ee.entities.Fmklog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FmklogRepository extends JpaRepository<Fmklog,Long> {
	 

}
