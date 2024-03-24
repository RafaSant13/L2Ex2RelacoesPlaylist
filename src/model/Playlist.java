package model;

import javax.swing.JOptionPane;

public class Playlist {
	
	private String dono;
	private Lista<Musica> musicas;

	public Playlist() {
		this.dono = "";
		this.musicas = new Lista<Musica>();	
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public void adicionarMusica(Musica musica) throws Exception {
		musicas.addLast(musica);
	}
	
	public void tocarPlaylist() throws Exception {
		int tamanho = musicas.size();
		int pos = (int)(Math.random()*tamanho);
		Musica m = musicas.get(pos);
	JOptionPane.showMessageDialog(null, "Olá "+dono+",\nAgora tocando: "+m.getNome()+" | "+m.getAutor()+" | "+m.getGravadora());
		
	}

}
