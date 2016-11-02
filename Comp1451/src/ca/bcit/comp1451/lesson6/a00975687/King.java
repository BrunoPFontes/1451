package ca.bcit.comp1451.lesson6.a00975687;

public class King  extends ChessPiece{

	public King(int value) {
		super(1000);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void move(){
		System.out.println("one square...");
	}
	
	
	@Override
	public String toString(){
		String name = getClass().getSimpleName();
		return name;
	}
	

}
