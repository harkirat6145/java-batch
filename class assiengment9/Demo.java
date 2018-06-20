import java.util.Scanner;
import java.io.IOException;
import java.io.*;

class Demo
{
public static void main(String[] arry) throws IOException
{


File f=new File("C:/Users/student/Desktop/traning/class assiengment9/abc.txt");

FileInputStream fis = new FileInputStream(f);


int c;

while( (c=fis.read()) != -1){
System.out.println((char)c);
}

}}