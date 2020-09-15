package data.dto;

import java.sql.Timestamp;

public class MemberDto {

	private String memnum;
	private String id;
	private String pass;
	private String name;
	private Timestamp joindate;
	public String getMemnum() {
		return memnum;
	}
	public void setMemnum(String memnum) {
		this.memnum = memnum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getJoindate() {
		return joindate;
	}
	public void setJoindate(Timestamp joindate) {
		this.joindate = joindate;
	}
	
	
}
