package com.gl.app.service.impl;

import java.util.Date;
import java.util.List;

import com.gl.app.dao.EquipmentDAO;
import com.gl.app.dao.impl.EquipmentDAOImpl;
import com.gl.app.entity.Equipment;
import com.gl.app.exception.EquipmentNotFoundException;
import com.gl.app.service.EquipmentService;

public class EquipmentServiceImpl implements EquipmentService{
	
	EquipmentDAO equipmentDAO=new EquipmentDAOImpl();

	public EquipmentServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public void addEquipment(Equipment equipment) {
		// TODO Auto-generated method stub
		equipmentDAO.addEquipment(equipment);
		
	}
	

	public EquipmentServiceImpl(EquipmentDAO equipmentDAO) {
		super();
		this.equipmentDAO = equipmentDAO;
	}




	@Override
	public void updateAvailability(int equipment_id, Date oldDate, Date newDate) {
		// TODO Auto-generated method stub
		//write code here
		
	}


	@Override
	public Equipment getEquipmentById(int id) {
		// TODO Auto-generated method stub
		return null;//Write code here
	}


	@Override
	public void deleteEquipment(int equipment_id) {
		// TODO Auto-generated method stub
		//write code here
	}


	@Override
	public List<Equipment> getAllEquipments() {
		// TODO Auto-generated method stub
		return null;//write code here
	}
	

}
