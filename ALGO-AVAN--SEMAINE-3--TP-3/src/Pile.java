
public class Pile {

	private int tailleMax;
	private Cellule[] contenu;
	private int sommet;
	
	Pile(int taille){
		sommet = -1;
		tailleMax = taille;
		contenu = new Cellule[taille];
	}
	
	Pile(){
		sommet = -1;
		contenu = new Cellule[tailleMax];
	}
	
	public boolean isEmpty(){
		return sommet ==-1;
	}
	
	public boolean estPleine(){
		return sommet+1==tailleMax;
	}
	
	public boolean push(Cellule c){
		if(estPleine()) return false;
		contenu[++sommet] = c;
		return true;
	}
	
	public Cellule pop(){
		return isEmpty()?null:contenu[sommet--];
	}
	
	public Cellule sommet(){
		return sommet==-1?null:contenu[sommet];
	}
}
