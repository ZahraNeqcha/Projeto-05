public class Agencia {
  private String nome;
  private int numero;
  private int digito;

  public Agencia(String nome, int numero, int digito) {
      this.nome = nome;
      this.numero = numero;
      this.digito = digito;
  }
  public String getNome() {
      return nome;
  }
  public int getNumero() {
      return numero;
  }
  public int getDigito() {
      return digito;
  }
  public void setNome(String nome) {
      this.nome = nome;
  }
  public void setNumero(int numero) {
      this.numero = numero;
  }
  public void setDigito(int digito) {
      this.digito = digito;
  }
  public String getDados() {
      return "Agência: " + numero + "-" + digito + ", Nome: " + nome;
  }
}