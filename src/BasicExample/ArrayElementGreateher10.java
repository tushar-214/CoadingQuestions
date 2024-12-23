package BasicExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayElementGreateher10 {
public static void main(String[] args) {
	List<Integer> alist=Arrays.asList(10,20,30,40,1,2,3,4);
	List<Integer> list =alist.stream().filter(x->x>10).collect(Collectors.toList());
	
	System.out.println("given element is " +list);
	
}
	
	
}
