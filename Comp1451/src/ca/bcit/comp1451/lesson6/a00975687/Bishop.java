 package ca.bcit.comp1451.lesson6.a00975687;

public class Bishop extends ChessPiece {

	public Bishop(int value) {
		super(3);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void move(){
		System.out.println("Diagonally...");
	}
	
	
	@Override
	public String toString(){
		String name = getClass().getSimpleName();
		return name;
	}

}
