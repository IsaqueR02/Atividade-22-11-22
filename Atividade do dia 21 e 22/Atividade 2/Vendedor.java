public class Vendedor extends Empregado
{

  // Atributos da classe Vendedor
  private double Venda;
  private int qnt;

  public Vendedor (String Matricula, double seuSalario,double valorVendas, int qntVendas,
  String nome, int idade, String sexo)
  {
  super(Matricula, seuSalario, 
  nome, idade, sexo);
    this.Venda = valorVendas;
    this.qnt = qntVendas;

  }
  public double getVenda() {
		return Venda;
	 }

	 public void setVenda(double valorVendas) {
		this.Venda = valorVendas;
	 }
	 public int getQnt() {
		return qnt;
	 }

	 public void setQnt(int qntVendas) {
		this.qnt = qntVendas;
	 }
  public String toString ()
  {
    return "O valor do produto é " + Venda + " você vendeu " + qnt;
  }
}
