import java.util.Scanner;


public class Elevator extends Floor{

	
	public int Dest_floor_number;
	public int current_floor_number=1;
	 Scanner console=new Scanner(System.in);
		
	
       public void EnterFloorNumber(){
		
		System.out.println("Which floor you Want to go?");
		Dest_floor_number=console.nextInt();
		
		if(Dest_floor_number<=Max_floor_number && Dest_floor_number!=current_floor_number){
		    System.out.println("Request Accepted");
		    System.out.println("Current"+current_floor_number);

		    current_floor_number=Dest_floor_number;
		    System.out.println("Current"+current_floor_number);
		    
		    
		    
		
	}
		else{
			
			System.out.println("incorrect request");
			
		}


}
}
