
public class Indexing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="cse students in cse branch";
		System.out.println(s.indexOf('s'));
		System.out.println(s.indexOf('S'));
		System.out.println(s.indexOf('e', 1));
		System.out.println(s.indexOf("cses"));
		System.out.println(s.indexOf("cse", 15));
		System.out.println(s.indexOf("in", 12));
		System.out.println(s.lastIndexOf('b'));
		System.out.println(s.lastIndexOf('c'));
		System.out.println(s.lastIndexOf("branch"));

	}

}
