public class Pessoa
{

  // Atributos da classe Pessoa
  private String nome;
  private int idade;
  private String sexo;
  public Pessoa (String nomePessoa, int idadePessoa, String sexoPessoa)
  {
    this.nome = nomePessoa;
    this.idade = idadePessoa;
    this.sexo = sexoPessoa;
  }
   public String getNome() {
		return nome;
	 }

	 public void setNome(String nome) {
		this.nome = nome;
	 }
	 public int getIdade() {
		return idade;
	 }

	 public void setIdade(int idade) {
		this.idade = idade;
	 }
	 public String getSexo() {
		return sexo;
	 }

	 public void setSexo(String sexo) {
		this.sexo = sexo;
	 }
  public String toString ()
  {
    return "Seu nome é " + nome + " ele possui " + idade + " anos " + "e é do sexo " + sexo;
  }

}
