public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(123, 1233);
        System.out.println(conta.getNumero());

        Cliente renan = new Cliente();
        renan.setNome("Renan Martins");
        conta.setTitular(renan);
        System.out.println(conta.getTitular().getNome());
        renan.setProfissao("Developer");
        System.out.println(conta.getTitular().getProfissao());
    }
}