import java.util.Scanner;

public class TwoPlayerController {

	public static void main(String[] args) {
		TwoPlayerController controller = new TwoPlayerController();
		controller.go();
	}
	
	
	public void go() {
		IsolaBoard board = new IsolaBoard();
		IsolaTextView view = new IsolaTextView(board);
		BoardSpace current = BoardSpace.Player1;
		while(board.checkWinner() == BoardSpace.Available) {
			view.display();
			makeMove(current, board);
			if(current == BoardSpace.Player1)
				current = BoardSpace.Player2;
			else
				current = BoardSpace.Player1;
			System.out.println("Player " + board.checkWinner() + "won.");
		}
				
		
		
			}
			public void makeMove(BoardSpace current, IsolaBoard board) { 
				Scanner input = new Scanner(System.in);
				boolean moveMade = false;
				while(! moveMade){
					System.out.print("Enter the row numberfor your move: ");
					int row = input.nextInt();
					System.out.print("Enter the column number for your move: ");
					int col = input.nextInt();
					board.movePlayer(current, new BoardPosition(row, col));
					
		}
	}

}

		
		
		
		
	


