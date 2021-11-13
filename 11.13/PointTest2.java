class Point {
	private int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x = " + x + ", y = " + y;
	}
	
}

class MovablePoint extends Point{
	private int xSpeed, ySpeed;

	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public String toString() {
		return "xSpeed = " + xSpeed + ", ySpeed = " + ySpeed;
	}
	
}
public class PointTest {

	public static void main(String[] args) {
		Point p = new Point(1, 3);
		System.out.println(p.toString());
		MovablePoint m = new MovablePoint(1, 3, 20, 30);
		System.out.println(m.toString());

	}

}

