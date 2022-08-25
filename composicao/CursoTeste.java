package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Julia");
		Aluno aluno3 = new Aluno("Amanda");
		
		Curso curso1 = new Curso("Java completo");
		Curso curso2 = new Curso("Javascript avançado");
		Curso curso3 = new Curso("PHP iniciante");
		
		curso1.adicinarAluno(aluno1);
		curso1.adicinarAluno(aluno2);
		
		curso2.adicinarAluno(aluno3);
		curso2.adicinarAluno(aluno1);
		
		curso3.adicinarAluno(aluno2);
		curso3.adicinarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno1.adicionarCurso(curso1);
		
		aluno2.adicionarCurso(curso2);
		aluno2.adicionarCurso(curso1);
		
		aluno3.adicionarCurso(curso1);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso " + curso2.nome);
			System.out.println("...e meu nome é " + aluno.nome + "\n");
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java completo");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
