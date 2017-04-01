package dp;

public class BoxStacking {
	int height;
	int length;
	int width;
	int area;

	public BoxStacking(int length, int width, int height) {
		this.height = height;
		this.width = width;
		this.length = length;
		this.area=this.length*this.width;
	}
}
