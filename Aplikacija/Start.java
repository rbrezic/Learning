package edunova;

public class Start {
	public Start() {
		izbornik();
		Baza.zatvoriVezu();
	}

	
	
	
	
	private void izbornik() {
		System.out.println("----------IZBORNIK----------");
		System.out.println("------ODABERITE OPCIJU------");
		System.out.println("1.Lista svih vlasnika");
		System.out.println("2.Unošenje novih vlasnika");
		System.out.println("3.Brisanje vlasnika");
		System.out.println("4.Izlaz iz izbornika");
		System.out.println("----------------------------");
		izvedi();
	}





	private void izvedi() {
		switch (Pomocno.ucitajBroj("---Odaberite opciju---")) {
		case 1:
			izlistajVlasnike();
			izbornik();
			break;
		case 2:
			unesiVlasnika();
			izbornik();
		default:
			System.out.println("Molimo unesite neki od ponuđenih brojeva");
			break;
		}
		
	}





	private void unesiVlasnika() {
		Vlasnik vlasnik = new Vlasnik();
		vlasnik.setIme("nesite ime:");
		vlasnik.setPrezime("Unesite prezime:");
		vlasnik.setKontakt("Ostavite svoj kontakt(telefon/mail)");
		vlasnik.setOib("Unesite svoj OIB:");
		vlasnik.setSpol("Unesite svoj spol:");
		
		
		
	}





	private void izlistajVlasnike() {
		CRUDVlasnik.read().forEach(vlasnik->System.out.println(vlasnik));
		
	}





	public static void main(String[] args) {
		new Start();
	}
}
