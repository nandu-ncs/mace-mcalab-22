package graphics;

interface Rectangle {
	public float rarea(int l, int b);
}
interface Triangle {
	public float tarea(int b, int h);
}
interface Square {
	public float sarea(int s);
}
class Circle {
	public float carea(int r) {
		return (float)3.14*r*r;
	}
}
public class GraphicsShapes extends Circle implements Rectangle,Triangle,Square {
	public float rarea(int l, int b) {
		return l*b;
	}
	public float tarea(int b, int h) {
		return (float)0.5*b*h;
	}
	public float sarea(int s) {
		return s*s;
	}
}