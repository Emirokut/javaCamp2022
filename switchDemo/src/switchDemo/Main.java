package switchDemo;

public class Main {

	public static void main(String[] args) {

		char grade = 'G';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;

		case 'B':
			System.out.println("çok güzel : geçtiniz");

			break;

		case 'C':

			System.out.println("iyi : geçtiniz");
			break;

		case 'D':
			System.out.println("eh işte : geçtin");
			break;
		case 'F':
			System.out.println("kaldın ezik");
			break;

		default:
			System.out.println("geçersiz not girdiniz");
		}

	}

}
