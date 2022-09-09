public class Hangar {

	public static void main(String[] args) {
	
		Car renault = new Car("Renault", 1500);
		Boat titanic = new Boat("Titanic", 2500);
		
        	System.out.println(renault.doStuff());
        	System.out.println(titanic.doStuff());
    	}

}
