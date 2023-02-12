package FileCreationDemo;

import java.io.File;
import java.io.IOException;

public class FileDeemo {
	
	public static void main(String[] args)throws IOException
	{
	File f=new File("demo.txt");
	f.createNewFile();
	}
	}



