package com.capgemini.capstore.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Category")
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int categoryId;
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", groupCategoryId=" + groupCategoryId + ", categoryName="
				+ categoryName + ", categoryDesc=" + categoryDesc + ", product=" + product + "]";
	}

	private int groupCategoryId;
	private String categoryName;
	private String categoryDesc;
	@OneToOne(cascade=CascadeType.ALL)
	private Product product; 


	//Constructors
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(int categoryId) {
		super();
		this.categoryId = categoryId;
	}

	public Category(int categoryId, String categoryName, String categoryDesc) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryDesc = categoryDesc;
	}



	//Getters and Setters
	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	public int getGroupCategoryId() {
		return groupCategoryId;
	}

	public void setGroupCategoryId(int groupCategoryId) {
		this.groupCategoryId = groupCategoryId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	
}
