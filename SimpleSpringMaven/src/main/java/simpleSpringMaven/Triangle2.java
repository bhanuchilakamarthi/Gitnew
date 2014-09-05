package simpleSpringMaven;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle2 implements InitializingBean,DisposableBean {
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
	public void draw()
	{
		System.out.println("pointA=("+ getPointA().getX()+","+ getPointA().getY()+")");
		System.out.println("pointB=("+ getPointB().getX()+","+ getPointB().getY()+")");
		System.out.println("pointC=("+ getPointc().getX()+","+ getPointc().getY()+")");
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
	System.out.println("method initialization is specified for bean");
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy method is specified for bean");	
	}
	public void myInit()
	{
		System.out.println("my init method is initialized");
	}
	public void cleanUp()
	{
		System.out.println("cleanup method is called");
	}

}
