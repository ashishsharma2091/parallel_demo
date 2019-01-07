
public class ReverseStringKeepSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="Jai Mata DI";
		   //output ="IDa taMi aj";
		
		 reverseIT(input);
	}
	public static  void reverseIT(String input) {
		char[] inputArray=input.toCharArray();
		int sizeInput=inputArray.length;
		char[] out= new char[sizeInput];
		for(int i=0;i<=sizeInput-1;i++) {
			if(inputArray[i]==' ') {
				out[i]=' ';
			}
		}
		int k=0;
		for(int j=sizeInput-1;j>=0;j--) {
			if((inputArray[j]!=' ')) {
				if((out[k]!=' ')) {
				out[k]=inputArray[j];
				k++;
				}
				else {
					k++;
					out[k]=inputArray[j];
					k++;
					//j--;
					}
			}else {
			//k++;
			//j--;
			}
		}
		
		
			System.out.println("output is "+String.valueOf(out));
		
		
		
	}
}
