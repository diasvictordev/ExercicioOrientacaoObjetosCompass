public class Carro extends Veiculo {
    private boolean possuiArCondicionado;
    private boolean possuiRadio;

    public Carro(boolean motor, boolean volante, int quantidadePassageiros, int quantidadePortas, int quantidadeRodas, boolean carga, int capacidadeCarga, Combustivel combustivel, boolean possuiArCondicionado, boolean possuiRadio) {
        super(motor, volante, quantidadePassageiros, quantidadePortas, quantidadeRodas, carga, capacidadeCarga, combustivel);
        this.possuiArCondicionado = possuiArCondicionado;
        this.possuiRadio = possuiRadio;
    }

    public boolean hasArCondicionado() {
        return possuiArCondicionado;
    }

    public boolean hasRadio() {
        return possuiRadio;
    }
}
