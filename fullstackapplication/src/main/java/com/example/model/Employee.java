package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="employee")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class Employee {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="password")
	private String password;
//	public Employee() {
//		super();
//	}
//	public Employee(int id, String name, String password) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.password = password;
//	}
	public Employee(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", password=" + password + "]";
//	}
//	
	
	
	
	
	
	
	
}
