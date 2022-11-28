public class Gerente extends Empregado
{

  // Atributos da classe gerente
  private String gerente;
  private double inss = getSalario();


  public Gerente (String Matricula, double seuSalario, String nomeGerencia,
  String nome, int idade, String sexo,
  double salario, String matricula) {
      super(Matricula, seuSalario, 
  nome, idade, sexo);
    this.gerente = nomeGerencia;

  }
  public String getGerente() {
		return gerente;
	 }

	 public void setGerente(String nomeGerente) {
		this.gerente = gerente;
	 }
	 public double getInss() {
		return super.getSalario() * 0.11;
	 }
  public String toString ()
  {
    return "O nome do Gerente é " + gerente + " e o valor do Inss é: " + getInss();

  }
}
