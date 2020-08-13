package edunova;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDVlasnik {
	private static void create(Vlasnik vlasnik) {
		//unosenje baze
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
	private static void update(Vlasnik vlasnik) {
		//azuriranje baze
	}
	private static void delete(int sifra) {
		//brisanje baze
	}
}
