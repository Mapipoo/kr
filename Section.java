public class section{
	private double this.x = 0;
	private double this.y = 0;
	public section(){
		this.x = x;
		this.y = y;
	}
	public void length(Section section){
		length = math.abs(((getX() + section.getX()) * (getX() + section.getX())) + ((gety() + section.getY()) * (gety() + section.getY())));
		return length
	}
	public void sectionS(Section section){

	}
	public void sectionMeet(Section section){
		cos1 = section1 * section2 / section1.length() * section2.length();
		if cos1 == 0{
			return true
		}
		return false 
	}
	public void toString(){
		System.out.println("Длина:"section.length())
	}
	public void sectionEquals(){
		if section1.length() == section2.length(){
			System.out.println("вектора равны")
			else{
				System.out.println("вектора не равны")
			}
		}
	}
	public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double newX){
        this.x = newX;
    }

    public void setY(double newY){
        this.y = newY;


}