public class ContaBanco {
        public int numConta;
        protected String tipo;
        private String dono;
        private float saldo;
        private boolean status;

        public void StatusContaBanco() {
            System.out.println("Status da Conta");
            System.out.println("Conta: " + this.numConta);
            System.out.println("Tipo: " + this.tipo);
            System.out.println("Dono: " + this.dono);
            System.out.println("Saldo: " + this.saldo);
            System.out.println("Status: " + this.status);
        }
        public void abrirConta(String tipo) {
            this.status = true;
//            Temos 2 tipos de conta()
            this.tipo = tipo;
        }
        public void fecharConta() {
            this.status = false;
        }
        public void depositar(float valor) {

        }
        public void sacar(float valor) {

        }
        public void  pagarMensal(){

        }
}
