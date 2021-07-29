package mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountDigit {

	public static void main(String[] args) throws IOException {
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		Integer number=Integer.parseInt(reader.readLine());
		System.out.println(countdigit(number));
	}
	public static int countdigit(Integer n){
		int count=0;
		while(n!=0){
			n=n/10;
			count++;
		}
		return count;
	}
}
