package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTheFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         File f=new File("source.txt");
         try {
			FileReader fr=new FileReader(f);
			int i=fr.read();
			while(i!=-1)
			{
				char ch=(char) i;
				System.out.print(ch);
				i=fr.read();
 			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
