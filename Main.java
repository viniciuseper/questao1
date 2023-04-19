package br.com.questao1;

public class Main {

    public static void main(String[] args) {

        Professor prof1 = new Professor("Michelle","michelle@prof.com.br","123456@mi",25,50);
        System.out.println("DADOS PROFESSOR\nNome: " + prof1.mostraProfessor());

        Aluno al1 = new Aluno("Vinícius","vinicius@aluno.com.br","123456@vi",4,1);
        System.out.println("DADOS ALUNO \nNome: " + al1.mostraAluno());
    }
}
