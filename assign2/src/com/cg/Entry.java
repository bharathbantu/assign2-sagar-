package com.cg;

public class Entry {
		public static void main(String[] args)
		{   
			String[] playernames={"Amit","Vinayak", "Mahidar","Nikhil","Saurabh"};
			String[] gamenames={"Cricket","football","volley ball","chess","carrom","Cricket","football","volley ball","chess","carrom"};
			Player [] p=new Player[5];
			Game[] game= new Game[10];
			int count=0;
			for(int i=0;i<5;i++)
			{
				p[i]=new Player();
				p[i].setName(playernames[i]);
				System.out.println("name is "+p[i].getName());
				
					for(int j=count;j<count+2;j++)
					{
						game[j]=new Game();
						game[j].setName(gamenames[j]);
						System.out.println("game name is "+game[j].getName());		
					}
					count=count+2;
					System.out.println("============================");
			}	
			
		}
	}

