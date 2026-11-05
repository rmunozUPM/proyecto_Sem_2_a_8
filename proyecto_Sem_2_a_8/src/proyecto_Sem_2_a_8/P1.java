package proyecto_Sem_2_a_8;

public class P1 {

	public int cuantasVeces(int[]lista, int numero) {
		int contador = 0;
		for(int num: lista)
			if(num==numero)
				contador++;
		return contador;
	}
	
	
	public int cuantasVecesRecursivo(int[]lista, int numero) {
		return cuantasVeces(lista,numero,0);
	}
	private int cuantasVeces(int[]lista, int numero, int indice) {
		if(indice== lista.length)
			return 0;
		if(numero == lista[indice])
			return 1 + cuantasVeces(lista,numero,indice+1);
		return cuantasVeces(lista,numero,indice+1);
	}
}
