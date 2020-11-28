
public class GetEnv {

	public static void main(String[] argv) {
		// TODO Auto-generated method stub
		System.out.println("System.getenv(\"PATH\")="+System.getenv("path"));
		System.out.println("USERNAME="+System.getenv("username"));
		System.out.println("environment variable temp="+System.getenv("temp"));
		System.out.println(System.getenv());
	}

}
