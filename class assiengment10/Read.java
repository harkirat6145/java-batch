import java.io.*;
class Read{
public static void main(String[] arry)throws IOException {
int a;
File f=new File("C:/Users/student/Desktop/traning/class assiengment10/krt.txt");
File b=new File("C:/Users/student/Desktop/traning/class assiengment10/sng.txt");

FileInputStream fis=new FileInputStream(f);
FileOutputStream fos=new FileOutputStream(b);
while((a=fis.read())!=-1)
{
fos.write(a);
fos.flush();
}}}