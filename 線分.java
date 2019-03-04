package LineSegment;

public class 線分 {

    private 点 端点2;
    
    private 点 端点1;

    public 線分(double x1,double y1,double x2,double y2){
	System.out.println("線分 is created");
	this.端点1 = new 点(x1,y1);
	this.端点2 = new 点(x2,y2);
    }
    public 線分(点 端点1,点 端点2){
	System.out.println("線分 is created");
	this.端点1 = 端点1;
	this.端点2 = 端点2;
    }
    public 線分 linearTransfer() {
	System.out.println("線分's linearTransfer is called");
	return new 線分(this.端点1.linearTransfer(),this.端点2.linearTransfer());
    }
    
    public String toString() {
	System.out.println("線分's toString is called");
	return this.端点1+"--"+this.端点2;
    }
    
}
