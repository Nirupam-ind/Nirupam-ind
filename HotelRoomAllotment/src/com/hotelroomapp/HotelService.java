package com.hotelroomapp;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public interface HotelService {
	LinkedHashMap<Integer, Customer>ac=new LinkedHashMap<Integer, Customer>();
	LinkedHashMap<Integer, Customer>nac=new LinkedHashMap<Integer, Customer>();
	LinkedHashMap<Integer, Customer>delx=new LinkedHashMap<Integer, Customer>();
	
	ArrayList<Customer>l1=new ArrayList<Customer>();
	
	void availRooms();
	boolean validateRoom(int roomId);
	void checkIn(int roomId,Customer c);
	boolean checkOut(int roomId);
	void payment(int roomId);
}
