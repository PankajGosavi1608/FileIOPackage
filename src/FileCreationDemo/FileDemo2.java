package FileCreationDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	
	public static void main(String[] args)throws IOException
	{
	File f=new File("C:\\Users\\ADMIN\\Desktop\\java\\Daily Practice Durga Sir\\FileIOPackage","demo.txt");
	f.createNewFile();
	}
	}



