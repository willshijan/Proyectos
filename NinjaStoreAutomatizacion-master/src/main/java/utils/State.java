package utils;

public enum State {

	NEW_JERSEY("New Jersey"),
	ALABAMA("Alabama");
	
	private String state;
	
	State(String state){
		this.state = state;
	}
	
	public String state() {
		return state;
	}
}

