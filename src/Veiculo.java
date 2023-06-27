public class Veiculo {
    private boolean motor;
    private boolean volante;
    private int quantidadePassageiros;
    private int quantidadePortas;
    private int quantidadeRodas;
    private boolean carga;
    private double capacidadeCarga;
    private Combustivel combustivel;

    public Veiculo (boolean motor, boolean volante, int quantidadePassageiros, int quantidadePortas
            , int quantidadeRodas, boolean carga, double capacidadeCarga, Combustivel combustivel){
        this.motor = motor;
        this.volante = volante;
        this.quantidadePassageiros = quantidadePassageiros;
        this.quantidadePortas = quantidadePortas;
        this.quantidadeRodas = quantidadeRodas;
        this.carga = carga;
        this.capacidadeCarga = capacidadeCarga;
        this.combustivel = combustivel;
    }

    public boolean hasMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public boolean hasVolante() {
        return volante;
    }

    public void setVolante(boolean volante) {
        this.volante = volante;
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    public boolean isCarga() {
        return carga;
    }

    public void setCarga(boolean carga) {
        this.carga = carga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel() {
        this.combustivel = combustivel;
    }
}
