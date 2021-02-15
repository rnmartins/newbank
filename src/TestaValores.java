public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(123, 1000);
        System.out.println(conta.getAgencia());
        conta.setAgencia(1234444);

        Conta conta2 = new Conta(133, 23444);

        System.out.println(Conta.getTotal());
    }
}
