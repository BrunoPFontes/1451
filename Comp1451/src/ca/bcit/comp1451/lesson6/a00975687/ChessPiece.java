package ca.bcit.comp1451.lesson6.a00975687;

public class ChessPiece {
	
	private int value;

	public ChessPiece(int value) {
		
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public void move(){
		System.out.println("Moving...");
	}
	
	
	@Override
	public String toString(){
		String name = getClass().getSimpleName();
		return name;
	}

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(!(obj instanceof ChessPiece))
			return false;
		if(getClass() != obj.getClass())
			return false;
		
		ChessPiece other = (ChessPiece) obj;
		if(value != other.value)
			return false;
		
		return true;
	}
	
	

}
