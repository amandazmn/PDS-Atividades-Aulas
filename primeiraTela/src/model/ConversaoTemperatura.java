package model;

public class ConversaoTemperatura {

	public float convereterFtoC(float temperaturaF) {
		float temperaturaC = (temperaturaF-32)*5f/9f;
		return temperaturaC;
	}
	
}
