import java.util.Scanner;
class Prime{
public static void main(String[] arr){

Scanner sc=new Scanner(System.in);
System.out.println("enter any no.");
int num=sc.nextInt();
int i,j,count;
if(num==0||num==1)
System.out.println("it is not prime");
else
{
for(i=2;i<=num;i++){
count=0;
for(j=1;j<=i;j++){
if(i%j==0){
count++;
}}
if(count==0){

System.out.println(i);
}}}}}