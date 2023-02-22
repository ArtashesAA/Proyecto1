package model;

import java.util.Comparator;

public class ComparaAutorMusicaAgrupacion implements Comparator<Agrupacion>{

	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		
		int num=o1.getAutor_musica().compareTo(o2.getAutor_musica());
		if(num==0) {
			num=o1.getAutor_letras().compareTo(o2.getAutor_letras());
		}
		
		return num;
		
	}

}
