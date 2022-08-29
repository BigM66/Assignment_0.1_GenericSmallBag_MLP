
public class Application {

	private static final String Item = null;

	public static void main(String[] args) {
		
		
		item<String> item1 = new item<>();
		
		item1.set( "Matthew Parsley");
		
		item<Integer> item2 = new item<>();
		
		item2.set(10);
		
		
		SmallBag<item> SmallBag = new SmallBag<>();
		
		SmallBag.set(item1);		
		
		System.out.println("The item in the bag is:" + item1.get());
		
		SmallBag.set(item2);
		
		System.out.println("The item in the bag is:" + item2.get());
		
		

	}

}
