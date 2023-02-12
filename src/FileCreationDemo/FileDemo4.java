package FileCreationDemo;

import java.io.IOException;
import java.io.File;
public class FileDemo4 {
	
	
	public static void main(String[] args)throws IOException
	{ int count=0;
	File f=new File("C:\\Users\\ADMIN\\Desktop\\java\\Daily Practice Durga Sir\\FileIOPackage\\Pankaj_classes");
	String[] s=f.list();
	for(String s1:s) {
	File f1=new File(f,s1);
	if(f1.isDirectory()) {
	count++;
	System.out.println(s1);
	 }
	 }
	System.out.println("total number : "+count);
	}
	}


