package Game;

public class Interface {
	static void InterfaceP1(int player_hp, int total_dmg, int pot, int rooms_visited, boolean shield, boolean sword, String name) {
		System.out.println("     Nome do jogador: " + name);
		System.out.println("---------------------------------------");
		System.out.println("|Sua vida é: " + player_hp + "                       |");
		if (total_dmg > 9) {
			System.out.println("|Você dá um total de: " + total_dmg + " de dano      |");
		}
		if (total_dmg < 10) {
			System.out.println("|Você dá um total de: " + total_dmg + " de dano       |");
		}
		System.out.println("|Você tem: " + pot + " poções                   |");
		if (shield) {
			System.out.println("|Você possui um escudo                |");
		}
		if (shield == false) {
			System.out.println("|Você não tem um escudo               |");
		}
		if (sword) {
			System.out.println("|Você possui uma espada               |");
		}
		if (sword == false) {
			System.out.println("|Você não tem uma espada              |");
		}
		System.out.println("|                                     |");
		if (rooms_visited > 9) {
			System.out.println("|Você percorreu: " + rooms_visited + " salas             |");
		}
		if (rooms_visited < 10) {
			System.out.println("|Você percorreu: " + rooms_visited + " salas              |");
		}		
		System.out.println("---------------------------------------");
		System.out.println();
	}
}
