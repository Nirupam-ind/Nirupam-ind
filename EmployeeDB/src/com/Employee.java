package com;

//Entity-> private attributes, parameterized cons,getters and setters and toString
public class Employee {
		private int eid;
		private String ename;
		private String desgn;
		private double sal;
		
		public Employee(int eid, String ename, String desgn, double sal) {
			this.eid = eid;
			this.ename = ename;
			this.desgn = desgn;
			this.sal = sal;
		}

		public int getEid() {
			return eid;
		}

		public void setEid(int eid) {
			this.eid = eid;
		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		public String getDesgn() {
			return desgn;
		}

		public void setDesgn(String desgn) {
			this.desgn = desgn;
		}

		public double getSal() {
			return sal;
		}

		public void setSal(double sal) {
			this.sal = sal;
		}

		
		@Override
		public String toString() {
			return "eid=" + eid + ", ename=" + ename + ", desgn=" + desgn + ", sal=" + sal;
		}
		
		
		
}
