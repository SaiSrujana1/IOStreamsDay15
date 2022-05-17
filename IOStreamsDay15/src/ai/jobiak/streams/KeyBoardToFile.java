package ai.jobiak.streams;

import java.io.DataInputStream;
import java.io.FileWriter;

public class KeyBoardToFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter writer = new FileWriten("mydata..txt");
		
		DataInputStream dis = new  DataInputStream(System.in);
		String data = dis.readLine();
		while(!data.equals("stop")) {
			writer.write(data);
			data = dis.readLine();
		}
  writer.close();
  System.out.println("after the loop");
	}

}
