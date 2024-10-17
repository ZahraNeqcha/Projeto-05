public class TesteAtribuicao {
  public static void main(String[] args) {
      Professor professor = new Professor("Calvetti", 50);

      Disciplina disciplina = new Disciplina("Programacao e Solucoes Computacionais", true);

      Atribuicao atribuicao = new Atribuicao(professor, disciplina);

      System.out.println(atribuicao.getDados());
  }
}

