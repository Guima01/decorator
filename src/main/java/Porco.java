public class Porco implements Taco{

    public String descricao;

    public Porco(){
        descricao = "Taco de porco";
    }
    public String getDescricao() {
        return this.descricao;
    }

    public double custo() {
        return 2.75;
    }
}
