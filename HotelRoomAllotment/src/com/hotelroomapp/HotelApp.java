package com.hotelroomapp;

import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====Welcome to MyHotel=====");
        while (true) {
            System.out.println("====Rooms====");
            System.out.println("1.A/C Rooms\n2.Non A/C Rooms \n3.Deluxe Rooms \n4.Exit");
            System.out.println("Enter your Option");
            int op = sc.nextInt();
            boolean flag=true;
           double price=0;
           double totamount=0;
            switch (op) {
            	//--------------------------AC ROOM FUNCTIONS--------------------------------------------
                case 1:HotelService h1=new HotelServiceImpl();
                    System.out.println("Services given are free brkfst, snacks, Wifi connectivity, rooms.");
                    System.out.println("Price: 3000/day");
                    while(flag) {
                    System.out.println("1.Check Availability\n2.Check In\n3.CheckOut\n4.Payment\n5.Cancel");
                    System.out.println("Enter your Choice");
                    int ch=sc.nextInt();
                    switch(ch) {
                    case 1: System.out.println("=====A/C Roooms Available=====");
                            h1.availRooms();
                            System.out.println();
                            break;
                    case 2: System.out.println("=====Check In=====");
                    		System.out.println("Select the Room No");
                    		int roomNo=sc.nextInt();
                    		if(h1.validateRoom(roomNo)) {
                    		System.out.println("Enter Customer Id");
                    		int cusId=sc.nextInt();
                    		System.out.println("Enter Customer Name");
                    		String name=sc.next();
                    		System.out.println("Enter Phone No");
                    		long phno=sc.nextLong();
                    		System.out.println("No.of Days of stay");
                    		int days=sc.nextInt();
                    		price=3000.00;
                    		 totamount=price*days;
                    		System.out.println("Total amount to be paid during Checkout is: "+totamount);
                    		h1.checkIn(roomNo, new Customer(cusId, name, phno,totamount));
                    		}
                    		else {
                    			System.out.println("Invalid Room No. Please Select Available Room No");
                    		}
                    		break;
                    case 3:System.out.println("=======CheckOut======");
                           System.out.println("Enter the Alloted RoomNo");
                            int room=sc.nextInt();
                            h1.checkOut(room);
                           
                    		break;
                    case 4:    
                    		   System.out.println("=======Payments========");
                    		   System.out.println("Enter the Alloted RoomNo");
                    		   int room1=sc.nextInt();
            	               System.out.println("Enter the Amount for Payment");
                               double amount=sc.nextDouble();
                               if(amount!=totamount) {
                                System.out.println("Enterd Amount is Incorrect");
                               }
                             else {
                            	 h1.payment(room1);
                            	 totamount=0;
                             }
                               break;
                    case 5:
                    	 flag=false;
                    	 break;
                    	 
                   default:System.out.println("Invalid Choice!!!!!");
                    }
                    
                  }
                    break;
                    //--------------------NON AC FUNCTIONS----------------------------------------------
                    
            case 2:	HotelService nac=new NonACImpln();
            		System.out.println("=============NON AC ROOMS============================");
            		System.out.println("Services given are 24hrs Wifi connectivity rooms.");
            		System.out.println("Price: 1500/day");
            		while(flag) {
            			System.out.println("1.Check Availability\n2.Check In\n3.CheckOut\n4.Payment\n5.Cancel");
            			System.out.println("Enter your Choice");
            			int ch=sc.nextInt();
            			   switch(ch) {
                           case 1: System.out.println("=====Non A/c Roooms Available=====");
                                   nac.availRooms();
                                   System.out.println();
                                   break;
                           case 2: System.out.println("=====Check In=====");
                           		System.out.println("Select the Room No");
                           		int roomNo=sc.nextInt();
                           		if(nac.validateRoom(roomNo)) {
                           		System.out.println("Enter Customer Id");
                           		int cusId=sc.nextInt();
                           		System.out.println("Enter Customer Name");
                           		String name=sc.next();
                           		System.out.println("Enter Phone No");
                           		long phno=sc.nextLong();
                           		System.out.println("No.of Days of stay");
                           		int days=sc.nextInt();
                           		price=1500.00;
                           		 totamount=price*days;
                           		System.out.println("Total amount to be paid during Checkout is: "+totamount);
                           		nac.checkIn(roomNo, new Customer(cusId, name, phno,totamount));
                           		}
                           		else {
                           			System.out.println("Invalid Room No. Please Select Available Room No");
                           		}
                           		break;
                           case 3:System.out.println("=======CheckOut======");
                                  System.out.println("Enter the Alloted RoomNo");
                                   int room=sc.nextInt();
                                   nac.checkOut(room);
                                  
                           		break;
                           case 4:    
                           		   System.out.println("=======Payments========");
                           		   System.out.println("Enter the Alloted RoomNo");
                           		   int room1=sc.nextInt();
                   	               System.out.println("Enter the Amount for Payment");
                                      double amount=sc.nextDouble();
                                      if(amount!=totamount) {
                                       System.out.println("Enterd Amount is Incorrect");
                                      }
                                    else {
                                   	 nac.payment(room1);
                                   	 totamount=0;
                                    }
                           		   
                                      break;
                           case 5:
                           	 flag=false;
                           	 break;
                           	 
                          default:System.out.println("Invalid Choice!!!!!");
                           }
                           
                         }
            			break;
            			//----------------------DELUXE ROOMS-------------------------------
            			
            case 3:	HotelService dexr=new DeluxImpln();
    		System.out.println("=============DELUXE ROOMS============================");
    		System.out.println("Enhanced Room Size with Luxurious Furnishing,Premium Bedding, In-Room Amenities ,Enhanced View and many more");
    		System.out.println("Price: 5000/day");
    		while(flag) {
    			System.out.println("1.Check Availability\n2.Check In\n3.CheckOut\n4.Payment\n5.Cancel");
    			System.out.println("Enter your Choice");
    			int ch=sc.nextInt();
    			   switch(ch) {
                   case 1: System.out.println("=====Delux Roooms Available=====");
                           dexr.availRooms();
                           System.out.println();
                           break;
                   case 2: System.out.println("=====Check In=====");
                   		System.out.println("Select the Room No");
                   		int roomNo=sc.nextInt();
                   		if(dexr.validateRoom(roomNo)) {
                   		System.out.println("Enter Customer Id");
                   		int cusId=sc.nextInt();
                   		System.out.println("Enter Customer Name");
                   		String name=sc.next();
                   		System.out.println("Enter Phone No");
                   		long phno=sc.nextLong();
                   		System.out.println("No.of Days of stay");
                   		int days=sc.nextInt();
                   		price=5000;
                   		totamount=price*days;
                   		System.out.println("Total amount to be paid during Checkout is: "+totamount);
                   		dexr.checkIn(roomNo, new Customer(cusId, name, phno,totamount));
                   		}
                   		else {
                   			System.out.println("Invalid Room No. Please Select Available Room No");
                   		}
                   		break;
                   case 3:System.out.println("=======CheckOut======");
                          System.out.println("Enter the Alloted RoomNo");
                           int room=sc.nextInt();
                           dexr.checkOut(room);
                          
                   		break;
                   case 4:    
                   		   System.out.println("=======Payments========");
                   		   System.out.println("Enter the Alloted RoomNo");
                   		   int room1=sc.nextInt();
           	               System.out.println("Enter the Amount for Payment");
                              double amount=sc.nextDouble();
                              if(amount!=totamount) {
                               System.out.println("Enterd Amount is Incorrect");
                              }
                            else {
                           	 dexr.payment(room1);
                           	 totamount=0;
                            }
                   		   
                              break;
                   case 5:
                   	 flag=false;
                   	 break;
                   	 
                  default:System.out.println("Invalid Choice!!!!!");
                   }
                   
                 }
            		break;
            case 4:System.exit(0);
            		
            		
                default:
                    System.out.println("Invalid room option. Please enter a valid room option.");
                    break;
            }
        }

 
     }
}
