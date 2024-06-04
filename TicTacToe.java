package Game;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char player='x';
		char board[][]=new char[3][3];
		int count=0;
		for(int i=0;i<board.length;i++) {
			  for(int j=0;j<board.length;j++) {
				board[i][j]=' ';
				}
			}
		
		boolean gameover= false;
		while(!gameover) {
			print(board);
			System.out.println("Enter the row number");
			int i=s.nextInt();
			System.out.println("Enter the col number");
			int j=s.nextInt();
			if(count==board.length*board[0].length) {
				System.out.println("Match is draw");
				return;
			}
			else if(board[i][j]==' ') {
				++count;
				board[i][j]=player;
				gameover=Is_Won(board,player);
				if(gameover) {
					System.out.println("Player  "+player+" has  WON");
				}
				else {
					player=(player=='x')?'o':'x';
				}
			}
			else {
				System.out.println("Enter a valid Row and Col");
			}
			
		}

	}
	static boolean Is_Won(char board[][],char player) {
		// Checking row
		  for(int i=0;i<board.length;i++) {
			 if(board[i][0]==player && board[i][1]==player &&board[i][2]==player)
				return true;
			}
		  // checking column
		  for(int i=0;i<board.length;i++) {
			  if(board[0][i]==player && board[1][i]==player && board[2][i]==player)
				  return true;
		  }
		  // checking  Right diagnol
		  if(board[0][0]==player&& board[1][1]==player && board[2][2]==player) {
			  return true;
		  }
		  // checking left diagnol
		  if(board[0][2]==player&& board[1][1]==player && board[2][0]==player) {
			  return true;
		  }
		return false;
	}
	static void print(char board[][]) {
		for(int i=0;i<board.length;i++) {
			  for(int j=0;j<board.length;j++) {
				   System.out.print(board[i][j]+" |");
				}
			  System.out.println();
			}
	}
}
