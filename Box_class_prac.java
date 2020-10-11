class Box
{
	double width;
	double height;
	double depth;

	double calculateVolume()
	{
		double vol = width*height*depth;
		return vol;
	}

	void setval(double u_height, double u_width, double u_depth)
	{
		height = u_height;
		width = u_width;
		depth = u_depth;
	}
}

class Box_class_prac
{
	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new Box();

		box1.setval(10,15,20);
		box2.setval(15,25,5);

		System.out.println(box1.calculateVolume());
		System.out.println(box2.calculateVolume());
	}
}