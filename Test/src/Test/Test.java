package Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int c;
		try {
			InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
			while ((c=inputStream.read())>=0) {
				System.out.println((char)c);
			}
			
			inputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
