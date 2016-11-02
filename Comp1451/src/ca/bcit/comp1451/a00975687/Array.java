package ca.bcit.comp1451.a00975687;

public class Array {
	
	private String[][] provinces; {
	
	provinces[0][0] = "ab";
	provinces[1][0] = "bc";
	provinces[2][0] = "mb";
	provinces[3][0] = "nb";
	provinces[4][0] = "nl";
	provinces[5][0] = "ns";
	provinces[6][0] = "on";
	provinces[7][0] = "pe";
	provinces[8][0] = "qc";
	provinces[9][0] = "sk";
	
	provinces[0][1] = "alberta";
	provinces[1][1] = "british columbia";
	provinces[2][1] = "manitoba";
	provinces[3][1] = "new brunswick";
	provinces[4][1] = "newfoundland";
	provinces[5][1] = "nova scotia";
	provinces[6][1] = "ontario";
	provinces[7][1] = "prince edward island";
	provinces[8][1] = "quebec";
	provinces[9][1] = "saskatchewan";
	}
	
	public Array(){
		provinces = new String [10][2];
	}

	public void display(){
		for (int i = 0; i < provinces.length; i++) {
			System.out.println(provinces[i][0]);
		}
	}

	

}
