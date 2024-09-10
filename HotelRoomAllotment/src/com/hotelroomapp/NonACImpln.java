package com.hotelroomapp;

public class NonACImpln implements HotelService {

	{
		for(int i=201;i<=210;i++) {
			nac.put(i, null);
		}
	}

	@Override
	public void availRooms() {
		int c=0;
		for(int keys:nac.keySet()) {
			if(nac.get(keys)==null) {
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
		 int minValidRoomId = 201;
		    int maxValidRoomId = 210;

		    // Check if the room number is valid (within the specified range of valid IDs)
		    if (roomId < minValidRoomId || roomId > maxValidRoomId) {
		       return false;
		    }
		    if(nac.get(roomId)!=null) {
		    	return false;
		    }
		    return true;
			
	}
	
	@Override
	public void checkIn(int roomId, Customer c) {
	   

	    if (nac.get(roomId) == null) {
	        nac.put(roomId, c);
	        System.out.println(roomId + " Allotted to Customer " + c.getCname());
	        l1.add(c);
	        
	    }
	    else {
	        System.out.println("Room has been Already Taken. Select another Room");
	    }
	}

	@Override
	public boolean checkOut(int roomId) {
		if(nac.containsKey(roomId)) {
			if(nac.get(roomId)==null) {
				System.out.println(" The entered room number is incorrect. Kindly verify and re-enter the correct roomNo.");
				return false;
			}
			else {
			System.out.println("***********Customer Details**************");
			System.out.println(nac.get(roomId));
			
		  }
		}
		else {
			System.err.println("Invalid RoomNo. Please Enter the Correct RoomNo");
		}
		return false;
		
	}

	@Override
	public void payment(int roomId) {
		if(nac.get(roomId)==null) {
			System.out.println(" The entered room number is incorrect. Kindly verify and re-enter the correct roomNo.");
		}
		else {
			System.out.println("Payment Successful!!!!");
			System.out.println("*******Thank You. Do Visit Again*********");
			nac.put(roomId, null);
		}
		
	}

}
