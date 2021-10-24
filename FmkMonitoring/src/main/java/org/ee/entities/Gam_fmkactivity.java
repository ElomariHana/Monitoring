/*package org.ee.entities;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Gam_fmkactivity {

	@Id
	@GeneratedValue
	private Long id;	
	private String type;
	private String flowtime;
	private String src;	
	private String dest;
	private String actioncode;
	private String resubmitioncontext;
	private String flowid;
	private String halfflowid;
	@ManyToOne
	@JoinColumn(name="fmkflow", referencedColumnName="flowid")
	private Fmkflow fmkflow;
	
	@ManyToOne
	@JoinColumn(name="fmkhalfflow", referencedColumnName="id")
	private Fmkhalfflow fmkhalfflow;
	
	@ManyToOne
	@JoinColumn(name="fmklog", referencedColumnName="logcode ")
	private Fmklog fmklog;

	public Gam_fmkactivity() {
		super();
	}

	public Gam_fmkactivity(String type, String flowtime, String src, String dest, String actioncode,
			String resubmitioncontext, String flowid, String halfflowid, Fmkflow fmkflow, Fmkhalfflow fmkhalfflow,
			Fmklog fmklog) {
		super();
		this.type = type;
		this.flowtime = flowtime;
		this.src = src;
		this.dest = dest;
		this.actioncode = actioncode;
		this.resubmitioncontext = resubmitioncontext;
		this.flowid = flowid;
		this.halfflowid = halfflowid;
		this.fmkflow = fmkflow;
		this.fmkhalfflow = fmkhalfflow;
		this.fmklog = fmklog;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFlowtime() {
		return flowtime;
	}

	public void setFlowtime(String flowtime) {
		this.flowtime = flowtime;
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

	public String getActioncode() {
		return actioncode;
	}

	public void setActioncode(String actioncode) {
		this.actioncode = actioncode;
	}

	public String getResubmitioncontext() {
		return resubmitioncontext;
	}

	public void setResubmitioncontext(String resubmitioncontext) {
		this.resubmitioncontext = resubmitioncontext;
	}

	public String getFlowid() {
		return flowid;
	}

	public void setFlowid(String flowid) {
		this.flowid = flowid;
	}

	public String getHalfflowid() {
		return halfflowid;
	}

	public void setHalfflowid(String halfflowid) {
		this.halfflowid = halfflowid;
	}

	public Fmkflow getFmkflow() {
		return fmkflow;
	}

	public void setFmkflow(Fmkflow fmkflow) {
		this.fmkflow = fmkflow;
	}

	public Fmkhalfflow getFmkhalfflow() {
		return fmkhalfflow;
	}

	public void setFmkhalfflow(Fmkhalfflow fmkhalfflow) {
		this.fmkhalfflow = fmkhalfflow;
	}

	public Fmklog getFmklog() {
		return fmklog;
	}

	public void setFmklog(Fmklog fmklog) {
		this.fmklog = fmklog;
	}
	
	
}*/
