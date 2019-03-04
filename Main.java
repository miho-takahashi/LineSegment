package LineSegment;

public class Main {

    public static void main(String[] args) {
	System.out.println("main is called");

	Input input = new Input();
	double x1 = input.inputDouble("Please input \"x1\"");
	double y1 = input.inputDouble("Please input \"y1\"");
	double x2 = input.inputDouble("Please input \"x2\"");
	double y2 = input.inputDouble("Please input \"y2\"");
	
	線分 線分1 = new 線分(x1,y1,x2,y2);
	線分 afterLine = 線分1.linearTransfer();

	線分1.toString();
	System.out.println(線分1+"-->"+afterLine);
    }

}
