package BasicExample;

import java.util.Arrays;
import java.util.List;

public class MinValuesUsimgArrayList {
	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(10,20,30,50,6,1);
	int minvalue=	list.stream().mapToInt(Integer:: intValue).min().orElseThrow();
	System.out.println("min Value :: "+minvalue);
	}

}
