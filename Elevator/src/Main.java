import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner console=new Scanner(System.in);
		 int floor,choice,x=0;
		 
			Elevator_Door ED=new Elevator_Door();
			Elevator e=new Elevator();
			Floor f=new Floor();
			Floor_Button fb=new Floor_Button();
			System.out.println("Elevator is On Ground Floor");
			
			while(x==0){
				
				 int userposition=(int) (Math.random()*7);
				 System.out.println("\nUser Standing On Floor----"+userposition);

		
		System.out.println("----Enter Your Choice----");
		System.out.println("1:Call Elevator Up");
		System.out.println("2:Call Elevator Down");
		System.out.println("3:Exit");

		
		choice=console.nextInt();
		
		if(choice==1){	

			if(e.current_floor_number!=e.Max_floor_number){
				
		ED.DoorOpen();
		System.out.println("\nYou Have Entered The Elevator");
		
	    e.EnterFloorNumber();
	    ED.DoorClose();
			}
			else{
				System.out.println("------You Are on Last Floor.Elevator Cannot Go Up-----");
			}
		
	}
		if(choice==2){	
			if(e.current_floor_number!=1){
				
			
		ED.DoorOpen();
		System.out.println("\nYou Have Entered The Elevator");
		
	    e.EnterFloorNumber();
	    
			}
			else{
				System.out.println("------You Are on ground Floor.Elevator Cannot Go Down-----");
			}
		
		
	}
		
		 
        else if(choice==3){

			System.exit(0);
            x=1;
		}
		
		
}
	

}}