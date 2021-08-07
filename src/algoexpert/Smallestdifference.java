package algoexpert;

import java.util.Arrays;

public class Smallestdifference {

	public static void main(String[] args) {
		Integer[] arrayone={-1,5,10,20,28,3};
		Integer[] arraytwo={26,134,135,15,17};
		System.out.println(Arrays.toString(smallestdifference(arrayone,arraytwo)));

	}

	private static Integer[] smallestdifference(Integer[] arrayone, Integer[] arraytwo) {
		Arrays.sort(arraytwo);
		Arrays.sort(arrayone);
		System.out.println(Arrays.toString(arrayone));
		System.out.println(Arrays.toString(arraytwo));
		Integer smallestdifference=Integer.MAX_VALUE;
		Integer currentdifference=Integer.MAX_VALUE;
		Integer[] pair = new Integer[2];
		Integer indexOne=0;
		Integer indexTwo=0;
	
		while(indexOne<arrayone.length && indexTwo<arraytwo.length){
			
			Integer firstnumber=arrayone[indexOne];
			Integer secondnumber=arraytwo[indexTwo];
			if(firstnumber>secondnumber){
			currentdifference=firstnumber-secondnumber;
		
			indexTwo++;
			}else if(firstnumber<secondnumber){
				currentdifference=secondnumber-firstnumber;
				indexOne++;
			
			}else{
				Integer[] difference={firstnumber,secondnumber};
				return difference;
			}
			if(smallestdifference > currentdifference){
				
				smallestdifference=currentdifference;
				pair=new Integer[]{firstnumber,secondnumber};
			}
		}
		
		return pair;
	}

}
