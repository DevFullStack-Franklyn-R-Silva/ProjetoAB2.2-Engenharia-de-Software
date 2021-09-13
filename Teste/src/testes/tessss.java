package testes;

import java.util.ArrayList;
import java.util.List;

public abstract class tessss {


	private static final byte TIPO_MEDIA_PONDERADA = 1;

	public static void main(String[] args) {

		Boletim media = new Boletim();
		
		media.setTipoMedia(TIPO_MEDIA_PONDERADA);

		float[] nota = {-2, -3};
		int[] peso = { 5,  2};
		media.calculaMedia(nota, peso);

		float a = media.calculaMedia(nota, peso);

		List<Float> listaASerTestada = new ArrayList<>();
		listaASerTestada.add(a);
		System.out.println(listaASerTestada);
	}

}
