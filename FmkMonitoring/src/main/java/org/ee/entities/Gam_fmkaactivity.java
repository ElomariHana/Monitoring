package org.ee.entities;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Gam_fmkaactivity {
	@Id
	@GeneratedValue
	private long id;
	private String flowtime;
	@ManyToOne
    @JoinColumn(name = "flowid",referencedColumnName = "id")
	private Fmkflow fmkflow ;
	@ManyToOne
    @JoinColumn(name = "halfflowid",referencedColumnName = "id")
	private Fmkhalfflow fmkhalfflowid;
	
	private String src;
	private String dest;
	private String flowcode;
	private String halfflowcode;
	private String logcode;
	private String actioncode;
	private String resubmitioncontext;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFlowtime() {
		return flowtime;
	}
	public void setFlowtime(String flowtime) {
		this.flowtime = flowtime;
	}
	public Fmkflow getFmkflow() {
		return fmkflow;
	}
	public void setFmkflow(Fmkflow fmkflow) {
		this.fmkflow = fmkflow;
	}
	public Fmkhalfflow getFmkhalfflowid() {
		return fmkhalfflowid;
	}
	public void setFmkhalfflowid(Fmkhalfflow fmkhalfflowid) {
		this.fmkhalfflowid = fmkhalfflowid;
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
	public String getFlowcode() {
		return flowcode;
	}
	public void setFlowcode(String flowcode) {
		this.flowcode = flowcode;
	}
	public String getHalfflowcode() {
		return halfflowcode;
	}
	public void setHalfflowcode(String halfflowcode) {
		this.halfflowcode = halfflowcode;
	}
	public String getLogcode() {
		return logcode;
	}
	public void setLogcode(String logcode) {
		this.logcode = logcode;
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
	public Gam_fmkaactivity() {
		super();
	}
	public Gam_fmkaactivity(String flowtime, Fmkflow fmkflow, Fmkhalfflow fmkhalfflowid, String src, String dest,
			String flowcode, String halfflowcode, String logcode, String actioncode, String resubmitioncontext) {
		super();
		this.flowtime = flowtime;
		this.fmkflow = fmkflow;
		this.fmkhalfflowid = fmkhalfflowid;
		this.src = src;
		this.dest = dest;
		this.flowcode = flowcode;
		this.halfflowcode = halfflowcode;
		this.logcode = logcode;
		this.actioncode = actioncode;
		this.resubmitioncontext = resubmitioncontext;
	}
	
	
}
