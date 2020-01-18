package com.company.dto;

import java.util.Date;

public class MemberDTO {
	private String member_id;
	private String member_pw;
	private String member_name;
	private String nickname;
	private String member_email;
	private Date join_date;
	private Date pwchange_date;
	private Date lastlogin_date;
	private int point;
	private Date birthday;
	private String backup_path;
	private String hyumyun;
	
	
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pw() {
		return member_pw;
	}
	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	public Date getJoin_date() {
		return join_date;
	}
	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	public Date getPwchange_date() {
		return pwchange_date;
	}
	public void setPwchange_date(Date pwchange_date) {
		this.pwchange_date = pwchange_date;
	}
	public Date getLastlogin_date() {
		return lastlogin_date;
	}
	public void setLastlogin_date(Date lastlogin_date) {
		this.lastlogin_date = lastlogin_date;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getBackup_path() {
		return backup_path;
	}
	public void setBackup_path(String backup_path) {
		this.backup_path = backup_path;
	}
	public String getHyumyun() {
		return hyumyun;
	}
	public void setHyumyun(String hyumyun) {
		this.hyumyun = hyumyun;
	}

	
}