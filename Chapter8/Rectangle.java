public class Rectangle{
	private float width;
	private float length;

	public Rectangle(){
		width = 1;
		length = 1;
	}
	public Rectangle(float width, float length){
		this.width = width;
		this.length = length;
	}
	public Rectangle(float width){
		this.width = width;
		this.length = width;
	}

	public float getWidth(){
		return width;
	}

	public float getLength(){
		return length;
	}

	public void setWidth(float width){
		this.width = width;
	}

	public void setLength(float length){
		this.length = length;
	}

	public float perimeter(){
		return ((length*2)+(width*2));
	}

	public float area(){
		return (length*width);
	}
}