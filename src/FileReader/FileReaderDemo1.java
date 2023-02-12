package FileReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderDemo1 {
	
	public static void main(String[] args)throws IOException
	{
	File f1=new File("cricket.txt");
	FileReader fr1=new FileReader(f1);
	char[] ch=new char[(int)f1.length()]; //small amount of data
	fr1.read(ch);
	for(char ch1:ch)
	{
	System.out.print(ch1);
	}
	}
	}

