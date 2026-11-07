import java.util.Scanner;

public class NumerosPerfeitosV3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int qntdTermos;
        
        do {
            System.out.print("Digite o numero de termos da sequencia de numeros perfeitos (0 para sair): ");
            qntdTermos = leia.nextInt();
            
            if (qntdTermos == 0) {
                System.out.println("Encerrando o programa...");
            } 
            else if (qntdTermos < 0) {
                System.out.println("Valor invalido! Tem que ser um numero positivo acima de zero!");
            } 
            else {
                System.out.print("Sequencia: ");
                int encontrados = 0;
                long numeroAtual = 1;
                
                // Enquanto não encontrar a quantidade de termos desejada
                while (encontrados < qntdTermos) {
                    long soma = 0;
                    
                    // Encontra os divisores próprios do numeroAtual (menores que ele)
                    for (int j = 1; j < numeroAtual; j++) {
                        if (numeroAtual % j == 0) {
                            soma += j;
                        }
                    }
                    
                    // Se a soma dos divisores for igual ao número, ele é perfeito!
                    if (soma == numeroAtual) {
                        System.out.print(numeroAtual);
                        encontrados++;
                        
                        // Imprime a vírgula apenas se não for o último termo
                        if (encontrados < qntdTermos) {
                            System.out.print(", ");
                        }
                    }
                    
                    numeroAtual++; // Passa para o próximo número
                }
                System.out.println(); // Pula linha após terminar a sequência
            }
            
        } while (qntdTermos < 0); // Repete o menu principal se o valor for negativo
        
        leia.close();
    }
}
