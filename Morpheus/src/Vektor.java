
public class Vektor {
	int x;
	int y;
	int z;
	
	public Vektor add(Vektor a, Vektor b) {
		Vektor ret = new Vektor();
		ret.x = a.x + b.x;
		ret.y = a.y + b.y;
		ret.z = a.z + b.z;
		
		return ret;
	}

}
