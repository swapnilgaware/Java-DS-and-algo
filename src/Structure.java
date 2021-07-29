//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.*;
public class Structure {

	public static void main(String[] args) {
		int n=5;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=1;i<=n;i++){
			arr.add(i);
		}
		//arr.forEach((e)->{
			//System.out.println(e);
		//});
		
		
		//ArrayList<Integer> nums= new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,2,1,5,4));
		//ArrayList<Integer> suffix= new ArrayList<Integer>();
	/*
		nums.remove(5);
		
		suffix.add(nums.get(nums.size()-1));
		
		System.out.println(nums);
		System.out.println(suffix);
		
		suffix.forEach((e)->{
			System.out.println(e);
		});
		
		Integer sum=nums.get(0);
		Integer largest=sum;
		
		for(Integer i=1;i<nums.size();i++){
			sum=(nums.get(i)>sum+nums.get(i))?nums.get(i):sum+nums.get(i);
			
			largest=(sum >largest)?sum:largest;
		}
		System.out.println(largest);
		
	*/	
//-------------------------------------Reversing an array-----------------------------------------//
		/*ArrayList<Integer> newarray= new  ArrayList<Integer>();
		for(int i =nums.size()-1;i>=0;i--){
			newarray.add(nums.get(i));
			
		}
		System.out.println(newarray);
		*/
//--------------------------------------------smaller adjacent element----------------------------------------------------------		
		  /* ArrayList<Integer> newarray= new ArrayList<Integer>();
		    
		    for(Integer i=0;i<nums.size()-1;i++){
		       
		    	if(nums.get(i)>nums.get(i+1) && i !=nums.size()){
		            newarray.add(nums.get(i));
		        }else
		        {
		            newarray.add(nums.get(i+1));
		        }
		    }
	System.out.println(newarray);
	*/
//---------------------------Buffered Reader-----------------------------------------	
	/*BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

	try {
		System.out.println("Enter your name");
		String name=reader.readLine();
		System.out.println("Enter your age");
		int age=Integer.parseInt(reader.readLine());
		System.out.println(name);
		System.out.println(age);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		*/
//----------------------------------------------------------------------------------------------		
		
		
	}
	
	
	

}
