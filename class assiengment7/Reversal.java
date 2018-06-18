class Reversal{
public static void main(String[] arry){
int a=1234;
int x;
int reverse;
reverse=0;
while(a>0)
{x=a%10;
reverse=reverse*10+x;
a=a/10;
}

System.out.println(reverse);

}}