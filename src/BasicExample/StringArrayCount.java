package BasicExample;

import java.util.Arrays;
import java.util.List;

public class StringArrayCount {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("tanmay", "Akshada", "Atharv");
		char searchChar='t';
		Long count =  list.stream().filter(x->x.contains(String.valueOf(searchChar)))
		.count();
		System.out.println("count:: " + count);
	}
}
