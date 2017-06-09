package pirateVincentYannis.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Weapon {
	
	private List<String> listWeapons = new ArrayList<>();
	
	public Weapon(){
		super();
		listWeapons.add("Pistol");
		listWeapons.add("Knife");
		listWeapons.add("Sword");
		listWeapons.add("LongRifle");
	}
	
	public String getWeapon(){
		String weapon;
		Random r = new Random();
		weapon = listWeapons.get(r.nextInt(3));
		return weapon;
	}
	
	
}
