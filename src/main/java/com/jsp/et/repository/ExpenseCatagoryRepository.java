package com.jsp.et.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.et.entity.ExpenseCategory;

public interface ExpenseCatagoryRepository extends JpaRepository<ExpenseCategory, Integer> 
{
	 Optional<ExpenseCategory>  findByCategory(String category);
}
