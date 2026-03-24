import java.util.Scanner;  //Importa a classe Scanner para ler dados do usuário via teclado.

public class TerminalAccount {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); //Cria um objeto Scanner para capturar entrada do teclado

        System.out.println("Welcome to the Bank Account System."); //Imprime a mensagem ao usuário
        System.out.println("Please enter your account number:"); //Imprime a mensagem ao usuário perguntando qual o número de sua conta.
        int accountNumber = sc.nextInt(); //Lê um número inteiro digitado pelo usuário e armazena como número da conta
        sc.nextLine(); //Consome a quebra de linha pendente do nextInt()

        System.out.println("Please enter your agency:"); //Imprime a mensagem ao usuário perguntando qual o número de sua agência.
        String agency = sc.nextLine(); //Lê a agência como texto (String), pois pode conter caracteres como hífen.
        
        System.out.println("Please enter your account holder name:"); //Imprime a mensagem ao usuário perguntando seu nome completo.
        String accountHolderName = sc.nextLine(); //Lê o nome completo do titular da conta.

        System.out.println("Please enter your initial balance:"); //Imprime a mesagem ao usuário perguntando qual o seu saldo.
        double initialBalance = sc.nextDouble(); //Lê um número decimal (saldo inicial).

        System.out.println("Account created successfully!"); //Imprime a mensagem ao usuário informando que a sua conta foi criada com sucesso.
        System.out.println("Hello " + accountHolderName + "! Thank you for creating an account in our Bank. Your agency is " + agency + " and your account number is " + accountNumber + ". Your balance is already to withdraw: $" + initialBalance); //Exibe mensagem final com os dados da conta usando concatenação de strings.

        sc.close(); //Fecha o Scanner para liberar recursos do sistema.
    }

}