package EstruturaDeDados;

import java.util.Arrays;

public class Vetor {
	
	private Aluno [] alunos = new Aluno[100];
	private int totalDeAlunos = 0; // aponta pra proximo indice vazio
	
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
	
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= totalDeAlunos;
	}
	
	public void adiciona(int posicao, Aluno aluno) { // metodo adiciona que adiciona em qualquer lugar na lista
		
		if(!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Poiscao Inválida");
		}
		
		for(int i = totalDeAlunos - 1; i >= posicao; i-=1)  { //Vai começar da ultima posicao que tem alguem
			alunos[i+1] = alunos[i];
		}
		alunos[posicao] = aluno;
		totalDeAlunos++;   //Tempo de Execucao O(N)
	}
	
	private boolean posicaoOcupada (int posicao) {
		return posicao >= 0 && posicao < totalDeAlunos;
	}
	
	public Aluno pega(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao Invalida");
		}
		return alunos[posicao];
	}
	
	public void remove(int posicao) {
		for(int i = posicao; i < this.totalDeAlunos - 1; i++) {
			this.alunos[i] = this.alunos[i+1];
		}
		totalDeAlunos--;
		this.alunos[totalDeAlunos] = null;
	}
	
	public boolean contem(Aluno aluno) {
		// Quero perguntar para minha lista se o aluno está ou nao esta na minha lista
		// Percorrer o Array inteiro e comparar aluno por aluno
		for(int i = 0; i < totalDeAlunos; i++) { // vou varrer ate a posicao que eu sei que tem alguem
			if(aluno.equals(alunos[i])) {   // o tempo de execucao varia com a quantidade de elementos, por enquanto é o^n
				return true;
			}
		}
		return false;
	}
	
	public int tamanho() {
		return totalDeAlunos; // tendo em vista o total de alunos... consequentemente é o tamanho do array.
	}
	
	public String toString() {
		return Arrays.toString(alunos);
	}

}