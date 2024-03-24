package view;

import model.Musica;
import model.Playlist;

public class Principal {

	public static void main(String[] args) {
		Musica m1 = new Musica();
		m1.setNome("Purple Rain");
		m1.setAutor("Prince");
		m1.setGravadora("Fulaninho Records");
		
		Musica m2 = new Musica();
		m2.setNome("Thriller");
		m2.setAutor("Michael Jackson");
		m2.setGravadora("Fulaninho Records");
		
		Musica m3 = new Musica();
		m3.setNome("Ela Partiu");
		m3.setAutor("Tim Maia");
		m3.setGravadora("Beltraninho Sons");
		
		Playlist p = new Playlist();
		p.setDono("Siclano");
		try {
			p.adicionarMusica(m1);
			p.adicionarMusica(m2);
			p.adicionarMusica(m3);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			p.tocarPlaylist();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
