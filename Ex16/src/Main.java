public class Main {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco();
        conta1.setDono("Gabriel Bomfim Mota da Silva");
        conta1.setNumConta(1234);
        conta1.abrirConta("CC");
        conta1.depositar(100);
        conta1.StatusContaBanco();
        conta1.sacar(100);
        System.out.println("");
        ContaBanco conta2 = new ContaBanco();
        conta2.setDono("Silva");
        conta2.setNumConta(3333);
        conta2.abrirConta("CP");
        conta2.depositar(300);
        conta2.StatusContaBanco();

// ctrl + enter envia o commit e o push sem precisar clicar
// ctrl + / comentario ctrl + shift + / comentarios grandes
// ctrl + backspace apaga tudo atrás


    }
}