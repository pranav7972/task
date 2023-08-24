package com.cjc.dev.pojos;

public class Student {
	private int sid;
    private String sname;
    private long smobno;
    private boolean sstatus;
    private char sbgroup;
    private String saddr;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public long getSmobno() {
		return smobno;
	}
	public void setSmobno(long smobno) {
		this.smobno = smobno;
	}
	public boolean isSstatus() {
		return sstatus;
	}
	public void setSstatus(boolean sstatus) {
		this.sstatus = sstatus;
	}
	public char getSbgroup() {
		return sbgroup;
	}
	public void setSbgroup(char sbgroup) {
		this.sbgroup = sbgroup;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}


}
