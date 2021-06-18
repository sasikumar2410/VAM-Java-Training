package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public FileCopy(File out) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 File f=new File("source1.txt");
		 File out=new File("sorce2.txt");
         try {
			FileReader fr=new FileReader(f);
			FileWriter fc=new FileWriter(out);
			 int j=0;
			try {
				j = fr.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while(j!=-1)
			{
				fc.write(j);
				j=fr.read();
 			}
			fr.close();
			fc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
