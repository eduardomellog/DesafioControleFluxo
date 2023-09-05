import java.util.Scanner;

import fluxo.exception.ParametrosInvalidosException;
import fluxo.model.ContadorModel;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Vamos digitar dois parametros? Eu mostrarei cada número digitado dentro do intervalo digitado: ");
            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = scanner.nextInt();

            System.out.print("Digite o segundo parâmetro: ");
            int parametroDois = scanner.nextInt();

            ContadorModel model = new ContadorModel();
            model.setParametros(parametroUm, parametroDois);
            model.contar();
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}