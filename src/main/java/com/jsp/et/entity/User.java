package com.jsp.et.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="user_table")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String fullName;
	private String userName;
	
	@Column(unique = true)
	private String mobile;
	private String email;
	private String password;
	
	//Bidirectional traversing
	@OneToMany(mappedBy = "user")
	private List<Expense> expense;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "image_id")
	private Image image;
}
