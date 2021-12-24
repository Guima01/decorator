public class Batata extends TacoDecorator{
    Taco taco;

    public Batata(Taco taco){
        this.taco = taco;
    }

    public String getDescricao(){
        return taco.getDescricao() + ", Batata";
    }

    public double custo() {
        return .30 + taco.custo();
    }
}
