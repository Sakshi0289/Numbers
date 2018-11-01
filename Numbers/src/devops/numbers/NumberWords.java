package devops.numbers;


public class NumberWords {


	 public static final String[] units ={ "","One","Two","Three","Four",
			"Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve",
			"Thirteen","Fourteen","Fifteen","Sixteen","Seventeen",
			"Eighteen","Nineteen"};
	public static final String[] tens = {
			"",
			"",
			"Twenty",
			"Thirty",
			"Forty",
			"Fifty",
			"Sixty",
			"Seventy",
			"Eighty",
			"Ninty"
	};
	
	public static final String toWords( int number ) {
		String result = "";
		
		
		

			if (number==0){
				System.out.println("Exit from the program initiated");
				System.exit(0);
				
			}
			
			if (number<20){
				
				 result = units[number];
				
			}
			
			if (number>19 && number<100){
				
				result= tens[number /10]+((number %10 != 0) ? " " : "")+units[number%10];
			}
			
			if (number>99 && number<1000){
				
				result=units[number /100] + " Hundred "+((number %100 != 0) ? " " : "")+toWords(number%100);
				
			}
			
			else if (number>999)
				
		System.out.println("The number entered is not in the range of 1-999");	
			System.exit(0);
			
			return result;
		
			
		
		
		
		
	//}
	}
};
