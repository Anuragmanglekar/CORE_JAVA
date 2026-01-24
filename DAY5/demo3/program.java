package demo3;

public class program {

	public static void main(String[] args) {
		human[] arr = new human[4]; 
		
//		Human[] arr = {
//				new Human(31, 69, 172),
//				new Human(31, 69, 172),
//				new Human(31, 69, 172),
//				new Human(31, 69, 172),
//				
//		}; 
		
		arr[0] = new human(31, 69, 172); 
		arr[1] = new human(32, 71, 173); 
		arr[2] = new human(33, 55, 150); 
		arr[3] = new human(34, 75, 180); 
		
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].display();
		}
	}

}
