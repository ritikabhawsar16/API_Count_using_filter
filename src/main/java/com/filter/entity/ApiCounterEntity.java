package com.filter.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class ApiCounterEntity {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(unique = true)
	private String apiName;
	
	private int count ;

	
}
