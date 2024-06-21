package com.gl.app.dao.impl;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import com.gl.app.dao.EquipmentDAO;
import com.gl.app.entity.Equipment;
import com.gl.app.exception.EquipmentNotFoundException;

import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
	import java.util.Date;
	import com.gl.app.util.SportsUtil;

	public class EquipmentDAOImpl implements EquipmentDAO {
	
		
		@Override
		 public void addEquipment(Equipment equipment) {
			//Write code here to add the equipment to the database
		       
		    }
		
	
	    @Override
	    public void updateAvailability(int equipment_id, Date oldDate, Date newDate) {
	       //Write code here to update the availability of the equipment in the database
	    }

    @Override
	    public Equipment getEquipmentById(int id) {
	      
    	//Write code here to get the equipment by id from the database
	        return null;
	    }


	@Override
	public void deleteEquipment(int equipment_id) {
		// TODO Auto-generated method stub
       //Write code here to delete the equipment from the database
		
	}


	@Override
	public List<Equipment> getAllEquipments() {
		// TODO Auto-generated method stub
		
		//Write code here to get all the equipments from the database
		
		return null;
	}



	}

