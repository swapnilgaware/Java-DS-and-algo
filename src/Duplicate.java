import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {
	int[] arr={1,0,2,3,0,4,5,0};
	boolean isSwap = false;
    for (int i = 0; i < arr.length; i++) {

        int j = arr.length - 1;
        if (isSwap) {
            isSwap = false;
            continue;

        }
        if (arr[i] == 0) {
            while (j > i) {
                arr[j] = arr[--j];

            }
            isSwap = true;
        }
    }
	System.out.println(Arrays.toString(arr));
	}

	}


