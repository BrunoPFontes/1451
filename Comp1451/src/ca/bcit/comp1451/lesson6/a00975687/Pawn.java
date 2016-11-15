package ca.bcit.comp1451.lesson6.a00975687;

import java.util.Scanner;

public class Pawn extends ChessPiece {

	private boolean hasBeenPromoted;
	ChessPiece newPiece;
	Scanner input;

	public Pawn(int value) {
		super(1);
		hasBeenPromoted = false;
		input = new Scanner(System.in);
		this.newPiece = new Pawn(1);

	}

	public boolean isHasBeenPromoted() {
		return hasBeenPromoted;
	}

	public void setHasBeenPromoted() {
		this.hasBeenPromoted = true;
	}

	@Override
	public void move() {
		System.out.println("Forward 1...");
	}

	@Override
	public String toString() {
		String name = getClass().getSimpleName();
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof ChessPiece))
			return false;
		ChessPiece other = (ChessPiece) obj;
		if (other.getValue() != super.getValue())
			return false;
		return true;
	}

	public ChessPiece getNewPiece() {
		return newPiece;
	}

	public void setNewPiece(ChessPiece newPiece) {
		this.newPiece = newPiece;
	}
	
	public void promote(ChessPiece newPiece){
		if(!(newPiece instanceof Pawn) || !(newPiece instanceof King) ){
			setNewPiece(newPiece);
			setHasBeenPromoted(true);
		}
	}
	
	public ChessPiece getNewPiece(){
		return newPiece;
	}
	
	public void setNewPiece(ChessPiece newPiece){
		if(newPiece != null){
			this.newPiece = newPiece;
		}
	}
	
/*	
	public void promote(ChessPiece newPiece) {
		boolean valid = false;

		while (valid == false) {
			if (hasBeenPromoted == false) {
				System.out.println("Please select the new Chess Piece that you want");
				System.out.println("Select 1 for Knight: ");
				System.out.println("Select 2 for Bishop: ");
				System.out.println("Select 3 for Rook: ");
				System.out.println("Select 4 for Queen: ");

				int choise = input.nextInt();

				switch (choise) {

				case 1:
					this.newPiece.getValue();
					this.newPiece = new Knight(2);
					this.newPiece.getValue();
					valid = true;
					System.out.println("This pawn is now a " + this.getValue());
					break;

				case 2:
					this.newPiece = new Bishop(3);
					valid = true;
					System.out.println("This pawn is now a " + this.getClass().getSimpleName());
					break;

				case 3:
					this.newPiece = new Rook(4);
					valid = true;
					System.out.println("This pawn is now a " + this.getClass().getSimpleName());
					break;

				case 4:
					this.newPiece = new Queen(9);
					valid = true;
					System.out.println("This pawn is now a " + this.getClass().getSimpleName());
					break;

				default:
					System.out.println("Invalid choise");
					break;
				}
				promoted = true;
			} // if

		} // while

	}// method
*/
}
