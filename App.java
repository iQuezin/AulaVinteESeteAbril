import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Sistema de calculo de IMC.");

    System.out.print("Qual o seu nome? ");
    String nome = scanner.nextLine();
    
    System.out.print("Qual a sua altura? ");
    double altura = scanner.nextDouble();

    System.out.print("Qual o seu peso? ");
    double peso = scanner.nextDouble();

    // calculo de imc

    double IMC = peso / (Math.pow(altura, 2));

    System.out.println("Nome: " + nome);
    System.out.println("Altura: " + altura);
    System.out.println("Peso: " + peso);
    
    int grauObesidade;
    if (IMC < 18.5) {
      grauObesidade = 0;
      System.out.println("Grau de obesidade: " + grauObesidade);
    } else if (IMC >= 18.5 && IMC <= 24.9) {
      grauObesidade = 0;
      System.out.println("Grau de obesidade: " + grauObesidade);
    } else if (IMC >= 25 && IMC <= 29.9) {
      grauObesidade = 1;
      System.out.println("Grau de obesidade: " + grauObesidade);
    } else if (IMC >= 30 && IMC <= 39.9) {
      grauObesidade = 2;
      System.out.println("Grau de obesidade: " + grauObesidade);
    } else if (IMC > 40) {
      grauObesidade = 3;
      System.out.println("Grau de obesidade: " + grauObesidade);
    }

    System.out.print("Deseja fazer um teste de percentual de gordura? (sim / nao) ");
    String teste = scanner.next();

    switch (teste) {
        case "sim":
            
            System.out.println("Forneça algumas informações com base na fita métrica.");
            System.out.println("Sexo: (maculino / feminino)");
            String sexo = scanner.next();
            
            switch (sexo) {
                case "masculino":
                System.out.print("Pescoço: ");
                double pescoco = scanner.nextDouble();

                System.out.print("Cintura: ");
                double cintura = scanner.nextDouble();

                System.out.print("Altura: ");
                double alturaMetro = scanner.nextDouble();

                double cinturaPescoco = cintura - pescoco;

                double resultado = (495 / (1.0324 - 0.19077 * Math.log10(cinturaPescoco) + 0.15456 * Math.log10(alturaMetro))-450);
                System.out.printf("Percentual gordura: %.2f", resultado);
                break;

                case "feminino":
                System.out.print("Pescoço: ");
                double pescocof = scanner.nextDouble();

                System.out.print("Cintura: ");
                double cinturaf = scanner.nextDouble();

                System.out.println("Quadril: ");
                double quadril = scanner.nextDouble();

                System.out.print("Altura: ");
                double alturaMetrof = scanner.nextDouble();

                double QuadCintPesc = quadril + cinturaf - pescocof;

                double calculo = (495 / 1.29579 - 0.35004 * Math.log10(QuadCintPesc) + 0.22100 * Math.log10(alturaMetrof))-450;

                System.out.printf("Percentual gordura: %.2f", calculo);
                break;
            }
            

            case "nao": 
            System.out.println("\nOk, encerrando programa.");
            break;

            default:
            System.out.println("A palavra escrita é inválida!");
        }

        scanner.close();
    }

    
  }
