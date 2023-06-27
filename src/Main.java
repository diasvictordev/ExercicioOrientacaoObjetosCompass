
public class Main {
    public static void main(String[] args) {
        Combustivel combustivel = new Combustivel(true, false, false, false,
                false, false);
        Veiculo veiculo = new Veiculo(true, true, 4, 2,
                4, false, 0, combustivel);

        System.out.println("Tem motor: " + veiculo.hasMotor());
        System.out.println("Tem volante: " + veiculo.hasVolante());
        System.out.println("Quantidade de passageiros: " + veiculo.getQuantidadePassageiros());
        System.out.println("Quantidade de portas: " + veiculo.getQuantidadePortas());
        System.out.println("Quantidade de rodas: " + veiculo.getQuantidadeRodas());
        System.out.println("É de carga: " + veiculo.isCarga());
        System.out.println("Capacidade de carga: " + veiculo.getCapacidadeCarga());

    }
}