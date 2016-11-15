package ca.bcit.comp1451.lesson6.a00975687;

public class TestChess {
	
	public static void main(String[] args) {
		ChessPiece cp1 = new Pawn(1);
		ChessPiece cp3 = new Pawn(1);
		
		
		ChessPiece cp2 = new Queen(9);
		
		System.out.println(cp1.getValue());
		System.out.println(cp1.toString());
		cp1.move();
		
		
		System.out.println(cp2.getValue());
		System.out.println(cp2.toString());
		cp2.move();
		
		System.out.println(cp1.equals(cp3));
		
		
		//cp4.setHasBeenPromoted();
		//cp4.promote(cp4);
		
		//cp1.equals(cp4);
		
	}
	
	
	
	
}
