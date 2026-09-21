package com.fundamentals;


public class BugTracker {
	int bugid;
	String Appname;
	String Bugtitle;
	String serverity;
	String Priority;
	String status;
	String assignedDeveloper;
	String newStatus;
	
	public static void main(String[] args) {
		BugTracker obj=new BugTracker();
		obj.bugid=101;
		obj.Appname="Banking appli";
		obj.Bugtitle="Login";
		obj.serverity="high";
		obj.Priority="first";
		obj.status="yes";
		obj.assignedDeveloper="bhagya";
		obj.assignToDeveloper(102,"bhagii");
		
		obj.displaydetails();
		}
	 int  getBugid() {
		return  bugid;
	}
	 String getApplicationName () {
		return Appname;
		
	}
	 String getBugTitle() {
		return Bugtitle;
	}
	 String getserverity() {
		return serverity;
	}
	 String getPriority() {
		return Priority;
	}
	 String getstatus() {
		return status;
	}
 String getAssignedDeveloper() {
		return assignedDeveloper;
	}
 void updatestatus(String newstatus) {
	 status=newstatus;

 }
 void displaydetails() {
	 System.out.println("bugid:"+bugid);
	 System.out.println("Applicationname:"+Appname);
	 System.out.println("BugTittle:"+ Bugtitle);
	 System.out.println("serverity:"+serverity);
	 System.out.println("Priority:"+Priority);
	 System.out.println("status:"+status);
	 System.out.println("assignedDeveloper:"+assignedDeveloper);
	 
 }
 void assignToDeveloper(int bugid, String developername) {
	     bugid=bugid;
	 
		 assignedDeveloper=developername;
		 updatestatus("In Development");
	 }
 }
 
	


