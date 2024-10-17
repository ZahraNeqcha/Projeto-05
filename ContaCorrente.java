public class ContaCorrente {
  private int numero;
  private int digito;
  private Agencia agencia;
  private double saldo;

  public ContaCorrente(int numero, int digito, Agencia agencia, double saldo) {
      this.numero = numero;
      this.digito = digito;
      this.agencia = agencia;
      this.saldo = saldo;
  }
  public int getNumero() {
      return numero;
  }
  public int getDigito() {
      return digito;
  }
  public Agencia getAgencia() {
      return agencia;
  }
  public double getSaldo() {
      return saldo;
  }
  public void setNumero(int numero) {
      this.numero = numero;
  }
  public void setDigito(int digito) {
      this.digito = digito;
  }
  public void setAgencia(Agencia agencia) {
      this.agencia = agencia;
  }
  public void setSaldo(double saldo) {
      this.saldo = saldo;
  }
  public void depositar(double valor) {
      saldo += valor;
  }
  public double sacar(double valor) {
      if (valor > saldo) {
          System.out.println("Saque não realizado. Saldo insuficiente.");
          return 0;
      } else {
          saldo -= valor;
          return valor;
      }
  }
  public double consultarSaldo() {
      return saldo;
  }
  public void imprimirSaldo() {
      System.out.println("Conta: " + numero + "-" + digito);
      System.out.println("Agência: " + agencia.getNumero() + "-" + agencia.getDigito());
      System.out.println("Saldo: " + saldo);
  }
  public String getDados() {
      return "Conta: " + numero + "-" + digito + ", Saldo: " + saldo + "\n" + agencia.getDados();
  }
}