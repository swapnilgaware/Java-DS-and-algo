package mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumbers {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENter the number");
		Integer number=Integer.parseInt(reader.readLine());
		System.out.println(PrimeNumber(number));
	}

	private static boolean PrimeNumber(Integer number) {
		if(number==1){
			return false;
		}
		if(number==2 || number==3){
			return true;
		}
		if(number%2==0 || number%3==0){
			return false;
		}
		for(int i=5;i*i<=number;i=+6)
		{
			if(number%i==0 || number%(i+2)==0){
				return false;
			}
		}
		return true;
	}

}
