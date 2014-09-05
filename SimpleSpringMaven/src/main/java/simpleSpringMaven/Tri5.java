package simpleSpringMaven;

public class Tri5 implements Shape{
	private point pointA;
	private point pointB;
	private point pointc;

	public point getPointA() {
		return pointA;
	}

	public void setPointA(point pointA) {
		this.pointA = pointA;
	}

	public point getPointB() {
		return pointB;
	}

	public void setPointB(point pointB) {
		this.pointB = pointB;
	}

	public point getPointc() {
		return pointc;
	}

	public void setPointc(point pointc) {
		this.pointc = pointc;
	}

	public void draw() {
		System.out.println("triangle drawn");
		System.out.println("pointA=(" + getPointA().getX() + ","
				+ getPointA().getY() + ")");
		System.out.println("pointB=(" + getPointB().getX() + ","
				+ getPointB().getY() + ")");
		System.out.println("pointC=(" + getPointc().getX() + ","
				+ getPointc().getY() + ")");
	}

}
