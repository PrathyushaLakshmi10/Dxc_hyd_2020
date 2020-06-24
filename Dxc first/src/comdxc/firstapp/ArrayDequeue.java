package comdxc.firstapp;
import java.util.*;


// Dequeue interface extends Queue Interface. We can add or remove
// values from both the sides and we can perform operations from
// both the ends

// ArrayDequeue class implements Dequeue interface
public class ArrayDequeue {
	
	public static void main(String[] args) {
		Deque<String> mDequeue = new ArrayDeque<String>();
		mDequeue.add("Sachin");
		mDequeue.add("Rohit");
		mDequeue.add("Shikhar");
		mDequeue.add("Virat");
		
		
		// Implementing For Each Loop for ArrayTraversing
		// Foreach loop in java is break into 2 parts i.e for and each which says "for each value in array"
		// Traversing the arrays
		for(String str: mDequeue)
			System.out.println(str);
		
		mDequeue.remove();
		System.out.println("-----------==========---------------");
		for(String str: mDequeue)
			System.out.println(str);
	}
}