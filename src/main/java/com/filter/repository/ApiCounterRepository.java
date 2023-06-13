package com.filter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filter.entity.ApiCounterEntity;

public interface ApiCounterRepository extends JpaRepository<ApiCounterEntity, Integer> 
{
	public ApiCounterEntity findByApiName(String name);
}
