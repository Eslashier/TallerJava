package taller.sofka.e18;

public class App {

	public static void main(String[] args) {

		Serie listadoSeries[] = new Serie[5];
		VideoJuego listadoVideojuegos[] = new VideoJuego[5];

		listadoSeries[0] = new Serie();
		listadoSeries[1] = new Serie("Doctor House",8,"Medical drama","David Shore");
		listadoSeries[2] = new Serie("Breaking bad",5,"Thriller","Vince Gilligan");
		listadoSeries[3] = new Serie("Mr Robot", 4,"Drama","Sam Esmail");
		listadoSeries[4] = new Serie("The X-files", 11,"Sci-fi","Chris Carter");

		listadoVideojuegos[0] = new VideoJuego();
		listadoVideojuegos[1] = new VideoJuego("Bioshock Infite",40);
		listadoVideojuegos[2] = new VideoJuego("Halo: The Master Chief Collection",200,"Shooter","343 Industries");
		listadoVideojuegos[3] = new VideoJuego("Resident Evil Village",50,"Survival Horror","Capcom");
		listadoVideojuegos[4] = new VideoJuego("Elden Ring",120,"RPG","FromSoftware");

		listadoSeries[1].entregar();
		listadoSeries[2].entregar();
		listadoSeries[3].entregar();
		listadoVideojuegos[0].entregar();
		listadoVideojuegos[4].entregar();

		int seriesEntregados = 0;

		for(int i= 0;i<listadoSeries.length;i++){
			if(listadoSeries[i].isEntregado()){
				seriesEntregados+=1;
				listadoSeries[i].devolver();
			}
		}

		System.out.println("Hay "+seriesEntregados+" entregadas");

		int videoJuegosEntregados = 0;

		for(int i= 0;i<listadoVideojuegos.length;i++){
			if(listadoVideojuegos[i].isEntregado()){
				videoJuegosEntregados+=1;
				listadoVideojuegos[i].devolver();
			}
		}

		System.out.println("Hay "+videoJuegosEntregados+" entregadas");

		Serie serieMasTemporadas = listadoSeries[0];
		VideoJuego videoJuegoMasHoras = listadoVideojuegos[0];

		for(int i = 1;i<listadoSeries.length;i++){
			if(listadoSeries[i].compareTo(serieMasTemporadas)==1){
				serieMasTemporadas=listadoSeries[i];
			}
		}

		for(int i = 1;i<listadoVideojuegos.length;i++){
			if(listadoVideojuegos[i].compareTo(videoJuegoMasHoras)==1){
				videoJuegoMasHoras=listadoVideojuegos[i];
			}
		}

		System.out.println(serieMasTemporadas);
		System.out.println(videoJuegoMasHoras);

	}
}
