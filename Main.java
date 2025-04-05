import java.util.Scanner;
import java.util.Random;


public class Main {
    
    public static void main(String[] args) {
        int escolha = 0;
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.nome = "Mauro Iwama"; //matricula 439
        cliente.cpf = 1230041966;
        
        //PC1
        Computador comp1 = new Computador();
        comp1.marca = "Apple";
        comp1.sistema.nome = "Linux Ubuntu";
        comp1.sistema.tipo = 32;
        comp1.preco = 439;
        HardwareBasico hardware_1 = new HardwareBasico();
        comp1.hardware_pc[0] = hardware_1;
        comp1.hardware_pc[0].nome = "Pentium Core i3";
        comp1.hardware_pc[0].capacidade = 2200;
        HardwareBasico hardware_2 = new HardwareBasico();
        comp1.hardware_pc[1] = hardware_2;
        comp1.hardware_pc[1].nome = "8 Gb de Memória RAM";
        comp1.hardware_pc[1].capacidade = 8;
        HardwareBasico hardware_3 = new HardwareBasico();
        comp1.hardware_pc[2] = hardware_3;
        comp1.hardware_pc[2].nome = "500 Gb de HD";
        comp1.hardware_pc[2].capacidade = 500;
        MemoriaUSB USB1 = new MemoriaUSB();
        USB1.nome = "Pen-drive";
        USB1.capacidade = 16;
        comp1.addMemoriaUSB(USB1);

        // Pormoção 2
        Computador comp2 = new Computador();
        comp2.marca = "Samsung";
        comp2.preco = 439 + 1234;
        comp2.sistema.nome = "Windows 8";
        comp2.sistema.tipo = 64;
        HardwareBasico hardware_n2_1 = new HardwareBasico();
        comp2.hardware_pc[0] = hardware_n2_1;
        comp2.hardware_pc[0].nome = "Pentium Core i5";
        comp2.hardware_pc[0].capacidade = 3370;
        HardwareBasico hardware_n2_2 = new HardwareBasico();
        comp2.hardware_pc[1] = hardware_n2_2;
        comp2.hardware_pc[1].nome = "16 Gb de Memória RAM";
        comp2.hardware_pc[1].capacidade = 16;
        HardwareBasico hardware_n2_3 = new HardwareBasico();
        comp2.hardware_pc[2] = hardware_n2_3;
        comp2.hardware_pc[2].nome = "1 Tb de HD";
        comp2.hardware_pc[2].capacidade = 1;
        MemoriaUSB USB2 = new MemoriaUSB();
        USB2.nome = "Pen-drive";
        USB2.capacidade = 32;
        comp2.addMemoriaUSB(USB2);

        // promoção 3
        Computador comp3 = new Computador();
        comp3.marca = "Dell";
        comp3.sistema.nome = "Windows 10";
        comp3.preco = 439+ 5678;
        comp3.sistema.tipo = 64;
        HardwareBasico hardware_n3_1 = new HardwareBasico();
        comp3.hardware_pc[0] = hardware_n3_1;
        comp3.hardware_pc[0].nome = "Pentium core i7";
        comp3.hardware_pc[0].capacidade = 4500;
        HardwareBasico hardware_n3_2 = new HardwareBasico();
        comp3.hardware_pc[1] = hardware_n3_2;
        comp3.hardware_pc[1].nome = "32 Gb de Memória RAM";
        comp3.hardware_pc[1].capacidade = 32;
        HardwareBasico hardware_n3_3 = new HardwareBasico();
        comp3.hardware_pc[2] = hardware_n3_3;
        comp3.hardware_pc[2].nome = "2 Tb de HD";
        comp3.hardware_pc[2].capacidade = 2;
        MemoriaUSB USB3 = new MemoriaUSB();
        USB3.nome = "HD externo";
        USB3.capacidade = 1000;
        comp3.addMemoriaUSB(USB3);

        System.out.printf("Escolha uma das promoções, digite seu reespectivo numero: ");
        do {
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    cliente.newPC(comp1);
                    break;

                case 2:
                    cliente.newPC(comp2);
                    break;

                case 3:
                    cliente.newPC(comp3);
                    break;

                case 0:
                    System.out.println("Muito obrigado!");
                    break;

                default:
                    System.out.println("Tente novamente");
            }
            if (escolha != 0) {
                System.out.printf("Se tiver certeza digite 0");
            }
        } while (escolha != 0);

        cliente.Compras();
        cliente.calculaTotalCompra();
        scanner.close();
    }
}
