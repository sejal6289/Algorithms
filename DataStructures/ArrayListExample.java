import java.util.ArrayList;

public class ArrayListExample {
	
	public void test() {
	
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	ArrayList<Integer> a2 = new ArrayList<Integer>();
	
	a1.add(1);
	a1.add(20);
	
	a1.remove(1);
	
	a1.size();
	
	
	a1.clear();
	
	a1.addAll(a2);
	
	a1.isEmpty();
	
	a1.set(1,80);
	
	Boolean ans = a1.contains(2);
	
	}

}
