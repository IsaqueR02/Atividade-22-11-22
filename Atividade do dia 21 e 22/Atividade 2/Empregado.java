public class Empregado extends Pessoa
{

  // Atributos da classe Empregado
  private double salario;
  private String matricula;
  public Empregado (String Matricula, double seuSalario, 
  String nome, int idade, String sexo)
  {
      super(nome,idade,sexo);
    this.salario = seuSalario;
    this.matricula = Matricula;
  }
  public String getMatricula() {
		return matricula;
	 }

	 public void setMatricula(String matricula) {
		this.matricula = matricula;
	 }
public double getSalario() {
		return salario;
	 }

	 public void setSalario(double salario) {
		this.salario = salario;
	 }
  public String toString ()
  {
    return "Sua matrícula é " + matricula + " recebe R$" + salario;

  }

}
