package org.ee.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Fmkflow implements Serializable {
	
	@Id
	@GeneratedValue
	private Long flowid;	
	private String flowcode;
	private String src;
	private String dest;
	private String description;
	
	public Long getFlowid() {
		return flowid;
	}
	public void setFlowid(Long flowid) {
		this.flowid = flowid;
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
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Fmkflow() {
		super();
	}
	public Fmkflow(String flowcode, String src, String dest, String description) {
		super();
		this.flowcode = flowcode;
		this.src = src;
		this.dest = dest;
		this.description = description;
	}
	

}
