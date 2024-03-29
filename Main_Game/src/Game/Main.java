package Game;

import java.util.Random; 
import java.util.Scanner; 
 
public class Main {
	public static int total_dmg = 3; 
	public static int pot = 0; 
	public static int player_hp = 30;  
	public static int rooms_visited = 0;
	public static int held_item = 0;
	public static int food = 2;
	public static int food_timer = 0;
	public static int timer = 0;
	public static boolean sword = false;
	public static boolean shield = false; 
	
	public static void main(String[] args) { 
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in); 
		Random rand = new Random(); 
		System.out.println("Você começou o jogo. Insira seu nome: "); 
		String name = in.nextLine(); 
		System.out.println("Bem-vindo(a): "+ name); 
		
		while (true) { 
			System.out.println("Para onde deseja andar?(w, a, s, d):"); 
			System.out.println("Você também pode abrir a interface pressionando a tecla 'i':");
			String comando = in.nextLine();
			System.out.println(); 
			if (comando.equals("i")) {
				Interface.InterfaceP1(player_hp, total_dmg, pot, rooms_visited, food, shield, sword, name);
			}
			if (comando.equals("w")) { 
				if (timer == 10) { 
					System.out.println("Faça sua escolha:");
					System.out.println("Comer ou Matar?(a = comer, d = matar)");
					comando = in.nextLine();
					if (comando.equals("a")) {
						food = Item_Rooms.sala_comida(food);						
					}else if (comando.equals("d")) {
						Combat_Rooms.combat_room(rooms_visited, total_dmg, player_hp, pot, shield, name); 
					}
				}else {
					if (rand.nextInt(7) == 1) {
						rooms_visited ++;
						shield = Item_Rooms.sala_shield(shield);
					}else if (rand.nextInt(7) == 1) {
						rooms_visited ++;
						sword = Item_Rooms.sword_state(total_dmg, sword);
						held_item = Items.get_sword(held_item);
						total_dmg= Item_Rooms.sword_room(total_dmg, held_item, sword);
					}else if (rand.nextInt(7) == 1) {
						rooms_visited ++;
						player_hp = Item_Rooms.sala_vida(player_hp);
					}else if (rand.nextInt(7) == 1) {
						rooms_visited ++;
						pot = Item_Rooms.sala_pot(pot);
					}else {
						System.out.println("Você não encontrou nada.");
						System.out.println();
					}sword = Item_Rooms.sword_state(total_dmg, sword);
				}
			}else if (comando.equals("a")) { 
				if (timer == 10) { 
					System.out.println("Faça sua escolha:");
					System.out.println("Comer ou Matar?(a = comer, d = matar)");
					comando = in.nextLine();
					if (comando.equals("a")) {
						food = Item_Rooms.sala_comida(food);						
					}else if (comando.equals("d")) {
						Combat_Rooms.combat_room(rooms_visited, total_dmg, player_hp, pot, shield, name); 
					}
				}else {
					if (rand.nextInt(7) == 1) {
						rooms_visited ++;
						shield = Item_Rooms.sala_shield(shield);
					}else if (rand.nextInt(7) == 1) {
						rooms_visited ++;
						sword = Item_Rooms.sword_state(total_dmg, sword);
						held_item = Items.get_sword(held_item);
						total_dmg= Item_Rooms.sword_room(total_dmg, held_item, sword);
					}else if (rand.nextInt(7) == 1) {
						rooms_visited ++;
						player_hp = Item_Rooms.sala_vida(player_hp);
					}else if (rand.nextInt(7) == 1) {
						rooms_visited ++;
						pot = Item_Rooms.sala_pot(pot);
					}else {
						System.out.println("Você não encontrou nada.");
						System.out.println();
					}sword = Item_Rooms.sword_state(total_dmg, sword);
				}
			}else if (comando.equals("d")) { 
				if (timer == 10) { 
					System.out.println("Faça sua escolha:");
					System.out.println("Comer ou Matar?(a = comer, d = matar)");
					comando = in.nextLine();
					if (comando.equals("a")) {
						food = Item_Rooms.sala_comida(food);						
					}else if (comando.equals("d")) {
						Combat_Rooms.combat_room(rooms_visited, total_dmg, player_hp, pot, shield, name); 
					}
				}else {
					if (rand.nextInt(7) == 1) {
						rooms_visited ++;
						shield = Item_Rooms.sala_shield(shield);
					}else if (rand.nextInt(7) == 1) {
						rooms_visited ++;
						sword = Item_Rooms.sword_state(total_dmg, sword);
						held_item = Items.get_sword(held_item);
						total_dmg= Item_Rooms.sword_room(total_dmg, held_item, sword);
					}else if (rand.nextInt(7) == 1) {
						rooms_visited ++;
						player_hp = Item_Rooms.sala_vida(player_hp);
					}else if (rand.nextInt(7) == 1) {
						rooms_visited ++;
						pot = Item_Rooms.sala_pot(pot);
					}else {
						System.out.println("Você não encontrou nada.");
						System.out.println();
					}sword = Item_Rooms.sword_state(total_dmg, sword);
				}
			}else if (comando.equals("s")) { 
				System.out.println("Você deseja sair do jogo?(a = sim, d = não)");
				comando = in.nextLine();
				if (comando.equals("a")) {
					System.out.println("Você saiu da masmorra, o jogo acabou."); 
					System.exit(0); 
				}else {
					System.out.println("Você voltou para a sala principal.");
					System.out.println(); 
				}
			}
			if (food_timer > 8) {
				food_timer = Game_Sys.eat(food, food_timer, name);	
			}food_timer ++;
			 timer ++;
		}
	} 
}