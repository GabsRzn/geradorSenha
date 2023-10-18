import javax.swing.JOptionPane;

public class EmailApp {
    public static void main(String[] args) throws Exception {
        String primeiroNome = JOptionPane.showInputDialog("Entre com o seu primeiro nome:");
        String ultimoNome = JOptionPane.showInputDialog("Entre com o seu último nome:");
        
        Email em1 = new Email(primeiroNome, ultimoNome);
        System.out.println(em1.mostrarInfo());
    }
}
