package com.hotelroomapp;

public class Customer {
		private int	cid;
		private String cname;
		private long phno;
		private double camt;
		
		public Customer(int cid, String cname, long phno,double camt) {
			this.cid = cid;
			this.cname = cname;
			this.phno = phno;
			this.camt=camt;
		}

		public double getCamt() {
			return camt;
		}

		public void setCamt(double camt) {
			this.camt = camt;
		}

		public int getCid() {
			return cid;
		}

		public void setCid(int cid) {
			this.cid = cid;
		}

		public String getCname() {
			return cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public long getPhno() {
			return phno;
		}

		public void setPhno(long phno) {
			this.phno = phno;
		}

		@Override
		public String toString() {
		    return "Customer Id: " + cid + "\n" +
		           "Customer Name: " + cname + "\n" +
		           "Customer PhoneNo: " + phno + "\n" +
		           "Amount to be Paid: " + camt;
		}


		
		
}
