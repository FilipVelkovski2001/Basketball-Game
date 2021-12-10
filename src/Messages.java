

public class Messages extends Players{
	
	public void blank() {
		System.out.println(" ");	
	}

	public void welcome() {
		
		System.out.println("Welcome to the 1 on 1 Blacktop!");
	}
	
	public void select() {
		
		System.out.println("Player 1 Select your player!");
	}
	
    public void selectTwo() {
		
		System.out.println("Player 2 Select your player!");
	}

    public void availablePlayers() {
    	
    	System.out.println("These are your available players!");
    }
    
    public void showMoves() {
    	
    	System.out.println("Here are your available moves!");
    	
    	for(String moves : this.moves) {
    		System.out.println(moves);
    		
    	}
    	
    }
    
    public void showScore() {
    	
    	System.out.println(this.playerOneScore + " - " + this.playerTwoScore);
    	
    }

	
	
}
