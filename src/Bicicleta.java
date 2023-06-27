public class Bicicleta extends Veiculo {
    private boolean eletrica;
    private boolean temBagageiro;

    public Bicicleta(boolean motor, boolean volante, int quantidadePassageiros, int quantidadePortas,
                     int quantidadeRodas, boolean carga, double capacidadeCarga, Combustivel combustivel,
                     boolean eletrica, boolean temBagageiro) {
        super(motor, volante, quantidadePassageiros, quantidadePortas, quantidadeRodas, carga, capacidadeCarga, combustivel);
        this.eletrica = eletrica;
        this.temBagageiro = temBagageiro;
    }


    public boolean isEletrica() {
        return eletrica;
    }

    public void setEletrica(boolean eletrica) {
        this.eletrica = eletrica;
    }

    public boolean hasTemBagageiro() {
        return temBagageiro;
    }

    public void setTemBagageiro(boolean temBagageiro) {
        this.temBagageiro = temBagageiro;
    }
}
