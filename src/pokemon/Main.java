package pokemon;

public class Main {

	public static void main(String[] args) {
		
		Pokemon0 p1 = new Pokemon0("DJ Khaled");
		Pokemon0 p2 = new Pokemon0("Carlos Ghosn");
		p1.log(p1.toString());
		p2.log(p2.toString());
		p1.attaquer(p2);
		p2.log(p2.toString());

	}

}
