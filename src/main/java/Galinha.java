public class Galinha implements Taco{
    public String descricao;

    public Galinha(){
        descricao = "Taco de galinha";
    }
    public String getDescricao() {
        return this.descricao;
    }

    public double custo() {
        return 2.49;
    }
}
