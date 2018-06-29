import java.util.*;
import java.lang.Thread;
import java.io.*;
class Sync extends Thread{
static int i=1;
public synchronized void print(){
for (int j=0;j<=500;j++){
System.out.println(this.i++);
}

}
public void run(){
print();
}
public static void main(String[] arry){
Sync s1=new Sync();
Thread t=new Thread(s1);
// sync s2 =new ync();
Thread t1=new Thread(s1);

 t.start();
t1.start();
}
}