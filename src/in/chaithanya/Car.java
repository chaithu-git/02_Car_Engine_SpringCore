package in.chaithanya;

public class Car extends Engine{
	
	public void drive() {
		
		Engine eng=new Engine();
		int status=eng.start();
		
		if(status>=1) {
			System.out.println("Journey started....");
		}else {
			System.out.println("engine having some problems.....");
		}
		
	}

}
