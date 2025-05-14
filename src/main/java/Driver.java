import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter c = new Counter();
		
		System.out.println("Hitung :" + c.getCount());
		
		c.increment();
        c.increment();
		
		System.out.println("Hitung :" + c.getCount());
		
		c.decrement();
        c.decrement();
		
		System.out.println("Hitung :" + c.getCount());
		
	}

}
