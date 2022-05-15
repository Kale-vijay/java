import java.util.*;

public class ArrayListDemo {
public static void main(String args[]) {
	List<Integer> arrList=new ArrayList<>(5);
	for(int i=1;i<=10;i++) {
		arrList.add(i);
	}
	System.out.println(arrList);
	arrList.remove(3);
	System.out.println("arraylist after remove element at index at 3 "+arrList);
	

	
}
}
