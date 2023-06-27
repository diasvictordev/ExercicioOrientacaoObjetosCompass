public class Caminhao extends Veiculo{
    private int quantidadeEixos;

    public Caminhao(boolean motor, boolean volante, int quantidadePassageiros, int quantidadePortas, int quantidadeRodas, boolean carga, int capacidadeCarga, Combustivel combustivel, int quantidadeEixos) {
        super(motor, volante, quantidadePassageiros, quantidadePortas, quantidadeRodas, carga, capacidadeCarga, combustivel);
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos() {

        return quantidadeEixos;
    }

}
