import java.util.Scanner;

public class Blacktop {

	public static void main(String[] args) {
		
		Messages m = new Messages();
		
		m.welcome();
		
		m.blank();
		
		Players jordan = new Players("Michael Jordan", 99, 31.5, 5.5, 6.0);
		
		System.out.println(jordan.toString());
		
		m.blank();

        Players kobe = new Players("Kobe Bryant", 98, 30.5, 6.5, 3.0);
		
		System.out.println(kobe.toString());

		m.blank();

        Players lebron = new Players("LeBron James", 98, 28.5, 7.5, 8.0);
		
		System.out.println(lebron.toString());
		
		m.blank();

        Players steph = new Players("Stephen Curry", 99, 32.5, 7.5, 3.0);
		
		System.out.println(steph.toString());
		
		m.blank();
		
		m.select();
		
		Scanner s = new Scanner(System.in);
		
		String user1 = s.nextLine();	
		
		while(!user1.equalsIgnoreCase(jordan.name) && !user1.equalsIgnoreCase(kobe.name) && !user1.equalsIgnoreCase(lebron.name) && !user1.equalsIgnoreCase(steph.name)){
			System.err.println("Wrong player!");
			user1 = s.nextLine();
		}
		
		while(user1.equalsIgnoreCase(jordan.name) || user1.equalsIgnoreCase(kobe.name) || user1.equalsIgnoreCase(lebron.name) || user1.equalsIgnoreCase(steph.name)){
			break;
			
		}
		    String player1;
		    
     	    player1 = user1;
     	    
			m.blank();
			
			System.out.println("Player 1 you have chosen: "+ player1.toUpperCase());
			
		m.blank();
		
		m.selectTwo();
		
		m.blank();
		
		while(user1.equalsIgnoreCase(jordan.name)) {
			
			m.availablePlayers();
			
			m.blank();
			
			System.out.println(kobe.toString());
			
			m.blank();
			
			System.out.println(lebron.toString());
			
			m.blank();
			
			System.out.println(steph.toString());
			
			m.blank();
			
			break;
		}
		
       while(user1.equalsIgnoreCase(kobe.name)) {
			
			m.availablePlayers();
			
			m.blank();
			
			System.out.println(jordan.toString());
			
			m.blank();
			
			System.out.println(lebron.toString());
			
			m.blank();
			
			System.out.println(steph.toString());
			
			break;
		}
       
       while(user1.equalsIgnoreCase(lebron.name)) {
			
			m.availablePlayers();
			
			m.blank();
			
			System.out.println(jordan.toString());
			
			m.blank();
			
			System.out.println(kobe.toString());
			
			m.blank();
			
			System.out.println(steph.toString());
	
			
			break;
		}
       
       while(user1.equalsIgnoreCase(steph.name)) {
			
			m.availablePlayers();
			
			m.blank();
			
			System.out.println(jordan.toString());
			
			m.blank();
			
			System.out.println(kobe.toString());
			
			m.blank();
			
			System.out.println(lebron.toString());
			
			break;
		}
       
       String user2 = s.nextLine();	
		
		while(!user2.equalsIgnoreCase(jordan.name) && !user2.equalsIgnoreCase(kobe.name) && !user2.equalsIgnoreCase(lebron.name) && !user2.equalsIgnoreCase(steph.name)){
			System.err.println("Wrong player!");
			user2 = s.nextLine();
		}
		
		while(user2.equalsIgnoreCase(jordan.name) || user2.equalsIgnoreCase(kobe.name) || user2.equalsIgnoreCase(lebron.name) || user2.equalsIgnoreCase(steph.name)){
			break;
			
		}
		String player2;
			player2 = user2;
			
			m.blank();
			
			System.out.println("Player 2 you have chosen: "+ player2.toUpperCase());
			
		m.blank();
		
		m.showMoves();
       
		System.out.println("Player 1 go first!");
		
		String playerOneFirstMove;
		
		playerOneFirstMove = s.nextLine();
		
		while(!playerOneFirstMove.equalsIgnoreCase(m.moves[0]) && !playerOneFirstMove.equalsIgnoreCase(m.moves[1]) && 
			!playerOneFirstMove.equalsIgnoreCase(m.moves[2]) && !playerOneFirstMove.equalsIgnoreCase(m.moves[3]) &&
			!playerOneFirstMove.equalsIgnoreCase(m.moves[4])) {
			
			System.err.println("Wrong move!");
			
			playerOneFirstMove = s.nextLine();

		}
		
		while(playerOneFirstMove.equalsIgnoreCase(m.moves[0])) {
			
            m.playerOneScore = m.playerOneScore + 3;
			System.out.println("Beautiful "+ m.moves[0] + " by "+ player1.toUpperCase());
			m.showScore();
			break;
		}
		
		
	
       
	
	}


}
