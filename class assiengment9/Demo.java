import java.util.Scanner;
import java.io.*;

class Demo
{
public static void main(String[] arry)
{
File f=new File("C:\Users\student\Desktop\traning\abc.txt");
FileInputStream fis = new FileInputStream(f);
int c;
while( (c=fis.read()) != -1){
System.out.println((char)c);
}
}}