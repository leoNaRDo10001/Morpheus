
public class HelloWorld {

	public static void main(String[] args) {
		
		String Monat = "September";
		
		switch (Monat) {
		case "Januar": System.out.println("I Quartal");
		break;
		case "Februar": System.out.println("I Quartal");
		break;
		case "Maerz": System.out.println("I Quartal");
		break;
		
		case "April": System.out.println("II Quartal");
		break;
		case "Mai": System.out.println("II Quartal");
		break;
		case "juni": System.out.println("II Quartal");
		break;
		
		case "Juli": System.out.println("III Quartal");
		break;
		case "August": System.out.println("III Quartal");
		break;
		case "September": System.out.println("III Quartal");
		break;
		
		case "Oktober": System.out.println("IV Quartal");
		break;
		case "November": System.out.println("IV Quartal");
		break;
		case "Dezember": System.out.println("IV Quartal");
		break;
		
		
		default: System.out.println(Monat + " ist kein Monat");
		
		}
		
		
		

	}

}
