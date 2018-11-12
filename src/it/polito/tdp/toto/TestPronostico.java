package it.polito.tdp.toto;

import java.util.List;

public class TestPronostico {

	public static void main(String[] args) {
		Pronostico p = new Pronostico(3) ;
		p.add(new Previsione(Risultato.UNO));
		p.add(new Previsione(Risultato.UNO, Risultato.ICS)) ;
		p.add(new Previsione(Risultato.ICS, Risultato.DUE));
//		p.add(new Previsione(Risultato.ICS));
//		p.add(new Previsione(Risultato.UNO, Risultato.DUE)) ;
		
		System.out.println(p) ;
		
		Expander ex = new Expander() ;
		List<Schedina> risultato = ex.expand(p) ; 
		System.out.println(risultato);

	}

}
