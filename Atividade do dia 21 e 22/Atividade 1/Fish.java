public class Fish
{
  // Atributos da classe Conta
  private String nome;
  private String habitat;
  private double peso;

  public Fish (String nomePeixe, String tipoHabitat, double pesoFish)
  {
    this.nome = nomePeixe;
    this.habitat = tipoHabitat;
    this.peso = pesoFish;
  }

  public String toString ()
  {
    return "O peixe {" +
      " do seu peixe " + nome +
      " seu habitat é " + habitat + " seu peso é " + peso + "kg "+ "}";
  }

}
