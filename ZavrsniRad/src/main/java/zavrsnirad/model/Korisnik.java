/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.model;

/**
 *
 * @author mirza
 */
public class Korisnik {
        private int id;
	private String ime;
	private String prezime;
	private String email;
	private String password;
        private String mobitel;

    public String getMobitel() {
        return mobitel;
    }

    public void setMobitel(String mobitel) {
        this.mobitel = mobitel;
    }

    public String getURL_potpisa() {
        return URL_potpisa;
    }

    public void setURL_potpisa(String URL_potpisa) {
        this.URL_potpisa = URL_potpisa;
    }
        //iako bih ja potpis nekako zamaskirao ... u bazi ili ...?
        private String URL_potpisa;

    public Korisnik() {
    }

    public Korisnik(int id, String ime, String prezime, String email, String password, String mobitel, String URL_potpisa) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.password = password;
        this.mobitel = mobitel;
        this.URL_potpisa = URL_potpisa;
    }
		
	
  
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        
}