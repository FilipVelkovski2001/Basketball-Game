
public class Players {
	
	protected String name;
	private int rating;
	private double ppg;
	private double apg;
	private double rpg;
	protected String[] moves = {"Three", "Mid-range", "Layup", "Dunk", "Floater", "Eurostep"};
	protected int playerOneScore = 0;
	protected int playerTwoScore = 0;
	
	
	public Players(String name, int rating, double ppg, double apg, double rpg) {
		
		this.name = name;
		this.rating = rating;
		this.ppg = ppg;
		this.apg = apg;
		this.rpg = rpg;
	}
	
	public Players() {
		
		
	}
	
	public String toString(){
		return this.name + " - Overall rating: " + this.rating +
	    " PPG: "+ this.ppg + " APG: "+ this.apg + " RPG: "+ this.rpg;
		
	}

}
