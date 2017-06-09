package pirateVincentYannis.service;

import pirateVincentYannis.business.Navire;
import pirateVincentYannis.business.Pirate;

public interface PirateService {

	Pirate creerPirate(String name, Navire navire, long po, String arme);
	
	long plunder();
	
	Navire changeShip(Pirate pirate, Navire nameBoat);
	
	Pirate choosePirate();
}
