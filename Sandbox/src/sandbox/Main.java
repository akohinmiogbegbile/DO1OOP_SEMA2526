package sandbox;

public class Main {

	public static void main(String[] args) {
		Team p1 = new Team();
		p1.playerName = "Salah";
		p1.playerHeight =1.7;
		p1.playerNo = 11;
		p1.isFirstTeam  = true;
		p1.isFit = true;
		p1.playerPosition = "RWF";
		
		Team p2 = new Team();
		p2.playerName = "Virgil";
		p2.playerHeight =2.0;
		p2.playerNo = 4;
		p2.isFirstTeam  = true;
		p2.isFit = true;
		p2.playerPosition = "CB";
		
		Team p3 = new Team();
		p3.playerName = "Alison";
		p3.playerHeight =2.0;
		p3.playerNo = 1;
		p3.isFirstTeam  = true;
		p3.isFit = false;
		p3.playerPosition = "GKP";
		
		Team p4 = new Team();
		p4.playerName = "Isak";
		p4.playerHeight =2.1;
		p4.playerNo = 9;
		p4.isFirstTeam  = true;
		p4.isFit = true;
		p4.playerPosition = "CF";
		
		Team p5 = new Team();
		p5.playerName = "Ekitike";
		p5.playerHeight =2.3;
		p5.playerNo = 22;
		p5.isFirstTeam  = true;
		p5.isFit = false;
		p5.playerPosition = "CF/LWF";
		
		
		
		System.out.println(p5.playerName + " " + p5.playerNo + " " + p5.isFit);

	}

}
