package demo3;

public class human {
	private int age , weight , height; 
	public human() {
		// TODO Auto-generated constructor stub
	}
	public human(int age, int weight, int height) {
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	//getters and setters 
	
	public void display( ) {
		System.out.printf("Age : %d Weight : %d height : %d\n",age,weight,height);
	}
	
}