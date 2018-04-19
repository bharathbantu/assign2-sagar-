package com.cg;

public class Entry2 {
	public static void main(String[] args) {
		String[] playernames={"Amit","Vinayak", "Mahidar","Nikhil","Saurabh"};
		String[] gamenames1={"Cricket","football"};
		String[] gamenames2={"volley ball","chess","carrom"};
		String[] gamenames3={"Cricket","football","volley ball","TT"};
		String[] gamenames4={"chess","carrom"};
		String[] gamenames5={"videogame","tt"};
		Player p[]=new Player[5];
		Game game[]=new Game[5];
		
	//player1
		p[0]=new Player();
		p[0].setName(playernames[0]);
		System.out.println("name is "+p[0].getName());
		
			for(int j=0;j<gamenames1.length;j++)
			{
				game[j]=new Game();
				game[j].setName(gamenames1[j]);
				System.out.println("game name is "+game[j].getName());					
			}
		
	//player2
			
			p[1]=new Player();
			p[1].setName(playernames[1]);
			System.out.println("name is "+p[1].getName());
			
				for(int j=0;j<gamenames2.length;j++)
				{
					game[j]=new Game();
					game[j].setName(gamenames2[j]);
					System.out.println("game name is "+game[j].getName());					
				}
	
	//player3
				
				p[2]=new Player();
				p[2].setName(playernames[2]);
				System.out.println("name is "+p[2].getName());
				
					for(int j=0;j<gamenames3.length;j++)
					{
						game[j]=new Game();
						game[j].setName(gamenames3[j]);
						System.out.println("game name is "+game[j].getName());					
					}
					
	//player4
					
					p[3]=new Player();
					p[3].setName(playernames[3]);
					System.out.println("name is "+p[3].getName());
					
						for(int j=0;j<gamenames4.length;j++)
						{
							game[j]=new Game();
							game[j].setName(gamenames4[j]);
							System.out.println("game name is "+game[j].getName());					
						}
			
	//player5
						p[4]=new Player();
						p[4].setName(playernames[4]);
						System.out.println("name is "+p[4].getName());
						
							for(int j=0;j<gamenames5.length;j++)
							{
								game[j]=new Game();
								game[j].setName(gamenames5[j]);
								System.out.println("game name is "+game[j].getName());					
							}
		}
		}



