package setexample;


	public class Assignment4 {

		public static void main(String[] args) {
			Countrys countries = new Countrys();
			countries.saveCountrysNames("India");
			countries.saveCountrysNames("USA");
			countries.saveCountrysNames("Pakistan");
			countries.saveCountrysNames("Bangladesh");
			countries.saveCountrysNames("China");

			System.out.println("China: " + countries.getCountry("China"));
			System.out.println("Japan: " + countries.getCountry("Japan"));
		}

	}



