package org.variable.packages;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long l = 300000432432432423l;    // 8 bytes...Use l at the last
		int i = 2432;   // 4 bytes
		double d = 4.53;
		short s = 43;  // 2bytes
		float f = 5.324234f;  // Use f at the last(check without f)
		byte b = 127; //1 byte->8 bits...-128 to 127

		char c = 'A';
		c = 66; // American Std code for Information Interchange
		
		System.out.println(c); //It will print B for 66
				
		double dl = 5;  //implicit conversion
		int k = (int)5.7;  //Explicit conversion..Type casting
		System.out.println(k);
	}

}
