package pirateVincentYannis.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pirateVincentYannis.business.Navire;
import pirateVincentYannis.business.Pirate;
import pirateVincentYannis.business.Weapon;
import pirateVincentYannis.service.PirateService;

public class PirateServiceImpl implements PirateService {

	public static List<Pirate> listePirate;

	public PirateServiceImpl() {
		listePirate = new ArrayList<>();
		Weapon w = new Weapon();
		listePirate.add(creerPirate("Jack Sparrow", new Navire("Black Pearl"), 0, w.getWeapon()));
		listePirate.add(creerPirate("Davy jones", new Navire("Hollandais Vollant"), 0, w.getWeapon()));
		listePirate.add(creerPirate("Barbe Noire", new Navire("Queen Anne's Revenge"), 0, w.getWeapon()));
		listePirate.add(creerPirate("Salazar", new Navire("Silent Mary"), 0, w.getWeapon()));
	}

	@Override
	public Pirate choosePirate() {
		System.out.println("Choose your Corsaire");
		Pirate monPirate = null;
		int i = 0;
		for (Pirate p : listePirate) {
			i++;
			System.out.println(i + " - " + p);
		}
		//Scanner sc = new Scanner(System.in);
		int monChoixDePirate = 3;//sc.nextInt();
		switch (monChoixDePirate) {
		case 1:
			monPirate = listePirate.get(monChoixDePirate);
			return monPirate;
		case 2:
			monPirate = listePirate.get(monChoixDePirate);
			return monPirate;
		case 3:
			monPirate = listePirate.get(monChoixDePirate);
			return monPirate;
		case 4:
			monPirate = listePirate.get(monChoixDePirate);
			return monPirate;
		default:
			return null;
		}
	}

	@Override
	public Pirate creerPirate(String name, Navire navire, long po, String arme) {
		Pirate pirate = new Pirate(name, navire, po, arme);
		return pirate;
	}

	@Override
	public long plunder() {
		return 100L;
	}

	@Override
	public Navire changeShip(Pirate pirate, Navire nameBoat) {
		pirate.setNavire(nameBoat);
		return pirate.getNavire();
	}
}
