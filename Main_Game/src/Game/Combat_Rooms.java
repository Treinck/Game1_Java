package Game;

import java.util.Random;
import java.util.Scanner;

public class Combat_Rooms {
	
	static void combat_room(int rooms_visited,int total_dmg, int player_hp, int pot,boolean  shield, String name ) { 
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in); 
			Random rand = new Random(); 
			System.out.println("Um inimigo apareceu!"); 
			System.out.println("O que você irá fazer?(a = atacar, c = correr, n = nada)");
			String comando = in.nextLine(); 
			if (comando.equals("a")) {
				int enemy_hp = rand.nextInt(80);
				if (enemy_hp < 31) {
					enemy_hp = 30;
				}
			int enemy_dmg = rand.nextInt(8);
			if (enemy_dmg < 4) {
				enemy_dmg = 3;
			}if (name.equalsIgnoreCase("Mirah")) { 
				System.out.println();
			    System.out.println("With fear of your hornyness, the enemy fleed."); 
			    System.out.println("You won."); 
			    System.exit(0); 
			}else {
			    	System.out.println("O combate se inicia!");  
			    	int crit_dmg = total_dmg * 2; 
			    	int stun_prev = 0; 
			    	int do_dmg = 1; 
			    	while(true) { 
			    		System.out.println("O que você irá fazer?(a = atacar, d = defender, c = cura)"); 
			    		comando = in.nextLine(); 
			    		System.out.println(); 
			    		if (comando.equals("a")) { 
			    			if (rand.nextInt(100) < 15) { 
			    				enemy_hp -= crit_dmg; 
			    				System.out.println("Você causou um ataque /CRÍTICO\\ !"); 
			    				System.out.println("Você causou: " + crit_dmg + " de CRÍTICO!"); 
			    				System.out.println("O inimigo tem: "+ enemy_hp + " de vida."); 
			    			}else { 
			    				enemy_hp -= total_dmg; 
			    				System.out.println("Você atacou!"); 
			    				System.out.println("Você causou: " + total_dmg + " de dano!"); 
			    				System.out.println("O inimigo tem: "+ enemy_hp + " de vida."); 
			    			} 
			    		}else if (comando.equals("d") && shield) { 
			    			System.out.println("Você se defendeu!"); 
			    			do_dmg = 0; 
			    			stun_prev += 1; 
			    			if (stun_prev > 3) { 
			    				do_dmg = 1; 
			    				System.out.println("O inimigo percebeu sua tática."); 
			    				System.out.println("A ação \"defender\" foi desabilitada."); 
			    			} 
			    		}else if (comando.equals("d") && shield == false) { 
			    			System.out.println("Você não tem um escudo."); 
			    			continue; 
			    		}else if (comando.equals("c") && pot > 0) { 
			    			player_hp += 9; 
			    			pot -= 1; 
			    			System.out.println("Você curou: 9 de vida."); 
			    			System.out.println("Sua vida é: " + player_hp + ".");
			    		}else { 
			    			System.out.println("Você está sem poções"); 
			    			continue; 
			    		} 
			    		if (enemy_hp == 0 || enemy_hp < 0) { 
			    			System.out.println("Você ganhou depois de passar por: " + rooms_visited +  " salas!!!"); 
			    			System.exit(0); 
			    		} 
			    		if (do_dmg == 1) { 
			    			player_hp -= enemy_dmg; 
			    			System.out.println("Você sofreu: " + enemy_dmg + " de dano."); 
			    			System.out.println("Sua vida é: " + player_hp + "."); 
			    		}
			    		if (do_dmg > 1) { 
			    			do_dmg --; 
			    			System.out.println("O inimigo irá atacar na próxima rodada."); 
			    		} 
			    		if (do_dmg == 0) { 
			    			do_dmg += 2; 
			    			System.out.println("O inimigo está atordoado."); 
			    		}
			    		if (player_hp == 0 || player_hp < 0) { 
			    			System.out.println("Você morreu depois de passar por: " + rooms_visited +  " salas."); 
			    			System.exit(0); 
			    		}
			    		System.out.println();
			    	} 
			    }
			 	}else if (comando.equals("c")) {
			 		System.out.println();
			 		System.out.println("Você correu e voltou a sala principal.");
			 		System.out.println();
			 	}else {
			 		System.out.println();
			 		System.out.println("Nada ocorreu....");
			 		System.out.println();
			 	}
	}    	
}