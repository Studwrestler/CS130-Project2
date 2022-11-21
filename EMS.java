package Project2;

import java.util.Scanner;

public class EMS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID: ");
		int i = sc.nextInt();
		if(i==100) {
			EMS_Back s1 = new EMS_Back("Paul","Smith",123456789);
			s1.setaltEmail("psmith11@gmail.com");
			s1.changePassword("ABC1243465");
			System.out.println(s1.showinfo());
		}
		else if(i==101){
			EMS_Back s2 = new EMS_Back("Greg","Smith",123412322);
			System.out.println(s2.showinfo());
			System.out.println("ID: "+i);
		}

		else if(i==102) {
			EMS_Back s3 = new EMS_Back("Maxwell","Walters",109097675);
			System.out.println(s3.showinfo());
			System.out.println("ID: "+i);
		}
		else if(i==103) {
			EMS_Back s4 = new EMS_Back("George","Tyler",189243957);
			System.out.println(s4.showinfo());
			System.out.println("ID: "+i);
		}
		else if(i==104) {
			EMS_Back s5 = new EMS_Back("Cole","Stern",1923423443);
			System.out.println(s5.showinfo());
			System.out.println("ID: "+i);
		}
		else if(i==105) {
			EMS_Back s6 = new EMS_Back("Levi","Potter",198798734);
			System.out.println(s6.showinfo());
			System.out.println("ID: "+i);
		}
		else if(i==106) {
			EMS_Back s7 = new EMS_Back("Martin","Wheeler",196748232);
			System.out.println(s7.showinfo());
			System.out.println("ID: "+i);
		}
		else if(i==107) {
			EMS_Back s8 = new EMS_Back("Alex","Wise",1784234346);
			System.out.println(s8.showinfo());
			System.out.println("ID: "+i);
		}
		else if(i==108) {
			EMS_Back s9 = new EMS_Back("Sam","Smith",1222348956);
			System.out.println(s9.showinfo());
			System.out.println("ID: "+i);
		}
		else if(i==109) {
			EMS_Back s10 = new EMS_Back("Logan","ODell",1902356782);
			System.out.println(s10.showinfo());
			System.out.println("ID: "+i);
		}
		else {
			System.out.println("Invaild ID number");
		}
		
		
		
		

	}

}