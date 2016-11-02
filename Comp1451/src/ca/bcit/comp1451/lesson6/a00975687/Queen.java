package ca.bcit.comp1451.lesson6.a00975687;

public class Queen  extends ChessPiece{

	public Queen(int value) {
		super(9);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void move(){
		System.out.println("Like a bishop or a rook...");
	}
	
	
	@Override
	public String toString(){
		String name = getClass().getSimpleName();
		return name;
	}

}
