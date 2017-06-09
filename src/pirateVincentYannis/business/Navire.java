package pirateVincentYannis.business;

public class Navire {

	String name;
	int nbCanon;
	String typeBatiment;
	int nbSail;
	int nbCrew;
	boolean anchor;
	
	public Navire(String name){
		super();
		this.name = name;
	}
	
	public Navire(String name, int nbCanon, String typeBatiment, int nbSail, int nbCrew, boolean anchor) {
		super();
		this.name = name;
		this.nbCanon = nbCanon;
		this.typeBatiment = typeBatiment;
		this.nbSail = nbSail;
		this.nbCrew = nbCrew;
		this.anchor = anchor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNbCanon() {
		return nbCanon;
	}

	public void setNbCanon(int nbCanon) {
		this.nbCanon = nbCanon;
	}

	public String getTypeBatiment() {
		return typeBatiment;
	}

	public void setTypeBatiment(String typeBatiment) {
		this.typeBatiment = typeBatiment;
	}

	public int getNbSail() {
		return nbSail;
	}

	public void setNbSail(int nbSail) {
		this.nbSail = nbSail;
	}

	public int getNbCrew() {
		return nbCrew;
	}

	public void setNbCrew(int nbCrew) {
		this.nbCrew = nbCrew;
	}

	public boolean isAnchor() {
		return anchor;
	}

	public void setAnchor(boolean anchor) {
		this.anchor = anchor;
	}

	@Override
	public String toString() {
		return "Navire [name=" + name + ", nbCanon=" + nbCanon + ", typeBatiment=" + typeBatiment + ", nbSail=" + nbSail
				+ ", nbCrew=" + nbCrew + ", anchor=" + anchor + "]";
	}
	
}
