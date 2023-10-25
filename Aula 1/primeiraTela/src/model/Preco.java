package model;

public class Preco {
	
	public float calcularPreco(float precoQuilo, float peso) {
		float preco = peso * precoQuilo;
		return preco;
	}

}
