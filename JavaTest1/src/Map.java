import java.util.Arrays;
import java.util.Random;

public class Map extends GameObj {
	
	private GameObj map [][];
	private GameObj playerPos;
	private GameObj objPos;
	private int x;
	private int y;
	private int xObj;
	private int yObj;
	private boolean gameWon;
	private int mapLimit;
	
	
	public Map(int width, int length) {
		map = new GameObj[width][length];
		this.mapLimit = width - 1;
		
	}
	
	
	void addPlayer(Player player, int place) {
		Random Rand = new Random();
		int x = (Rand.nextInt(place));
		int y = (Rand.nextInt(place));
		map[x][y] = player;
		this.playerPos = map[x][y];
		this.x = x;
		this.y = y;
		this.gameWon=false;
		
		
//		System.out.println(playerPos);
//		
	}
	public boolean isGameWon() {
		return gameWon;
	}


	public void setGameWon(boolean gameWon) {
		this.gameWon = gameWon;
	}


	void addObj(Objective obj, int place) {
		Random Rand = new Random();
		int x1 = (Rand.nextInt(place));
		int y1 = (Rand.nextInt(place));
		if(x1==x & y1 == y) {
			addObj(obj, y1);
					}
		else
			map[x1][y1] = obj;
			this.objPos = map[x1][y1];
			this.xObj = x1;
			this.yObj = y1;
			
			
	}
	
	void showMap() {
		for (int i = 0 ; i < map.length ; i++) {
			
			for ( int j = 0 ; j<map[i].length; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	 GameObj[][] move(String direction) {
		
		String dir = direction;
		
		
		if (dir.equals("North")) {
			this.map[x][y] = null;
			if (x==0) {
				System.out.println("Cant Go that Way!");
				return map;
						}
			else
			this.map[x-1][y] = playerPos;
//			this.playerPos = map[x][y];
			this.x = this.x -1;
			System.out.println("Is that map working properly?");
			return map;
			
			
				
//			if(x==xObj & y==yObj) {
//				this.gameWon=true;
//				System.out.println("You win");
//				System.out.println("You won the best game ever");
//				return map;
//			}
		}
		if (dir.equals("East")) {
			this.map[x][y] = null;
			if (y==mapLimit) {
				System.out.println("Cant Go that Way!");
				return map;
			}
			else
			this.map[x][y+1] = playerPos;
//			this.playerPos = map[x][y];
			this.y = this.y +1;
			System.out.println("Be pretty awkward if the map stop wroking huh?");
			return map;
						
			
//			if(x==xObj & y==yObj) {
//				this.gameWon=true;
//				System.out.println("You win");
//				System.out.println("You won the best game ever");
//			
//			}
		}
		if (dir.equals("South")) {
			this.map[x][y] = null;
			if (x==mapLimit) {
				System.out.println("Cant Go that Way!");
				return map;
			}
			else
			this.map[x+1][y] = playerPos;
//			this.playerPos = map[x][y];
			this.x = this.x +1;
			System.out.println("Do you believe in life after love.... *hummm* Sorry just passing the time");
			return map;
			
//			if(x==xObj & y==yObj) {
//				this.gameWon=true;
//				System.out.println("You win");
//				System.out.println("You won the best game ever");
//			}
		}
		if (dir.equals("West")) {
			this.map[x][y] = null;
			if (y==0) {
				System.out.println("Cant Go that Way!");
				return map;
			}
			else
			this.map[x][y-1] = playerPos;
//			this.playerPos = map[x][y];
			this.y = this.y -1;
			return map;
			
			
//			if(x==xObj & y==yObj) {
//				this.gameWon=true;
//				System.out.println("You win");
//				System.out.println("You won the best game ever");
//			}
			
		}
		return map;
	}
	
	void checkWin() {
		
		if (x == xObj & y == yObj ) {
			this.gameWon=true;
			System.out.println("You win");
			System.out.println("You won the best game ever");
						
		}
	}
	
	void distToObj() {
		
		System.out.println("Distance to Objective: " + Math.hypot(x-xObj, y - yObj));
		
	}
	
	
	
			@Override
			public String toString() {
			return "Map [map=" + Arrays.toString(map) + "]";			
			}
}
			

	
		
		
			
	
		
	
	
//	@Override
//	public String toString() {
//		return "Map [map=" + Arrays.toString(map) + "]";
//	}
//}
