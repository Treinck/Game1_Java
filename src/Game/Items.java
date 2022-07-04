package Game;

import java.util.Random;

public class Items {
	
	static int sword1(int total_dmg) {
		total_dmg = 5;
		return total_dmg;
	}
	static int sword2(int total_dmg) {
		total_dmg = 9;
		return total_dmg;
	}
	static int sword3(int total_dmg) {
		total_dmg = 18;
		return total_dmg;
	}
	static int get_sword(int held_item) {
		Random rand = new Random();
		if (rand.nextInt(100) < 36) {  
    		held_item = 1;
		}else if (rand.nextInt(100) > 35 && rand.nextInt(100) < 98) { 
			held_item = 2;
		}else { 
			held_item = 3;
		}return held_item;
	}
}