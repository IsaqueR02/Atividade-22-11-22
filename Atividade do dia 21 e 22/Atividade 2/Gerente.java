public class Gerente extends Empregado
{

  // Atributos da classe gerente
  private String gerente;
  private double inss;


  public Gerente (String Matricula, double seuSalario, String nomeGerencia, int valorInss,
  String nome, int idade, String sexo,
  double salario, String matricula) {
      super(Matricula, seuSalario, 
  nome, idade, sexo);
    this.gerente = nomeGerencia;
    this.inss = valorInss;

  }
  public String getGerente() {
		return gerente;
	 }

	 public void setGerente(String nomeGerente) {
		this.gerente = gerente;
	 }
	 public double getInss() {
		return inss;
	 }

	 public void setInss(double valorInss) {
		this.inss = valorInss;
	 }
  public String toString ()
  {
    return "O nome do Gerente é " + gerente + "o valor do Inss é: " + inss;

  }
}
