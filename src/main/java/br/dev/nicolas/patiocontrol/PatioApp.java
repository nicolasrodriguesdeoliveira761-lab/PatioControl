package br.dev.nicolas.patiocontrol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatioApp {

    public static Scanner teclado = new Scanner(System.in);

    public static List<Veiculo> listaVeiculos = new ArrayList<>();

    public static void main(String[] args) {

        
        int opcao = 0;
        
        
        while (opcao != 99) {

            System.out.println("------------------------------------------");
            System.out.println("Controle de Vei­culos");
            System.out.println("------------------------------------------");
            System.out.println("10-Incluir vei­culo");
            System.out.println("11-Listar vei­culos");
            System.out.println("20-SaÃ­da de vei­culo");
            System.out.println("21-RelatÃ³rio de vei­culos em Linha.");
            System.out.println("30-Entrada de veiculo");
            System.out.println("31-Relatorio de vei­culos no patio.");
            System.out.println("99-Sair");
            System.out.println("");
            System.out.print("Digite a opção:");

            opcao = teclado.nextInt();

            switch (opcao) {
                case 10 -> {
                    incluirVeiculo();
                }

                case 11 -> {
                    System.out.println("Voce escolheu Listar Veiculos");
                    listarVeiculos();
                }
                
                case 20 -> {
                    System.out.println("\n\nSaida de Veiculos\n");
                    saidaVeiculo();
                    
                }
                
                case 21 -> {
                    System.out.println("\n\nVeículos na rua\n");
                    foraVeiculo();
                    
                }
                
                case 30 -> {
                    System.out.println("\n\nEntrada de Veiculos\n");
                    entrarVeiculo();
                    
                }

                case 31 -> {
                    System.out.println("\n\nVeívculos no pátio\n");
                    lugarVeiculo();
                    
                }
                
                 case 99 -> {
                    System.out.println("\n\nVoce saiu com sucesso\n");
                    saida();
                    
                }
            }
        }
    }

    public static void incluirVeiculo() {
        // Conversar com usuario
        System.out.println("Cadastro de Veiculos");

        // pedir dados veiculo (placa marca modelo)
        System.out.printf("Placa : ");
        String placa = teclado.next();

        System.out.printf("Marca : ");
        String marca = teclado.next();

        System.out.printf("Modelo: ");
        String modelo = teclado.next();

        Veiculo veic = new Veiculo(placa, marca, modelo);

        // adicionar na listaVeiculos
        listaVeiculos.add(veic);

        // voltar ao menu principal.
    }

    public static void listarVeiculos() {

        System.out.println("-".repeat(50));
        System.out.println("Relatorio de Veiculos");
        System.out.println("-".repeat(50));
//                  1234567890 1234567890 1234567890 1234567890 1234567890
        System.out.println("Placa      Modelo     Marca      Motorista  Status");
        System.out.println("-".repeat(50));

        for (Veiculo v : listaVeiculos) {

            System.out.println(v.toString());

        }

        System.out.println("<<< FIM RELATORIO >>>\n\n");

    }
    
    public static void saidaVeiculo() {
        
        // Pedir a placa
        System.out.print("Informe a placa do veiculo para SAIDA: ");
        String placa = teclado.next();
        
        System.out.print("Motorista: ");
        String motorista = teclado.next();
                
        // Verificar index do veiculo
        for (int i = 0; i < listaVeiculos.size(); i++) {
            
            if ( listaVeiculos.get(i).getPlaca().equalsIgnoreCase(placa) ) {
                
                // marcar saÃ­da        
                listaVeiculos.get(i).sairComVeiculo(motorista);
                break;
                
            }
        }
    }
    
     public static void foraVeiculo() {
        // Conversar com usuario
        System.out.println("Veículoas que estao na rua");

        // pedir dados veiculo (placa marca modelo)
        System.out.printf("Placa : ");
        String placa = teclado.next();

        System.out.printf("Marca : ");
        String marca = teclado.next();

        System.out.printf("Modelo: ");
        String modelo = teclado.next();

        Veiculo veic = new Veiculo(placa, marca, modelo);

        // adicionar na listaVeiculos
        listaVeiculos.add(veic);

        // voltar ao menu principal.
    }
    
    public static void entrarVeiculo() {
        // Pedir a placa
        System.out.print("Informe a placa do veiculo para SAIDA: ");
        String placa = teclado.next();
        
        // Verificar index do veiculo
        for (int i = 0; i < listaVeiculos.size(); i++) {
            
            if ( listaVeiculos.get(i).getPlaca().equalsIgnoreCase(placa) ) {
                
                // marcar saÃ­da        
                listaVeiculos.get(i).entrarComVeiculo();
                break;
                
            }
        }
    }
    
     public static void lugarVeiculo() {
        // Conversar com usuario
        System.out.println("Veiculos que estao no patio");

        // pedir dados veiculo (placa marca modelo)
        System.out.printf("Placa : ");
        String placa = teclado.next();

        System.out.printf("Marca : ");
        String marca = teclado.next();

        System.out.printf("Modelo: ");
        String modelo = teclado.next();

        Veiculo veic = new Veiculo(placa, marca, modelo);

        // adicionar na listaVeiculos
        listaVeiculos.add(veic);

        // voltar ao menu principal.
    }
     
    public static void relatorioVeiculoLinha() {
        
        System.out.println("-".repeat(50));
        System.out.println("Relatorio de Veiculos");
        System.out.println("-".repeat(50));
//                  1234567890 1234567890 1234567890 1234567890 1234567890
        System.out.println("Placa      Modelo     Marca      Motorista  Status");
        System.out.println("-".repeat(50));

        for (Veiculo v : listaVeiculos) {

            if (v.getStatus() == StatusVeiculo.RUA) {
                System.out.println(v.toString());
            }

        }
        

        System.out.println("<<< FIM RELATORIO >>>\n\n");
        
        
    }

    private static void saida() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    }

    
  