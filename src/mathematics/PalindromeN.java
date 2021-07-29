package mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeN {

	public static void main(String[] args) throws IOException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		Integer number=Integer.parseInt(reader.readLine());
		System.out.println(palindrome(number));

	}

	private static boolean palindrome(Integer number) {
		Integer temp=number,reverseNumber=0;
		while(temp!=0){
			reverseNumber=reverseNumber*10 + temp%10;
			System.out.println(reverseNumber);
			temp=temp/10;
		}
		if(reverseNumber==number){
			return true;
				
		}else {
			return false;
		}
		
	}
}
