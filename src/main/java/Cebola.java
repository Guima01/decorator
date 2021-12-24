
public class Cebola extends TacoDecorator{
    Taco taco;

    public Cebola(Taco taco){
        this.taco = taco;
    }

    public String getDescricao(){
        return taco.getDescricao() + ", Cebola";
    }

    public double custo() {
        return .10 + taco.custo();
    }
}
