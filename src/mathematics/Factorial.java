package mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial  {

	public static void main(String[] args) throws IOException{
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		Integer number=Integer.parseInt(reader.readLine());
		System.out.println(factorial(number));
	}

	private static Integer factorial(Integer number) {
		if(number==0){
			return 1;
		}
		return number*factorial(number-1);
	}

}
