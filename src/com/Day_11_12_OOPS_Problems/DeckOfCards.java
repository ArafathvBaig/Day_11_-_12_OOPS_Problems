package com.Day_11_12_OOPS_Problems;

public class DeckOfCards {
	public static void main(String[] args) {
		int deck[] = new int[52];
		String playersCards[][] = new String[9][4];
		int player1[] = new int[9];
		int player2[] = new int[9];
		int player3[] = new int[9];
		int player4[] = new int[9];
		int i;
		int j=0;
		int index;
		int temp;
		String suit;
		String rank;
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		// Initialize cards
		for (i = 0; i < deck.length; i++) 
		{
			deck[i] = i;
		}

		// Shuffle the cards
		for (i = 0; i < deck.length; i++) 
		{
			index = (int) (Math.random() * deck.length);
			temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}

		// Display all the cards
		for (i = 0; i < deck.length; i++) 
		{
			suit = suits[deck[i] / 13];
			rank = ranks[deck[i] % 13];
			System.out.println(rank + " of " + suit);
		}
		
		//Dealing 9 Cards each, to 4 players
		for (i=0; i < 32; i++)
		{
			player1[j] = deck[i];
			i++;
			player2[j] = deck[i];
			i++;
			player3[j] = deck[i];	
			i++;
			player4[j] = deck[i];
			j++;
		}
		/*
		for (i=0; i < 9; i++)
		{
			suit = suits[player1[i] / 13];
			rank = ranks[player1[i] % 13];
			System.out.println("Player 1 Cards: "+rank + " of " + suit);
		}
		for (i=0; i < 9; i++)
		{
			suit = suits[player2[i] / 13];
			rank = ranks[player2[i] % 13];
			System.out.println("Player 2 Cards: "+rank + " of " + suit);
		}
		for (i=0; i < 9; i++)
		{
			suit = suits[player3[i] / 13];
			rank = ranks[player3[i] % 13];
			System.out.println("Player 3 Cards: "+rank + " of " + suit);
		}
		for (i=0; i < 9; i++)
		{
			suit = suits[player4[i] / 13];
			rank = ranks[player4[i] % 13];
			System.out.println("Player 4 Cards: "+rank + " of " + suit);
		}
		*/
		
		//Storing All Players All Cards Into a 2D Array
		for(i=0; i<9;i++)
        {      
			for (j = 0; j < 4; j++) 
			{
				suit = suits[player1[i] / 13];
				rank = ranks[player1[i] % 13];
				playersCards[i][j] = suit.concat(" of ").concat(rank);
				j++;
				suit = suits[player2[i] / 13];
				rank = ranks[player2[i] % 13];
				playersCards[i][j] = suit.concat(" of ").concat(rank);
				j++;
				suit = suits[player3[i] / 13];
				rank = ranks[player3[i] % 13];
				playersCards[i][j] = suit.concat(" of ").concat(rank);
				j++;
				suit = suits[player4[i] / 13];
				rank = ranks[player4[i] % 13];
				playersCards[i][j] = suit.concat(" of ").concat(rank);
			}
        }
		
		System.out.print("\nPlayers Cards : \n");
        for(i=0; i<9;i++)
         {            
            for(j=0; j<4;j++)
            {
            	System.out.print(playersCards[i][j]+" ");
			}
			System.out.println();
         }
	}
}


















