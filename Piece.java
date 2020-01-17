public abstract class Piece 
{
	private boolean color;
	private String position;
	
	public Piece() //Default constructor that has no parameters
	{
		
	}
	
	public Piece(boolean color, String position) //Constructor that sets color and position
	{
		this.color = color;
		this.position = position;
	}
	
	public abstract String returnColor(); //Returns the color
	
	public abstract String returnPosition(); //Returns the position
	
	public abstract void changePosition(String newPos);
}
