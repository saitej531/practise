package traineedemos;

public class CsTrainee extends Trainee {

	private int language;

	public CsTrainee(int id, String name, int language) {
		super(id, name);
		this.language = language;

	}

	public int getLanguage() {
		return language;
	}

	public void setLanguage(int language) {
		this.language = language;
	}


}
