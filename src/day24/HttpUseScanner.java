package day24;

import java.net.URL;
import java.util.Scanner;

public class HttpUseScanner {

	public static void main(String[] args) throws Exception {
		String json = new Scanner(new URL("http://localhost:80/posts").openStream()).useDelimiter("\\A").next();
		System.out.println(json);

	}

}
