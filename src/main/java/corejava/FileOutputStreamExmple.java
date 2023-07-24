package corejava;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to write in file
//		try {
//			FileOutputStream fout=new FileOutputStream("C:\\Users\\SHWETA\\Desktop\\shweta.txt");
//			fout.write(65);
//			fout.close();
//			System.out.println("writing completed");
//		}
//		catch(Exception e) {
//			
//		}
		//read file
		try {
			FileInputStream fin=new FileInputStream("C:\\Users\\SHWETA\\Desktop\\shweta.txt");
			int i=fin.read();
			System.out.println((char)i);
			fin.close();
			System.out.println("reading  completed");
		}
		catch(Exception e) {
			
		}

	}

}
