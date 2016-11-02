package ca.bcit.comp1451.a00975687;



public class Test {
	public final static int numberOfArgs = 5;
	
	public static void main(String[]args){
		
		Person p = new Person(args[0], args[1], Integer.parseInt(args[2]));
		
		p.x = Double.parseDouble(args[3]);
		
		if(args.length < numberOfArgs){
			System.out.println("Name: " +  args[0]);
			System.out.println("Last Name: " + args[1]);
			System.out.println("Year: " + args[2]);
			System.out.println("X's value: " + args[3]);
			
		}else {
			System.out.println("The number of args are incorrect, " + "\nNumber of args: " + args.length);
		}
		
		
	
		
	}
}

