public class CaixaEletronico {
  public static void main(String[] args) {
      Agencia agencia = new Agencia("Agência Central", 7890, 5);
      ContaCorrente conta = new ContaCorrente(1234, 4, agencia, 150.00);
      Cliente cliente = new Cliente("Zahra Neqcha", "123231518-12", conta);

      conta.sacar(140.0);
      System.out.println("Saldo após saque: " + conta.consultarSaldo());

      conta.sacar(200.0);
      System.out.println("Saldo após tentativa de saque: " + conta.consultarSaldo());

      conta.depositar(25.45);
      conta.imprimirSaldo();
  }
}