package overview;

public class Shape {
	protected Point p;
	
	public Shape() {
		this.p = new Point();
	}
	
	public Shape(int x, int y) {
		this.p = new Point(x, y);
	}
	
	public Shape(Point p) {
		this.p = p;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}
	public void draw() {
		System.out.println("Shape Draw");
	}
	
	@Override
	public boolean equals(Object o) {
		return this.p.equals(((Shape)o).p);
	}
	
	@Override
	public String toString() {
		return String.format("p : %s", p.toString());
	}
	

	
	
	
	
	

}
