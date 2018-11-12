package it.polito.tdp.toto;

import java.util.ArrayList;
import java.util.List;

public class Expander {
	
	private List<Schedina> soluzione ;

	public List<Schedina> expand(Pronostico p) {
		
		soluzione = new ArrayList<Schedina>() ;
		
		cerca(new Schedina(p.getN()), p, 0) ;
		
		return soluzione;
	}

	private void cerca(Schedina parziale, Pronostico p, int livello) {
		
		if(livello==p.getN()) {
			// caso terminale => ho una soluzione completa
			soluzione.add(new Schedina(parziale)) ;
			return ;
		}
		
		Previsione mosse = p.get(livello) ;
		for( Risultato mossa : mosse.getValori() )
		{
			parziale.add(mossa); // prova la soluzione
			cerca(parziale, p, livello+1) ;
			parziale.removeLast(); // backtrack
		}

	}
	
	/*
	Problema parziale: Schedina 1-X, livello 2
	Devo guardare pronostico p(2). Supponiamo sia X2
	Allora generer� le nuove soluzioni parziali 1-X-X, 1-X-2
	*/
}
