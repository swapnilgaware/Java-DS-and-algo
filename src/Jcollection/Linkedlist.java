package Jcollection;
import java.util.*;


public class Linkedlist {

	public static void main(String[] args) {
	LinkedList<Integer> list= new LinkedList<>();
	list.add(2);
	list.add(3);
	list.add(-1);
	list.add(23);
	System.out.println(list);
	System.out.println(list.getFirst()+" "+list.getLast());
	}

}
