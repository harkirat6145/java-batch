class Arraylist{
private static int CAPACITY;
private Object ob[]=null;
private static int count;
Arraylist(int cap)
{
CAPACITY=cap;
}



Arraylist(Object coll)
{
}
//al.add(10);
public void add(Object o)
{
if(ob==null)
	{
		if(CAPACITY==0)
			ob=new Object[10];
		else
			ob=new Object[CAPACITY];
			ob[count++]=o;
	}
else
{
if(count<CAPACITY)
{
ob[count++]=o;
}
else
{
Object temp[]=ob.clone();
CAPACITY=(int)(CAPACITY*1.5F);
ob=new Object[CAPACITY];
System.arraycopy(temp,0,ob,0,temp.length);


}}}



public int getCapacity(){
return CAPACITY;
}
}