import java.util.Scanner;

public class Conta {

    private String nome;
    private double saldo = 100;

    private double saldoInvestido;

    public void resgate(){
        boolean success = false;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Defina o valor do regaste");
            double resgate = scan.nextDouble();
            if (this.getSaldo() < resgate){
                System.out.println("Valor de resgate é maior que o saldo da conta (" +this.getSaldo() +  ")!");
                continue;
            }
            this.setSaldo(this.getSaldo() - resgate);
            System.out.println("Voce resgatou o seguinte saldo da conta:" + resgate);
            success = true;
        } while (!success);

    }

    public void deposito(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Defina o valor do depósito");
        double deposito = scan.nextDouble();
        this.setSaldo(this.getSaldo() + deposito);
        System.out.println("Voce adicionou o seguinte saldo da conta: " +deposito);
    }

    public void investir(){
        boolean success = false;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Defina o valor para investir");
            double investimento = scan.nextDouble();
            if (this.saldo < investimento){
                System.out.println("Valor fornecido é maior que o saldo da conta (" +this.saldo +  ")!");
                continue;
            }
            this.setSaldo(this.saldo - investimento);
            this.setSaldoInvestido(this.saldoInvestido + investimento);
            System.out.println("Voce investiu o seguinte saldo da conta:" + investimento);
            success = true;
        } while (!success);
    }

    public void bonus(){
        this.saldoInvestido += this.saldoInvestido * 0.05;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoInvestido() {
        return saldoInvestido;
    }

    public void setSaldoInvestido(double saldo_investido) {
        this.saldoInvestido = saldo_investido;
    }
}