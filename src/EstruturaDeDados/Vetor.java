package EstruturaDeDados;

import java.util.Arrays;

public class Vetor {
	
	private Aluno [] alunos = new Aluno[100];
	private int totalDeAlunos = 0;
	
	public void adiciona(Aluno aluno) {
		this.alunos[totalDeAlunos] = aluno; // essa solucao leva tempo constante pois independente da quantidade de alunos
		totalDeAlunos++;                    // ela leva menos tempo para adicionar no vetor... tempo constante!
		
		/*for(int i = 0; i < alunos.length; i++) {
			if(alunos[i] == null) {  // Esse for não é a melhor opcao por performance pois é O^n
				alunos[i] = aluno;   // Se tivessem vários alunos já adicionados, o FOR teria que percorre todos os campos
				break;               // para encontrar uma posical NULL e isso não é produtivo... 
			}
		}*/
	}
	
	public Aluno pega(int posicao) {
		
		return null;
	}
	
	public void remove(int posicao) {
		
	}
	
	public boolean contem(Aluno aluno) {
		return false;
	}
	
	public int tamanho() {
		return 0;
	}
	
	public String toString() {
		return Arrays.toString(alunos);
	}

}
