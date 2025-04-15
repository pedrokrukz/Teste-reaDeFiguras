import javax.swing.JOptionPane;
import triangulo.Triangulo;
import retangulo.Retangulo;

public class Principal {

    public static void main(String[] args) {
        String opcao = "";
        Triangulo triangulo = new Triangulo();
        Retangulo retangulo = new Retangulo();

        while (!opcao.equals("9")) {
            opcao = JOptionPane.showInputDialog("""
                                                1 - Leitura Triângulo
                                                2 - Área do Triângulo
                                                3 - Leitura Retangulo
                                                4 - Área do Retangulo
                                                9 - Sair""");

            if (opcao == null) {
                break; 
            }

            switch (opcao) {
                case "1" -> {
                    try {
                        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo:"));
                        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo:"));
                        triangulo.setBase(base);
                        triangulo.setAltura(altura);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Entrada incorreta!");
                    }
                }
                case "2" -> JOptionPane.showMessageDialog(null, "A Área do triângulo é: " + triangulo.getArea());
                case "3" -> {
                    try {
                        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do retângulo:"));
                        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retângulo:"));
                        retangulo.setBase(base);
                        retangulo.setAltura(altura);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Entrada incorreta!");
                    }
                }
                case "4" -> JOptionPane.showMessageDialog(null, "A Área do retângul é: " + retangulo.getArea());
                case "9" -> JOptionPane.showMessageDialog(null, "Finalizando...");
                default -> JOptionPane.showMessageDialog(null, "Opção incorreta!");
            }
        }
    }
}


