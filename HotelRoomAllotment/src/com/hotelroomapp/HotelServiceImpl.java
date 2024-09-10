package com.hotelroomapp;

public class HotelServiceImpl implements HotelService {

	
	{
		for(int i=101;i<=106;i++) {
			ac.put(i, null);
		}
	}

	@Override
	public void availRooms() {
		int c=0;
		for(int keys:ac.keySet()) {
			if(ac.get(keys)==null) {
				System.out.print(keys+" ");
				c++;
			}
		}
		if(c==0) {
			System.out.println("No rooms available");
		}
		
	}
	
	@Override
	public boolean validateRoom(int roomId) {
		 int minValidRoomId = 101;
		    int maxValidRoomId = 106;

		    // Check if the room number is valid (within the specified range of valid IDs)
		    if (roomId < minValidRoomId || roomId > maxValidRoomId) {
		       return false;
		    }
		    if(ac.get(roomId)!=null) {
		    	return false;
		    }
		    return true;
			
	}
	
	@Override
	public void checkIn(int roomId, Customer c) {
	   

	    if (ac.get(roomId) == null) {
	        ac.put(roomId, c);
	        System.out.println(roomId + " Allotted to Customer " + c.getCname());
	        l1.add(c);
	        
	    }
	    else {
	        System.out.println("Room has been Already Taken. Select another Room");
	    }
	}

	@Override
	public boolean checkOut(int roomId) {
		if(ac.containsKey(roomId)) {
			if(ac.get(roomId)==null) {
				System.out.println(" The entered room number is incorrect. Kindly verify and re-enter the correct roomNo.");
				return false;
			}
			else {
			System.out.println("***********Customer Details**************");
			System.out.println(ac.get(roomId));
		  }
		}
		else {
			System.err.println("Invalid RoomNo. Please Enter the Correct RoomNo");
		}
		return false;
		
	}

	@Override
	public void payment(int roomId) {
		if(ac.get(roomId)==null) {
			System.out.println(" The entered room number is incorrect. Kindly verify and re-enter the correct roomNo.");
			
		}else {
			System.out.println("Payment Successful!!!!");
			System.out.println("*******Thank You. Do Visit Again*********");
			ac.put(roomId, null);
		}
		
	}

	


}
