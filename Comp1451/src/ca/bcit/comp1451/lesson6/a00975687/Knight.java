package ca.bcit.comp1451.lesson6.a00975687;

public class Knight extends ChessPiece {

	public Knight(int value) {
		super(2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(){
		System.out.println("Like an L...");
	}
	
	
	@Override
	public String toString(){
		String name = getClass().getSimpleName();
		return name;
	}
}
