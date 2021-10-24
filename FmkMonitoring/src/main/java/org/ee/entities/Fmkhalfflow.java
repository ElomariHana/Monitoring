package org.ee.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fmkhalfflow  implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String halfflowcode;
	private String flowcode;
	private String src;
	private String description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHalfflowcode() {
		return halfflowcode;
	}
	public void setHalfflowcode(String halfflowcode) {
		this.halfflowcode = halfflowcode;
	}
	public String getFlowcode() {
		return flowcode;
	}
	public void setFlowcode(String flowcode) {
		this.flowcode = flowcode;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Fmkhalfflow() {
		super();
	}
	public Fmkhalfflow(String halfflowcode, String flowcode, String src, String description) {
		super();
		this.halfflowcode = halfflowcode;
		this.flowcode = flowcode;
		this.src = src;
		this.description = description;
	}
	
	
	
}
