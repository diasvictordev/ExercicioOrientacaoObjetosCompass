public class Charrete extends Veiculo{
    private int quantidadeEixos;

    public Charrete(boolean motor, boolean volante, int quantidadePassageiros, int quantidadePortas,
                    int quantidadeRodas, boolean carga, double capacidadeCarga,
                    int quantidadeEixos,  Combustivel combustivel) {
        super(motor, volante, quantidadePassageiros, quantidadePortas, quantidadeRodas, carga, capacidadeCarga, combustivel);
        this.quantidadeEixos = quantidadeEixos;
    }


    public int getQuantidadeEixos() {

        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {

        this.quantidadeEixos = quantidadeEixos;
    }
}
