package edunova;

import javax.swing.JOptionPane;

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
		System.out.println("3.Mijenjanje vlasnika");
		System.out.println("4.Brisanje vlasnika");
		System.out.println("5.Izlaz iz izbornika");
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
			CRUDVlasnik.create(new Vlasnik(1,
					Pomocno.ucitajString("Unesite ime:"),
					Pomocno.ucitajString("Unesite prezime:"),
					Pomocno.ucitajString("Ostavite svoj kontakt(telefon/mail):"),
					Pomocno.ucitajString("Unesi OIB"), 
					Pomocno.ucitajString("Unesite svoj spol:")));
			izbornik();
		case 3:
			promjeniVlasnika();
			izbornik();
			break;
		case 4:
			obrisiVlasnika();
			izbornik();
			break;
		default:
			break;
		}
		
	}





	private void obrisiVlasnika() {
		Vlasnik vlasnik = odaberiVlasnika("Unesi redni broj osobe koju želite brisati");
		if(vlasnik==null) {
			JOptionPane.showMessageDialog(null, "Neispravan redni broj");
			return;
		}
		CRUDVlasnik.delete(vlasnik.getSifra());
	}
		
	
	

	private void promjeniVlasnika() {
		Vlasnik vlasnik = odaberiVlasnika("Unesi redni broj osobe koju želite mjenjati");
		if(vlasnik==null) {
			JOptionPane.showMessageDialog(null, "Neispravan redni broj");
			return;
		}
		vlasnik.setIme(Pomocno.ucitajString("Promjeni ime", vlasnik.getIme()));
		vlasnik.setPrezime(Pomocno.ucitajString("Promjeni prezime", vlasnik.getPrezime()));
		vlasnik.setKontakt(Pomocno.ucitajString("Promjeni kontakt", vlasnik.getKontakt()));
		vlasnik.setOib(Pomocno.ucitajString("Promjeni OIB",vlasnik.getOib()));
		vlasnik.setSpol(Pomocno.ucitajString("Promjeni spol", vlasnik.getSpol()));
		CRUDVlasnik.update(vlasnik);
	}
		
	private Vlasnik odaberiVlasnika(String poruka) {
		izlistajVlasnike();
		int redniBroj=Pomocno.ucitajBroj(poruka);
		return CRUDVlasnik.getOsoba(redniBroj);
		
	}

	

	/*private void unesiVlasnika() {
		Vlasnik vlasnik = new Vlasnik();
		vlasnik.setIme("Unesite ime:");
		vlasnik.setPrezime("Unesite prezime:");
		vlasnik.setKontakt("Ostavite svoj kontakt(telefon/mail)");
		vlasnik.setOib("Unesite svoj OIB:");
		vlasnik.setSpol("Unesite svoj spol:");
		
		
		
	}
*/




	private void izlistajVlasnike() {
		CRUDVlasnik.read().forEach(vlasnik->System.out.println(vlasnik));
		
	}





	public static void main(String[] args) {
		new Start();
	}
}
