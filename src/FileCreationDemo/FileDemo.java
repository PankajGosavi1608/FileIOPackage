package FileCreationDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo {
//	
//	public static void main(String[] args)throws IOException
//	{
//	File f=new File("cricket.txt");
//	System.out.println(f.exists());//false
//	f.createNewFile();
//	System.out.println(f.exists());//true
//	}
//	}
public static void main(String[] args)throws IOException
{
File f=new File("cricket123");
System.out.println(f.exists());//false
f.mkdir();
System.out.println(f.exists());//true
}
}




