import java.awt.*;
public class fixMe {
static final String startStr="\n****start of the program****";
static final String endStr="\n****end of the program****";
public static void main(String [] args){
		printMessage(startStr);
		Square s=new Square(100);

                System.out.println(s.computePerimeter());
		System.out.println(s.computeSurface());
	
		printMessage(endStr);
		
}//main Method
public void paint(Graphics g) 
{
    ColorPoint cp1=new ColorPoint(1,1);
		Color cp2= new Color(12,34,56);
                g.setColor(Color.BLUE);
g.drawLine(1,1,1,1);
g.setColor(cp2);
g.drawLine(10,10,10,10);
}
private static void printMessage(String str)
{
	System.out.println(str);
}
}
////////////////////////////////
class Square {
private int x;
    public Square(int init_x){x=init_x;}
	public int computeSurface(){return x*x;}
	public int computePerimeter(){return 4*x;}

}//square
class Point{
	public Point(int init_x,int init_y){
		x=init_x;
		y=init_y;
	}
	public void move(int init_x,int init_y){
		x+=init_x;
		y+=init_y;
	}
	protected int x,y;
}//point
class ColorPoint extends Point{
	public ColorPoint(int init_x,int init_y){
		super(init_x,init_y);
        }
       Color getc() 
       {      return Color.BLUE;
	}
	
}//ColorPoint
