package PrintWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	
	public static void main(String[] args)throws IOException
	{ 
	FileWriter fw=new FileWriter("cricket.txt"); 
	PrintWriter out=new PrintWriter(fw); 
	out.write(100); 
	out.println(100); 
	out.println(true); 
	out.println('c'); 
	out.println("Pankaj"); 
	out.flush(); 
	out.close(); 
	} 
	} 



//PrintWriter:
// This is the most enhanced Writer to write text data to the file.
// By using FileWriter and BufferedWriter we can write only character data to the 
//File but by using PrintWriter we can write any type of data to the File.
//Constructors:
//PrintWriter pw=new PrintWriter(String name);
//PrintWriter pw=new PrintWriter(File f);
//PrintWriter pw=new PrintWriter(Writer w); 
//PrintWriter can communicate either directly to the File or via some Writer object also.
//Methods:
//1. write(intch);
//2. write (char[] ch);
//3. write(String s);
//4. flush();
//5. close();
//6. print(char ch);
//7. print (int i);
//8. print (double d);
//9. print (boolean b);
//10. print (String s);
//11. println(char ch);
//12. println (int i);
//13. println(double d);
//14. println(boolean b);
