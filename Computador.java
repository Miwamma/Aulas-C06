public class Computador {

    public SistemaOperacional sistema;
    String marca;
    float preco;
    HardwareBasico[] hardware_pc;
    SistemaOperacional sistema_pc;
    MemoriaUSB memoria_pc;


    public Computador () {
        hardware_pc = new HardwareBasico[3];
        sistema_pc = new SistemaOperacional();
    }


    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço R$: " + preco);
        for(int i=0; i<hardware_pc.length; i++) {
            if (hardware_pc[i] != null) {
                System.out.println("Hardware: " + hardware_pc[i].nome + "(" + hardware_pc[i].capacidade + " Mhz)");
            }
        }
        System.out.println("Sistema Operacional: " + sistema_pc.nome + " tipo: " + sistema_pc.tipo);
        if (memoria_pc != null) {
            System.out.println("Memória USB: " + memoria_pc.nome + memoria_pc.capacidade);
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoria_pc = musb;
    }

}
