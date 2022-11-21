package Project2;

import java.util.Scanner;

public class EMS_Back {
	private String fname;
	private String lname;
	private int contact;
	private String pass;
	private String salary;
	private int ID=100;
	private String Email;
	private String altEmail;
	private String CompanyName="HALLFIRM";
	
	public EMS_Back(String fname, String lname,int contact) {
		this.fname=fname;
		this.lname=lname;
		//System.out.println("Student Name: "+this.fname+" "+this.lname);
		//generate email
		Email = fname.toLowerCase().charAt(0)+lname.toLowerCase()+"@"+CompanyName+".com";
		//System.out.println("Your email is: "+Email);
		//choose department
		this.contact=contact;
		//System.out.println("Number: "+this.contact);
		//generate password
		this.pass=generateRandomPassword(10);
		//System.out.println("Your password is: "+ this.pass);
		this.ID=getNextID();
		//System.out.println("Your  is: "+this.ID);
		this.salary=choiceJob();
		//System.out.println("Your salary is: "+this.salary);
	}	
	private String generateRandomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()!@#$%^";
		char[] password = new char[length];
		for(int i =0;i<length;i++) {
			int rand = (int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	public int getNextID() {
		int id = ID;
		ID++;
		return id;
	}
	private String choiceJob() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the department "
		+"\n 1 for Executive-Level"
		+"\n 2 for Mid-Level"
		+"\n 3 for Intermediate"
		+"\n 0 for Entry-Level");
		int deptChoice=sc.nextInt();
		if(deptChoice==1) {
			return "$120,000";
		}
		else if(deptChoice==2) {
			return "$90,000";
		}
		else if(deptChoice==3) {
			return "$60,000";
		}
		else {
			return"$30,000";
		}
	}
	//Setters
	public void setaltEmail(String altEmail) {
		this.altEmail=altEmail;
	}
	public void changePassword(String pass) {
		this.pass=pass;
	}
	//Getters
	public String getaltEmail() {
		return altEmail;
	}
	public String getPassword() {
		return pass;
	}
	public int getID() {
		return ID;
	}
	public String showinfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("Student Name: "+fname.toUpperCase()+" "+lname.toUpperCase()+"\n");
		sb.append("Email: "+ Email+"\n");
		sb.append("Contact:" + contact+"\n" );
		sb.append("Password: "+ pass+"\n");
		sb.append("Salary: "+ salary+"\n");
		sb.append("Alternate Email: "+altEmail+"\n");
		
		return sb.toString();
	}

}
