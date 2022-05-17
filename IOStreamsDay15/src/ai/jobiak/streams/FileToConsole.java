package ai.jobiak.streams;

import java.io.FileInputStream;

public class FileToConsole {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("E:\\jobiak\\core\\IOStreamsDay15\\src\\ai\\jobiak\\streams\\FileToConsole.java");
		int data = fis.read();
		while(data!=-1) {
			System.out.print((char)data);
			data=fis.read();
		}//

	}

}
