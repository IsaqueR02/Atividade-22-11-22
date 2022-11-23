public class Cachorro
{
  // Atributos da classe Conta
  private String nome;
  private String raca;
  private double peso;

  public Cachorro (String nomeCachorro, String nomeRaca, double pesoCao)
  {
    this.nome = nomeCachorro;
    this.raca = nomeRaca;
    this.peso = pesoCao;
  }

  public String toString ()
  {
    return "O Cachorro { " +
      " do seu cachorro " + nome +
      " sua raC'a " + raca + " seu peso C) " + peso + "kg " + "}";
  }
}
