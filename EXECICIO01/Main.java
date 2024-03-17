
import java.util.Scanner;

/**
 * @author Joel António
 * @version 1.0
 * Classe principal que solicita informações do usuário para criar um objeto HeartRates e exibir informações sobre ele.
 */
public class Main {
    /**
     * Método principal que solicita informações do usuário, cria um objeto HeartRates e exibe informações sobre ele.
     * 
     * @param args os argumentos de linha de comando (não são usados neste programa)
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome, sobrenome, mes;
        int dia, ano;
        try {
            // Solicita informações do usuário
            System.out.print("Digite seu nome:");
            nome = ler.nextLine();
            System.out.print("Digite seu sobrenome:");
            sobrenome = ler.nextLine();
            System.out.print("Dia:");
            dia = ler.nextInt();
            System.out.print("Mês:");
            mes = ler.next();
            System.out.print("Ano:");
            ano = ler.nextInt();
            
            // Cria um objeto DataNascimento com as informações fornecidas pelo usuário
            DataNascimento dataNascimento = new DataNascimento(dia, mes, ano);
            // Cria um objeto HeartRates com as informações fornecidas pelo usuário
            HeartRates heartRates = new HeartRates(nome, sobrenome, dataNascimento);
            
            // Exibe informações do objeto HeartRates
            System.out.println("==============IMPRIMIR A PARTIR DO OBJECTO=============");
            System.out.println("Nome Completo:" + heartRates.getNome() + " " + heartRates.getSobrenome() + "\nDia: "
                    + HeartRates.dataNascimento.getDia() + " Mês: " + HeartRates.dataNascimento.getMes() + " Ano:"
                    + HeartRates.dataNascimento.getAno() + "\n=====================================================");
            System.out.println("Idade em anos:" + heartRates.calcularIdadeEmAnos());
            System.out.println("==================FREQUÊNCIAS=======================");
            System.out.println("Frequência Cardíaca Máxima:" + heartRates.calcularFrenquenciaCardMax());
            System.out.println("Frequência Cardíaca Alvo:" + heartRates.calcularFrequenciaCardAlvo(lerPercentagem()));
            System.out.println("=====================================================");
        } catch (DataException e) {
            System.out.println("ERRO NA DATA:" + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("ERRO INESPERADO");
        } finally {
            ler.close(); // Fecha o Scanner para evitar vazamentos de recursos
        }
    }

    /**
     * Método para ler a porcentagem desejada para calcular a frequência cardíaca alvo.
     * 
     * @return a porcentagem desejada para calcular a frequência cardíaca alvo
     */
    public static int lerPercentagem() {
        Scanner ler = new Scanner(System.in);
        int percentagem = 50;
        while (true) {
            System.out.println("Digite uma percentagem para calcular a frequência cardíaca alvo[50-85%]:");
            percentagem = ler.nextInt();
            if (percentagem >= 50 && percentagem <= 85)
                break;
            System.out.println("ERRO: VALOR INCORRECTO");
        }
        ler.close(); // Fecha o Scanner para evitar vazamentos de recursos
        return percentagem;
    }
}