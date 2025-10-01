package scannerClass_BufferDemo;

import java.io.FileReader;
import java.io.BufferedReader;


public class BufferedReaderDemo {

	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\hemav\\OneDrive\\Desktop\\Java training Notes\\demo.txt"));
		String data ="";
		while((data=br.readLine())!=null) {
			System.out.println(data);
		}
      br.close();
	}

}
