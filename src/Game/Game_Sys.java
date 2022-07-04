package Game;

import java.util.Random;
import java.util.Scanner;

public class Game_Sys {
	static int eat(int food, int food_timer, String name){
		Scanner in = new Scanner(System.in);
		if (food_timer > 8 && food_timer < 13) {
			System.out.println("Sua barriga começa a roncar...");
			System.out.println("Deseja comer?(a = sim, d = não)");
			String comando = in.nextLine();
			System.out.println();
			if (comando.equals("a")) {
				System.out.println("Você comeu, sua fome foi saciada!");
				System.out.println();
				food --;
				food_timer = 0;
			}else {
				System.out.println("Sua barriga ronca mais...");
				food_timer ++;
				System.out.println();
			}
		}if (food_timer > 13){
			System.out.println("Você precisa comer AGORA!");
			System.out.println("Você irá comer?(a = sim, d = não)");
			String comando = in.nextLine();
			System.out.println();
			if (comando.equals("a")) {
				System.out.println("Você sente como se essa fosse a melhor refeição de toda sua vida!");
				System.out.println();
				food --;
				food_timer = 0;
			}else {
				System.out.println("Sua barriga ronca mais e mais...");
				System.out.println("Devido a fome intensa, seu corpo frágil colapsou");
				System.out.println("na masmorra...");
				System.out.println();
				System.out.println("Após algumas horas desmaiado, monstros acham o seu corpo");
				System.out.println("sem vida, maravilhados pelo achado, eles devoram");
				System.out.println("pedaço por pedaço do seu cadáver, você acorda no meio,");
				System.out.println("mas sem forças para resistir, " + name + " morre pateticamente.");
				System.out.println();
				System.out.println("O jogo acabou.");
				System.exit(0);
			}
		}		
		return food_timer;
	}
	
	static int get_hungry(int food_timer) {
		Random rand = new Random();
		if (rand.nextInt(100) < 51) {
			food_timer++;
			return food_timer;
		}else {
			return food_timer;
		}
		
	}
}
