package eg1;
import java.util.*;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

List<Integer> list = new ArrayList<>();
		
		int[] arr = {10, 20, 30, 30, 20, 10, 30, 40, 20, 10};
		System.out.println("WIth duplicates : " +Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if(!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		
		Collections.sort(list);
		System.out.println("Without Duplicated : " +list);
	}

}

