import java.math.BigInteger;
import java.math.BigDecimal;

public class Convert {
	
	public static void main(String[] args) {
		BigInteger b=new BigInteger("23184718147756825");
		System.out.println(b.doubleValue());
		BigDecimal d=new BigDecimal("2.3184718147756825");
		System.out.println(d.toBigInteger());
	}

}
