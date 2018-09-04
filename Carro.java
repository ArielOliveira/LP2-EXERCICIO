public class Carro extends Veiculo {
    private int chassi;
    private boolean quatroPortas;
    
    public Carro() {
        super();
        this.chassi = 0;
        this.quatroPortas = false;
    }
    
    public Carro(int chassi, boolean quatroPortasi, String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.chassi = chassi;
        this.quatroPortas = quatroPortas;
    }

    public boolean isQuatroProtas() {
        return quatroPortas;
    }

    public void imprimirDados() {
        super.imprimirDados();
    }
}
