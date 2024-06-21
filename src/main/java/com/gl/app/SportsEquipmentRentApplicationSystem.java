package com.gl.app;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import com.gl.app.entity.*;
import com.gl.app.exception.EquipmentNotFoundException;
import com.gl.app.service.EquipmentService;
import com.gl.app.service.impl.EquipmentServiceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;



public class SportsEquipmentRentApplicationSystem {
	public static void main(String[] args) throws ParseException {

		
	        EquipmentService equipmentService = new EquipmentServiceImpl();
	  
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            
	            System.out.println("1. Add Equipment");
	            System.out.println("2. Update Equipment Availability");
	            System.out.println("3. Delete Equipment");
	            System.out.println("4. Get EquipmentBy Id");
	            System.out.println("5. List All Equipments");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            String dateStr = null;
				switch (choice) {
	               
	               case 1:
	                	 //Write code to add equipment
	                     break;
	                     
	                  
	                case 2:
                   //Write code to update equipment availability
	                    
                    break;

	                case 3:
	                   //Write code to delete equipment
	                    break;
					case 4:
						//Write code to get equipment by id
						break;
			   case 5:
                       //Write code to list all equipments
                        break;
                 case 6:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        } while (choice != 0);

	        scanner.close();
	}
}
