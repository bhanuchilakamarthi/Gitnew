package simpleSpringMaven;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle4 implements ApplicationContextAware,BeanNameAware{
	private point pointA;
	private point pointB;
	private point pointC;
	private ApplicationContext c=null;
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
	public point getPointC() {
		return pointC;
	}
	public void setPointC(point pointC) {
		this.pointC = pointC;
	}
	public void draw()
	{
		System.out.println("pointA=("+ getPointA().getX()+","+ getPointA().getY()+")");
		System.out.println("pointB=("+ getPointB().getX()+","+ getPointB().getY()+")");
		System.out.println("pointC=("+ getPointC().getX()+","+ getPointC().getY()+")");
	
	}
	public void setApplicationContext(ApplicationContext c)
			throws BeansException {
		// TODO Auto-generated method stub
		this.c=c;
	}
	public void setBeanName(String b) {
		// TODO Auto-generated method stub
		System.out.println("bean name is"+b);
	}
}
