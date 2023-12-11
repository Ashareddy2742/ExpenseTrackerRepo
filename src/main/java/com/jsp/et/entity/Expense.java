package com.jsp.et.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="expense_table")
public class Expense 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int expenseId;
	private LocalDate date;
	private double amount;
	private String description;
	
	@ManyToOne
	//many records form expenses table associate with one record of category table
	@JoinColumn(name="category_fx")
	private ExpenseCategory expenseCategory;
	
	@ManyToOne
	@JoinColumn(name="user_fx")
	private User user;
}
