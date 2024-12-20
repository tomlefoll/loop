package While;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tableau = {10, 20, 30, 40, 50};
		int i = 0;
		System.out.println("bienvenu");
		//utilisation de la boucle while pour itérer sur le tableau 
		while(i< tableau.length) {
			System.out.println("element a l'index " + i + ": " + tableau[i]);
			i++;//incrementation de l'index
		}
System.out.println("au revoir a bientot ");
	}

}
