
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        int[] arr = {12,3,1,2,-6,5,-8,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        List<Integer[]> result = threeNumberSum(arr,0);

        System.out.println("SizE"+result.size());
        for(int i=0;i<result.size();i++){
            for(Integer j:result.get(i)){
                System.out.print(j+" ");
            }
            System.out.println("\n");
        }

     }
     public static List<Integer[]> threeNumberSum(int[] array,int targetSum){
        List<Integer[]> res = new ArrayList<Integer[]>();
        Arrays.sort(array);
        for(int i=1;i<array.length-1;i++){


           int left=i-1;
           int right =i+1;


           while(left>=0 && right <= array.length-1){
               int currSum= array[i]+array[left]+array[right];

               System.out.println("left: "+array[left]+" Current:"+array[i]+" Right: "+array[right]);
               if(currSum==targetSum){
                   Integer[] resRow = {array[i],array[left],array[right]};
                    res.add(resRow);
               }
               if(currSum<targetSum){
                   right++;
               }
               if(currSum>targetSum){
                   left--;
               }
           }
        }
        return res;
     }
}
