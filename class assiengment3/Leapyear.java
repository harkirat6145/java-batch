class Leapyear{
public static void main(String[] arry){
int a=2020;

if(a%400==0)
{
System.out.println("The given year is leap year");
}
else if(a%100==0)
{
System.out.println("the given year is not leap year");
}
else if(a%4==0)
{
System.out.println("the given year is a leap year");
}
else
{
System.out.println("not leap year");
}
}}