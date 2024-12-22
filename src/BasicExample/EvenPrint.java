package BasicExample;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class EvenPrint {
public static void main(String[] args) {
	List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9);
    List evenList=	list.stream().filter(x->x%2==0).collect(Collectors.toList());
    System.out.println("List  :: "+evenList);
}
}
/*

stream() in Java
The stream() method is part of the Java Collections Framework.
 It is used to create a Stream from a collection (e.g., List, Set, or other collection types). 
 Streams enable functional-style operations on collections, such as filtering, mapping, and reducing.




Returns a sequential Stream with this collection as its source. 

This method should be overridden when the spliterator()method cannot return a spliterator that is IMMUTABLE, CONCURRENT, or late-binding. (See spliterator()for details.)
Returns:a sequential Stream over the elements in this collectionSince:1.8




*/