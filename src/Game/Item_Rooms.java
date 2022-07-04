package Game;

import java.util.Random;
import java.util.Scanner;

public class Item_Rooms {
	
	public static boolean sword_state(int dano_total, boolean sword) {
		if (dano_total == 3 && sword == false) {
			sword = false;
			return sword;
		}else {
			sword = true;
			return sword;
		}
	}	 
	
	static int sword_room(int dano_total, int held_item, boolean sword){
			Scanner in = new Scanner(System.in); 
			Random rand = new Random(); 
			System.out.println("Você encontrou uma espada."); 
			System.out.println("O que irá fazer?(a = pegar, n = nada, d = trocar):"); 
			String comando = in.nextLine(); 
			System.out.println();
	
			if (comando.equals("a")) { 
		    	if (!sword){
		    		if  (held_item == 1) {
		    			System.out.println("Você obteve a \"Espada Enferrujada\".");
		    			dano_total = Items.sword1(dano_total);
		    		}if	(held_item == 2) {
		    			System.out.println("Você obteve a \"Espada Longa\"."); 
		    			dano_total = Items.sword2(dano_total);
		    		}if (held_item == 3) {
		    			System.out.println("Você obteve a \"Espada Encantada\"."); 
		    			dano_total = Items.sword3(dano_total);
		    		}
		    	}else {
		    	System.out.println("Você já possui espada.");
		    }
		    }if (comando.equals("d")) {
		    	int dmg_hold = dano_total;
		    	if  (held_item == 1) {
		    		System.out.println("Você percebeu que a Espada está Enferrujada.");
		    		dmg_hold = Items.sword1(dano_total);
		    	}if	(held_item == 2) {
		    		System.out.println("Você vê uma astuciosa Espada Longa."); 
		    		dmg_hold = Items.sword2(dano_total);
		    	}if (held_item == 3) {
		    		System.out.println("Você nota um forte brilho emanando da Espada."); 
		    		dmg_hold = Items.sword3(dano_total);
		    	}System.out.println("Ainda deseja trocar seu equipamento?(a = sim, d = não):");
		    	comando = in.nextLine();
		    	if (comando.equals("a")) {
		    		dano_total = dmg_hold;
		    	}System.out.println();
		    }
		    return dano_total;
	}
	
	static boolean sala_shield(boolean shield) {
			Scanner in = new Scanner(System.in);
			System.out.println("Você achou um escudo!"); 
			System.out.println("O que irá fazer?(a = pegar, n = nada):"); 
			String comando = in.nextLine(); 
			System.out.println(); 
			if (comando.equals("a") && shield == false){ 
		    	System.out.println("Você pegou o escudo."); 
		    	System.out.println();
		    	shield = true;
		    	return shield;
			}else if(comando.equals("a") && shield){
		    	System.out.println("Você já tem um escudo.");
		    	System.out.println();
		    	return shield;
			}else { 
		    	System.out.println("Você ignorou o escudo.");
		    	System.out.println();
		    	return shield;
			} 
	}
	
	static int sala_pot(int pot) {
		Scanner in = new Scanner(System.in);
		System.out.println("Você achou uma poção de vida!"); 
		System.out.println("O que irá fazer?(a = pegar, n = nada):"); 
		String comando = in.nextLine(); 
		System.out.println();
		if (comando.equals("a")) {
			System.out.println("Você pegou a poção!");
			pot ++;
			return pot;
		}else {
			System.out.println("Você ignorou a poção.");
			return pot;
		}
	}
	
	static int sala_vida(int vida_p) {
		Scanner in = new Scanner(System.in);
		System.out.println("Você achou um Container de Coração!"); 
		System.out.println("O que irá fazer?(a = pegar, n = nada)"); 
		String comando = in.nextLine(); 
		System.out.println();
		if (comando.equals("a")) {
			System.out.println("Você pegou o Coração!");
			System.out.println("Vida +5!");
			System.out.println();
			vida_p += 5;
			return vida_p;
		}else {
			System.out.println("Você ignorou o Coração.");
			System.out.println();
			return vida_p;
		}
	}
}