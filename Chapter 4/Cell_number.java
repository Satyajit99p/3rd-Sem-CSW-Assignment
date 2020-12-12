import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cell_number {
	public static void main(String[] args) throws IOException 
	{
		Pattern p = Pattern.compile("(\\^[7-9]\\d+{9})|(\\^[0]\\d+{10})|(\\^[91]||d+{10})");
		BufferedReader r = new BufferedReader(new FileReader(args[0]));
		String line="9437351768";
		while ((line = r.readLine()) != null) 
		{
			Matcher m = p.matcher(line);
			while (m.find()) 
			{
			int start = m.start(0);
			int end = m.end(0);
			if(m.matches())
				System.out.println("VALID "+line.substring(start, end));
			else
				System.out.println("INVALID "+line.substring(start,end));
			m.reset();
			}
		}
	}
}
