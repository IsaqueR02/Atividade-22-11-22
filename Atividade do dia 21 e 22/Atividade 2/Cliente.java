public class Cliente extends Pessoa
{

  // Atributos da classe Cliente
  private double divida;
  private int Nasc;

  public Cliente (double valorDivida, int anoNasc,
		  String nome, int idade, String sexo)
  {
    super (nome, idade, sexo);
    this.divida = valorDivida;
    this.Nasc = anoNasc;
  }
  public double getDivida() {
		return divida;
	 }

	 public void setDivida(double valorDivida) {
		this.divida = valorDivida;
	 }
	 public int getNasc() {
		return Nasc;
	 }

	 public void setNasc(int nasc) {
		this.Nasc = nasc;
	 }

  public String toString ()
  {

    return "O valor da compra é " + divida +
      " o dia do seu nascimento é " + Nasc;

  }
}
