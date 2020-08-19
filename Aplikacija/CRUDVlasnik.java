package edunova;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDVlasnik {
	
	static void create(Vlasnik vlasnik) {
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement(
					"insert into vlasnik" 
							+ " (ime,prezime,kontakt,oib,spol) "
							+ " values (?,?,?,?,?)");
			izraz.setString(1, vlasnik.getIme());
			izraz.setString(2, vlasnik.getPrezime());
			izraz.setString(3, vlasnik.getKontakt());
			izraz.setString(4, vlasnik.getOib());
			izraz.setString(5, vlasnik.getSpol());
			
			izraz.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
		
	public static List<Vlasnik> read() {
		List<Vlasnik> vlasnici = new ArrayList<>();
		
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement(
					"select * from vlasnik order by prezime");
			ResultSet rs = izraz.executeQuery();
			while(rs.next()) {
				vlasnici.add(new Vlasnik(rs.getInt("sifra"), 
						rs.getString("ime"),
						rs.getString("prezime"), 
						rs.getString("kontakt"), 
						rs.getString("oib"),
						rs.getString("spol"))									
						);
			}
			rs.close();
			izraz.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return vlasnici;
		
	
	}
	static void update(Vlasnik vlasnik) {
		//azuriranje baze
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement(
					"update vlasnik set "
					+ " ime=?, "
					+ " prezime=?, "
					+ " kontakt=?, "
					+ " oib=? "
					+ " spol=? "
					+ " where sifra=? ");
			izraz.setString(1, vlasnik.getIme());
			izraz.setString(2, vlasnik.getPrezime());
			izraz.setString(3, vlasnik.getKontakt());
			izraz.setString(4, vlasnik.getOib());
			izraz.setString(5, vlasnik.getSpol());
			izraz.setInt(6,    vlasnik.getSifra());
			
			izraz.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	static void delete(int sifra) {
		//brisanje baze
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement(
					"delete from vlasnik  "
					+ " where sifra=? ");
			
			izraz.setInt(1, sifra);
			
			izraz.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	public static Vlasnik getOsoba(int redniBroj) {
		int rb=0;
		for(Vlasnik o : read()) {
			if(++rb==redniBroj) {
				return o;
			}
		}
		return null;
	}
}
