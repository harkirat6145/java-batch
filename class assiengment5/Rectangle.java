class Rectangle{

int length;
int breadth;

void setLength(int x){
length = x;
}
void setBreadth(int y){
breadth = y;
}

void calculateArea(){
int area = length * breadth;
System.out.println(area);
}

public static void main(String[] abc){

Rectangle r = new Rectangle();

r.setLength(5);
r.setBreadth(10);
r.calculateArea();
}}