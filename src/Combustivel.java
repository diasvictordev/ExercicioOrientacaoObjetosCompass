public class Combustivel {
    private boolean gasolina;
    private boolean alcool;
    private boolean diesel;
    private boolean eletricidade;
    private boolean humano;
    private boolean animal;

    public Combustivel(boolean gasolina, boolean alcool, boolean diesel, boolean eletricidade, boolean humano, boolean animal) {
        this.gasolina = gasolina;
        this.alcool = alcool;
        this.diesel = diesel;
        this.eletricidade = eletricidade;
        this.humano = humano;
        this.animal = animal;
    }

    public boolean hasGasolina() {
        return gasolina;
    }

    public boolean hasAlcool() {
        return alcool;
    }

    public boolean hasDiesel() {
        return diesel;
    }

    public boolean hasEletricidade() {
        return eletricidade;
    }

    public boolean hasHumano() {
        return humano;
    }

    public boolean hasAnimal() {
        return animal;
    }
}
