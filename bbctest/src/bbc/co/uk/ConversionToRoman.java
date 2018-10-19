package bbc.co.uk;

public class ConversionToRoman implements RomanNumeralGenerator{

	
	public ConversionToRoman() {
		
	}
	public ConversionToRoman(int j) {
		super();
	}
	public String generate(int number) {
		final String[] characters = new String[] {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		final int[] digits= new int[] {1000,900,500,400,100,90,50,40,10,9,5,4,1};		
		StringBuilder numeral = new StringBuilder();
		if (number<3999 || number < 1) {
			
			//System.out.println("Illegal number"); 
		
		
		//numeral = new StringBuilder();
		int i =0;
		while (number > 0) {
			if (number - digits[i] >=0) {
				numeral.append(characters[i]);
			//	System.out.println(numeral);
				number -= digits[i];
			} else {
				
				i++;
				
				//System.out.println(numeral);
				}
			
		//	return numeral.length();
		
		}
		//return numeral.toString();
	}
		//System.out.println(numeral);
		return numeral.toString();

		
	}
	
	
	 public boolean isGreater(int num1, int num2){
		 
		         return num1 > num2;
		 
		     }

	
	
public static void main(String[] args) {
	
	int j=999;
	ConversionToRoman ctb = new ConversionToRoman(j);
	System.out.println(ctb.generate(j));
	
	//System.out.println("Hello world");
}
}

