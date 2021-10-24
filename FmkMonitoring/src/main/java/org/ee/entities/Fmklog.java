package org.ee.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fmklog implements Serializable {

	
	@Id
	@GeneratedValue
	private Long id;	
	private String logcode;
	private String description;
	private String typelog;
	private String typecode;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogcode() {
		return logcode;
	}
	public void setLogcode(String logcode) {
		this.logcode = logcode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTypelog() {
		return typelog;
	}
	public void setTypelog(String typelog) {
		this.typelog = typelog;
	}
	public String getTypecode() {
		return typecode;
	}
	public void setTypecode(String typecode) {
		this.typecode = typecode;
	}
	public Fmklog() {
		super();
	}
	public Fmklog(String logcode, String description, String typelog, String typecode) {
		super();
		this.logcode = logcode;
		this.description = description;
		this.typelog = typelog;
		this.typecode = typecode;
	}
	
	

}
