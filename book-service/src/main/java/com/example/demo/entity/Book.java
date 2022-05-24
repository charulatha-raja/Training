package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Table(name= "charubook")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book
{
@Id
@Column(name = "book_number")
private int bookNumber;

@Column(name = "book_name")
private String bookName;

@Column(name="author")
private String author;

@Column(name="price")
private int price;

@Column(name="category")
private String category;

@Column(name="author_name")
private String authorName;

@Column(name="cost")
private double cost;


}