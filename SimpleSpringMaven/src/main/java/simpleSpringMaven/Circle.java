package simpleSpringMaven;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shape {
	private point center;

	public point getCenter() {
		return center;
	}

	@Resource(name="point2")
	public void setCenter(point center) {
		this.center = center;
	}
	@PostConstruct
	public void initializeCircle()
	{
		System.out.println("circle is initialized");
	}
	@PreDestroy
	public void destroyCircle()
	{
		System.out.println("circle is destroyed");
	}
	

	public void draw() {
		System.out.println("circle is drawn");
		System.out.println("the center point of circle is (" + center.getX()
				+ "," + center.getY() + ")");
	}

}
