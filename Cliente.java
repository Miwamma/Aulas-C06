public class Cliente {

    String nome;
    long cpf;
    Computador[] pc = new Computador[3];
    int n_compras = 0;

    public void newPC(Computador computador) {
        for (int i = 0; i < pc.length; i++) {
            if (pc[i] == null) {
                pc[i] = computador;
                n_compras ++;
                break;
            }
        }
    }
    public void Compras() {
        System.out.println("Cliente: " + nome + " de CPF: " + cpf);

        System.out.println("PC's comprados: " + n_compras);
        float total = 0;
        for (int i = 0; i < pc.length; i++) {
            if (pc[i] != null) {
                System.out.println( (i+1) + "Ótima compra: ");
                pc[i].mostraPCConfigs();
                total += pc[i].preco;
                System.out.println();
            }
        }
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < pc.length; i++) {
            if (pc[i] != null) {
                total += pc[i].preco;
            }
        }
        return total;
    }
}
