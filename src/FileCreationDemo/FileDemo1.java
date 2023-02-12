//Requirement: Write code to create a directory named with SaiCharan123 in current 
//working directory and create a file named with abc.txt in that directory. 

package FileCreationDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
	
	public static void main(String[] args)throws IOException
	{
	File f1=new File("Pankaj");
	f1.mkdir();
	File f2=new File("Pankaj1608","abc.txt");
	f2.createNewFile();
	}
	}



