import java.util.Stack;

public class Parcours {
	
	
	public static void main(String[] args) {
		Labyrinthe l = new Labyrinthe();
		//Pile p = new Pile();
		Stack<Cellule> p = new Stack<Cellule>();
		
		Cellule depart = new Cellule(1,1);
		Cellule arrivee = new Cellule(l.n()-1,l.n()-2);
		
		p.push(depart);
		l.poserMarque(depart.getX(),depart.getY());
		boolean trouve = false;
		while(!p.isEmpty()&&trouve!=true){
			Cellule c = p.pop();
			l.poserMarqueRetour(c.getX(), c.getY());
			if(c.getX()==arrivee.getX() && c.getY()==arrivee.getY()){
				System.out.println("Sortie trouvee !!");
				System.out.println("Voici la Pile : " + p);
				trouve = true;
			}
			else {
				Cellule haut = new Cellule(c.getX(),c.getY()-1);
				Cellule bas = new Cellule(c.getX(),c.getY()+1);
				Cellule droite = new Cellule(c.getX()-1,c.getY());
				Cellule gauche = new Cellule(c.getX()+1,c.getY());
				if(!l.estMur(haut.getX(),haut.getY())&&!l.estMarque(haut.getX(), haut.getY())
						&& haut.getX()!=l.n() && haut.getY()!=l.n()){
					l.poserMarque(haut.getX(), haut.getY());
					p.push(haut);
				}
				if(!l.estMur(bas.getX(),bas.getY())&&!l.estMarque(bas.getX(), bas.getY())
						&& bas.getX()!=l.n() && bas.getY()!=l.n()){
					l.poserMarque(bas.getX(), bas.getY());
					p.push(bas);
				}
				if(!l.estMur(droite.getX(),droite.getY())&&!l.estMarque(droite.getX(), droite.getY())
						&& droite.getX()!=l.n() && droite.getY()!=l.n()){
					l.poserMarque(droite.getX(), droite.getY());
					p.push(droite);
				}
				if(!l.estMur(gauche.getX(),gauche.getY())&&!l.estMarque(gauche.getX(), gauche.getY())
						&& gauche.getX()!=l.n() && gauche.getY()!=l.n()){
					l.poserMarque(gauche.getX(), gauche.getY());
					p.push(gauche);
				}
			}
			try {
				Thread.sleep(10) ;
				}
			catch(InterruptedException e){}
		}
		if(p.isEmpty()){
			System.out.println("Il n’y a pas de chemin reliant l’entrée à la sortie");
		}
		
	}

}
