package executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Aluno;
import classes.Disciplina;
import constantes.StatusAluno;

public class PrimeiraClasse {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o login: ");
		String senha = JOptionPane.showInputDialog("Informe a senha: ");

		if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {

			JOptionPane.showMessageDialog(null, "Acesso liberado ao sistema! Pressione OK!");

			List<Aluno> alunos = new ArrayList<>();

			HashMap<String, List<Aluno>> maps = new HashMap<>();

			for (int qnt = 1; qnt <= 1; qnt++) {

				String nome = JOptionPane.showInputDialog("Digite o nome do aluno " + qnt + " :");
//				String idade = JOptionPane.showInputDialog("Digite a idade do aluno:");
//				String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento do aluno:");
//				String rg = JOptionPane.showInputDialog("Digite o RG do aluno:");
//				String cpf = JOptionPane.showInputDialog("Digite o CPF do aluno:");
//				String nomeMae = JOptionPane.showInputDialog("Digite o nome da mãe do aluno:");
//				String nomePai = JOptionPane.showInputDialog("Digite o nome do pai do aluno:");
//				String dataMatricula = JOptionPane.showInputDialog("Digite a data da matrícula do aluno:");
//				String serieMatriculado = JOptionPane.showInputDialog("Digite a série do aluno:");
//				String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola do aluno:");

				Aluno aluno = new Aluno();

				aluno.setNome(nome);
//				aluno.setIdade(Integer.valueOf(idade));
//				aluno.setDataNascimento(dataNascimento);
//				aluno.setRegistroGeral(rg);
//				aluno.setNumeroCpf(cpf);
//				aluno.setNomeMae(nomeMae);
//				aluno.setNomePai(nomePai);
//				aluno.setDataMatricula(dataMatricula);
//				aluno.setSerieMatriculado(serieMatriculado);
//				aluno.setNomeEscola(nomeEscola);

				for (int pos = 1; pos < 1; pos++) {

					String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da " + pos + "º disciplina:");
					String notaDisciplina = JOptionPane.showInputDialog("Digite a nota da " + pos + "º disciplina:");

					Disciplina discilpina = new Disciplina();

					discilpina.setDisciplina(nomeDisciplina);
					discilpina.setNota(Double.valueOf(notaDisciplina));

					aluno.getDisciplina().add(discilpina);
				}

				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

				if (escolha == 0) {
					int continuaRemover = 0;
					int posicao = 1;

					while (continuaRemover == 0) {
						String disciplinaRemover = JOptionPane.showInputDialog(null,
								"Informe a disciplina a ser removida [1, 2, 3 ou 4]");
						aluno.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
						posicao++; // Incremente 1 ao valor atual da variável posicao
						continuaRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar a remover?");
					}
				}
				alunos.add(aluno);
			}

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {
				if (aluno.getAlunoAprovadoboolean().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovadoboolean().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else if (aluno.getAlunoAprovadoboolean().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			}

			System.out.println("Lista dos alunos APROVADOS! :)");
			System.out.println("==============================");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Média: " + aluno.getMediaNota());
				System.out.println("--------------------------");
			}
			System.out.println("==============================");

			System.out.println("Lista dos alunos REPROVADOS! :(");
			System.out.println("==============================");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Média: " + aluno.getMediaNota());
				System.out.println("--------------------------");
			}
			System.out.println("==============================");

			System.out.println("Lista dos alunos em RECUPERAÇÃO! ^ | ^");
			System.out.println("==============================");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Média: " + aluno.getMediaNota());
				System.out.println("--------------------------");
			}
			System.out.println("==============================");
		} else {
			JOptionPane.showMessageDialog(null,
					"Login ou senha inválido(s)! Acesso não autorizado! Pressione OK e tente novamente!");
		}
	}
}
