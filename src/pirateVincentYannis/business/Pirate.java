package pirateVincentYannis.business;

public class Pirate {

	String name;
	Navire navire;
	long po;
	String weapon;
	
	public Pirate(String name, Navire navire, long po, String arme) {
		super();
		this.name = name;
		this.navire = navire;
		this.po = po;
		this.weapon = arme;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Navire getNavire() {
		return navire;
	}

	public void setNavire(Navire navire) {
		this.navire = navire;
	}

	public long getPo() {
		return po;
	}

	public void setPo(long po) {
		this.po = po;
	}

	public String getArme() {
		return weapon;
	}

	public void setArme(String arme) {
		this.weapon = arme;
	}

	@Override
	public String toString() {
		return "Pirate [name=" + name + ", navire=" + navire + ", po=" + po + ", arme=" + weapon + "]";
	}
	
	
	
}
