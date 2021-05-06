package intro;

public class Name {
	private String name;
	private String surname;
	
	public Name(String name,String surname) {
		this.setName(name);
		this.setSurname(surname);
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getSurname() {
		return surname;
	}

	void setSurname(String surname) {
		this.surname = surname;
	}
	
	
}
