package com.accenture.mq.service;

import java.io.IOException;

import com.accenture.mq.dao.EmployeeDAO;
import com.accenture.mq.bean.Employee;
import com.accenture.mq.bean.MessageBean;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.accenture.mq.entity.EmployeeEntity;

@Component
public class EmployeeServiceReceiverImpl{

	@Autowired
	private EmployeeDAO dao;
	
   
    
    public EmployeeServiceReceiverImpl(){
    	System.out.println("From Receiver:> created"+this);
    }
    
    
    public void receiveMessage(byte[] obj) {
    	String mess=new String(obj);
        System.out.println("Received <" + mess + ">");
        MessageBean message=null;
		try {
			message = new ObjectMapper().readValue(mess,MessageBean.class);
	        EmployeeEntity em = new  EmployeeEntity();
	        Employee emModel =  message.getEmployee();
	        BeanUtils.copyProperties(emModel, em);
	        dao.save(em);
	        System.out.println("Saved..");
        } catch (IOException e) {
			System.out.println(e.getMessage());
		}
    }
   

}
