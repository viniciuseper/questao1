package br.com.questao1;

public class Aluno extends Pessoa{

    public float periodo;
    public int turma;

    public Aluno(String nome, String email, String senha, float periodo, int turma) {
        super(nome, email, senha);
        this.periodo = periodo;
        this.turma = turma;
    }

    public float getPeriodo() {
        return periodo;
    }

    public void setPeriodo(float periodo) {
        this.periodo = periodo;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public String mostraAluno(){
        return getNome() + "\nE-mail: " + getEmail() + "\nPeríodo: " + getPeriodo() + "\nTurma: " + getTurma();
    }
}
