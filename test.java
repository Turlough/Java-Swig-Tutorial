

public class test{
	
	static {
		System.loadLibrary("example");
	}
	
	public static void main(String args[]){
		int i = Integer.parseInt(args[0]);
		System.out.println(example.fact(i));
	}
}
