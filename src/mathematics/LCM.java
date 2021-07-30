package mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCM {

	public static void main(String[] args) throws IOException{
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no 1");
		Integer number1=Integer.parseInt(reader.readLine());
		System.out.println("Enter the no 2");
		Integer number2=Integer.parseInt(reader.readLine());
		System.out.println("LCM of "+number1+" and "+number2+" is "+lcm(number1,number2));
		

	}

	private static Integer lcm(Integer number1, Integer number2) {
		// TODO Auto-generated method stub
		Integer result=Math.max(number1,number2);
		while(true)
		{
			if(result%number1==0 && result%number2==0){
				return result;
			}
			result++;
		}
		
	}

}
