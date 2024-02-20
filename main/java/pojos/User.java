package pojos;

import java.sql.Date;

public class User {
	//id | name    | email          | password | reg_amt | reg_date   | role
	private int id;
	private String name;
	private String email;
	private String password;
	private Double reg_amt;
	private Date reg_date;
	private String role;
	public User(int id, String name, String email, String password, Double reg_amt, Date reg_date, String role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.reg_amt = reg_amt;
		this.reg_date = reg_date;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Double getReg_amt() {
		return reg_amt;
	}
	public void setReg_amt(Double reg_amt) {
		this.reg_amt = reg_amt;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", reg_amt="
				+ reg_amt + ", reg_date=" + reg_date + ", role=" + role + "]";
	}
	
	

}
