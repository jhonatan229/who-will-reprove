package entity;

public class Candidate {

	private String name;
	private Integer numberHits;

	public Candidate() {
	}

	public Candidate(String name, Integer numberHits) {
		if (name.length() <= 20) {
			this.name = name;
		} else {
			throw new RuntimeException("name is too big");
		}
		if (numberHits >= 0 && numberHits <= 10) {
			this.numberHits = numberHits;
		}
		else {
			throw new RuntimeException(" the number is incorect");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumberHits() {
		return numberHits;
	}

	public void setNumberHits(Integer numberHits) {
		this.numberHits = numberHits;
	}

	@Override
	public String toString() {
		return "Candidate [name=" + name + ", numberHits=" + numberHits + "]";
	}


}
