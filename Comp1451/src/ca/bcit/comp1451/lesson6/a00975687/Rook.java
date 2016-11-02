package ca.bcit.comp1451.lesson6.a00975687;

public class Rook  extends ChessPiece{

	public Rook(int value) {
		super(5);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void move(){
		System.out.println("horizontally or vertically...");
	}
	
	
	@Override
	public String toString(){
		String name = getClass().getSimpleName();
		return name;
	}

}
