package simpleSpringMaven;

import java.util.List;

public class Triangle3 {
	private List<point> points;

	public List<point> getPoints() {
		return points;
	}

	public void setPoints(List<point> points) {
		this.points = points;
	}

	public void draw() {
		for (point p : points) {
			System.out.println("point=(" + p.getX() + "," + p.getY() + ")");
			//System.out.println("pointB=(" + p.getX() + "," + p.getY() + ")");
			//System.out.println("pointC=(" + p.getX() + "," + p.getY() + ")");
		}
	}

}
