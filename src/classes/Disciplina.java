package classes;

public class Disciplina {
	private String disciplina;
	private double nota;

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Disciplina: " + disciplina + ", nota: " + nota;
	}

}
