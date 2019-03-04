package LineSegment;

public class 点 {

    private double x;

    private double y;

    public 点(double x,double y){
	System.out.println("点 is created");
	this.x = x;
	this.y = y;
    }
    public 点 linearTransfer() {
	System.out.println("点's linearTransfer is called");
	return new 点(6*this.x+4*this.y,-2*this.x+this.y);
    }

    public String toString() {
	System.out.println("点's toString is called");
	return "("+this.x+","+this.y+")";
    }

}
