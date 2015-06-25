import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner console=new Scanner(System.in);
		 int floor,choice;
			Elevator_Door ED=new Elevator_Door();
			Elevator e=new Elevator();
			Floor f=new Floor();
			Floor_Button fb=new Floor_Button();
		
		System.out.println("Enter Your Choice*****");
		System.out.println("1:Request Elevator Up");
		System.out.println("2:Request Elevator Down");
		
		choice=console.nextInt();
		
		if(choice==1){	
			System.out.println("Elevator up");

		ED.DoorOpen();
		System.out.println("\nYou Have Entered The Elevator");
		
	    e.EnterFloorNumber();
	    
	    System.out.println("You reached requested Floor");
	    
		
		
	}

}}
