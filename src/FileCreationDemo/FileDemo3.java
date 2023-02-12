package FileCreationDemo;

import java.io.IOException;
import java.io.File;

public class FileDemo3 {
	
	
	public static void main(String[] args)throws IOException
	{ int count=0;
	File f=new File("C:\\Users\\ADMIN\\Desktop\\java\\Daily Practice Durga Sir\\FileIOPackage\\Pankaj_classes");
	
	String[] s=f.list();
	for(String s1:s) {
		count++;
	System.out.println(s1);
	 }
	System.out.println("total number : "+count);
	}
	}



