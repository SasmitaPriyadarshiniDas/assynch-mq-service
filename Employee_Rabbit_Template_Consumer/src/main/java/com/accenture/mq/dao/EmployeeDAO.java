package com.accenture.mq.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.mq.entity.EmployeeEntity;

public interface EmployeeDAO  extends JpaRepository<EmployeeEntity, Integer>{

}
