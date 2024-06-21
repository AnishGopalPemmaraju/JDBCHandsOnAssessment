package com.gl.app.dao;



import java.util.Date;
import java.util.List;

import com.gl.app.entity.Equipment;
import com.gl.app.exception.EquipmentNotFoundException;

public interface EquipmentDAO {
	
public void addEquipment(Equipment equipment);
public void updateAvailability(int equipment_id, Date oldDate, Date newDate);
public void deleteEquipment(int equipment_id);
public Equipment getEquipmentById(int id);
public List<Equipment> getAllEquipments();

}
