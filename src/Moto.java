public class Moto extends Veiculo {
    private boolean partidaEletrica;

    public Moto(boolean motor, boolean volante, int quantidadePassageiros, int quantidadePortas, int quantidadeRodas, boolean carga, int capacidadeCarga, Combustivel combustivel, boolean partidaEletrica) {
        super(motor, volante, quantidadePassageiros, quantidadePortas, quantidadeRodas, carga, capacidadeCarga, combustivel);
        this.partidaEletrica = partidaEletrica;
    }

    public boolean hasPartidaEletrica() {
        return partidaEletrica;
    }
}
