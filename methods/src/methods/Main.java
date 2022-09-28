package methods;

public class Main {

	public static void main(String[] args) {
		sayıBulmaca ();

	}

	public static void sayıBulmaca () {
		int [] sayılar = new int [] {1,2,5,7,9,0};
		int aranacak = 6;
		
		boolean varMi = false;
		for (int sayı :sayılar) { 
			if (sayı ==aranacak) {
				varMi = true;
				break;
			}
		}
		      String mesaj = "";
		if(varMi) {
			mesaj = "sayı mevcuttur"+aranacak;
			mesajVer ("sayı mevcuttur"+aranacak);
		}else {
			mesajVer("sayı mevcut değildir"+aranacak);
		}
		
		
		
		
	}
          public static void mesajVer(String mesaj) {
        	  System.out.println(mesaj);
          }

}
