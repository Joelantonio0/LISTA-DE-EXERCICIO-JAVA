import java.util.Scanner;

/**
 * 
 * Classe principal que solicita informações do usuário para criar um objeto healthProfile e exibir informações sobre ele. Calcula-se o IMC, Idade em Anos, Frequência cardíaca máxima e alvo.
 * @author Joel António
 * @version 1.0
 */
public class Main {
    /**
     * Método principal que solicita informações do usuário, cria um objeto healthProfile e exibe informações sobre ele.
     * 
     * @param args os argumentos de linha de comando (não são usados neste programa)
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome, sobrenome, mes;
        int dia, ano;
        float altura, peso;
        Genero genero;
        try {
            // Solicita informações do usuário
            System.out.print("Digite seu nome:");
            nome = ler.nextLine();
            System.out.print("Digite seu sobrenome:");
            sobrenome = ler.nextLine();
            System.out.print("Genero\n1-MASCULINO\n2-FEMENINO\n3-OUTRO\n");
            int escolha=ler.nextInt();
            if(escolha==1)
                genero= Genero.MASCULINO;
            else if(escolha==2)
                genero= Genero.FEMENINO;
            else
                genero = Genero.OUTRO;
            System.out.print("Dia:");
            dia = ler.nextInt();
            System.out.print("Mês:");
            mes = ler.next();
            System.out.print("Ano:");
            ano = ler.nextInt();
            System.out.print("Digite sua altura:");
            altura = ler.nextFloat();
            System.out.print("Digite seu peso:");
            peso = ler.nextFloat();
            
            DataNascimento dataNascimento = new DataNascimento(dia, mes, ano);
            HealthProfile healthProfile = new HealthProfile(nome, sobrenome, dataNascimento, genero, altura, peso);
            
            // Exibe informações do objeto HealthProfile
            System.out.println("==============IMPRIMIR A PARTIR DO OBJECTO=============");
            System.out.println("Nome Completo:" + healthProfile.getNome() + " " + healthProfile.getSobrenome() + "\nDia: "
                    + HealthProfile.dataNascimento.getDia() + "| Genero:"+healthProfile.getGenero()+ "| Altura:"+healthProfile.getAltura()+"| Peso:"+healthProfile.getPeso()+"| Mês: " + HealthProfile.dataNascimento.getMes() + "| Ano:"
                    + HealthProfile.dataNascimento.getAno() + "\n=====================================================");
            System.out.println("Idade em anos:" + healthProfile.calcularIdadeEmAnos());
            System.out.println("IMC:" + healthProfile.calcularIMC());
            System.out.println("==================FREQUÊNCIAS=======================");
            System.out.println("Frequência Cardíaca Máxima:" + healthProfile.calcularFrenquenciaCardMax());
            System.out.println("Frequência Cardíaca Alvo:" + healthProfile.calcularFrequenciaCardAlvo(lerPercentagem()));
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