import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    /* Declaración de todas la variables y elementos que se usarán
     * durante toda la ejecución del código.*/
    private JPanel panel;
    private JTextPane textPane1;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;
    private JButton boton7;
    private JButton boton8;
    private JButton boton9;
    private JButton boton0;
    private JButton botonSuma;
    private JButton botonResta;
    private JButton botonDivision;
    private JButton botonMultiplicacion;
    private JButton botonIgual;
    private JButton botonClear;
    private static String valor1 = "0";
    private static boolean estadoValor1 = false;
    private static String valor2 = "0";
    private static boolean estadoOperador = false;
    private static String pantalla = "";
    private static int resultado;

    //Funciones de cada uno de los botones
    public Calculadora() {
        // Acciones que realizan cada uno de los botones numéricos al ser pulsados.
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!estadoValor1){
                    valor1 += "1";
                    pantalla += "1";
                }else{
                    valor2 += "1";
                    pantalla += "1";
                }
                textPane1.setText(pantalla);
            }
        });
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!estadoValor1){
                    valor1 += "2";
                    pantalla += "2";
                }else{
                    valor2 += "2";
                    pantalla += "2";
                }
                textPane1.setText(pantalla);
            }
        });
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!estadoValor1){
                    valor1 += "3";
                    pantalla += "3";
                }else{
                    valor2 += "3";
                    pantalla += "3";
                }
                textPane1.setText(pantalla);
            }
        });
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!estadoValor1){
                    valor1 += "4";
                    pantalla += "4";
                }else{
                    valor2 += "4";
                    pantalla += "4";
                }
                textPane1.setText(pantalla);
            }
        });
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!estadoValor1){
                    valor1 += "5";
                    pantalla += "5";
                }else{
                    valor2 += "5";
                    pantalla += "5";
                }
                textPane1.setText(pantalla);
            }
        });
        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!estadoValor1){
                    valor1 += "6";
                    pantalla += "6";
                }else{
                    valor2 += "6";
                    pantalla += "6";
                }
                textPane1.setText(pantalla);
            }
        });
        boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!estadoValor1){
                    valor1 += "7";
                    pantalla += "7";
                }else{
                    valor2 += "7";
                    pantalla += "7";
                }
                textPane1.setText(pantalla);
            }
        });
        boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!estadoValor1){
                    valor1 += "8";
                    pantalla += "8";
                }else{
                    valor2 += "8";
                    pantalla += "8";
                }
                textPane1.setText(pantalla);
            }
        });
        boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!estadoValor1){
                    valor1 += "9";
                    pantalla += "9";
                }else{
                    valor2 += "9";
                    pantalla += "9";
                }
                textPane1.setText(pantalla);
            }
        });
        boton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!estadoValor1){
                    valor1 += "0";
                    pantalla += "0";
                }else{
                    valor2 += "0";
                    pantalla += "0";
                }
                textPane1.setText(pantalla);
            }
        });
        /* Botones de acción (Suma, resta...). Comprueba si se ha introducido después del valor1 o
         * después del valor2. Dependiento de eso, realizará una acción u otra.*/
        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!estadoOperador) {
                    estadoValor1 = true;
                    pantalla += "+";
                    estadoOperador = true;
                } else {
                    pantalla = (resultado(pantalla))+"+";
                }
                textPane1.setText(pantalla);
            }
        });
        botonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!estadoOperador) {
                    estadoValor1 = true;
                    pantalla += "-";
                    estadoOperador = true;
                } else {
                    pantalla = (resultado(pantalla))+"-";
                }
                textPane1.setText(pantalla);
            }
        });
        botonMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!estadoOperador) {
                    estadoValor1 = true;
                    pantalla += "*";
                    estadoOperador = true;
                } else {
                    valor2 = "";
                    pantalla = (resultado(pantalla))+"*";
                }
                textPane1.setText(pantalla);
            }
        });
        botonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!estadoOperador) {
                    estadoValor1 = true;
                    pantalla += "/";
                    estadoOperador = true;
                } else {
                    valor2 = "";
                        pantalla = (resultado(pantalla))+"/";
                }
                textPane1.setText(pantalla);
            }
        });
        botonIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane1.setText(String.valueOf(resultado(pantalla)));
                reset();
            }
        });
        botonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane1.setText("");
                reset();
            }
        });
    }

    //Función principal de la clase.
    public static void main() {
        final JFrame frame = new JFrame("AppPrueba");
        frame.setContentPane(new Calculadora().panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }

    public static int suma (int valor1, int valor2) {
        return valor1 + valor2;
    }
    public static int resta (int valor1, int valor2) {
        return valor1 - valor2;
    }
    public static int multiplicacion (int valor1, int valor2) {
        return valor1 * valor2;
    }
    public static int division (int valor1, int valor2) {
        return valor1 / valor2;
    }
    public String resultado(String pantalla){
        if(valor1.isEmpty() || valor2.isEmpty()){
            textPane1.setText("SYNTAX ERROR :(");
        }else if (pantalla.contains("+")){
            return String.valueOf(Integer.parseInt(valor1) + Integer.parseInt(valor2));
        }else if (pantalla.contains("-")){
            return String.valueOf(Integer.parseInt(valor1) - Integer.parseInt(valor2));
        } else if (pantalla.contains("*")) {
            return String.valueOf(Integer.parseInt(valor1) * Integer.parseInt(valor2));
        }else if (pantalla.contains("/")){
            //Realiza la división, si esta da error devuelve "SYNTAX ERROR :)"
            try {
                return String.valueOf(Integer.parseInt(valor1) / Integer.parseInt(valor2));
            }catch(Exception e1){
                return "SYNTAX ERROR :(";
            }
            //Si no se realiza ninguna operación se devuelve siempre error.
        }else{
            return "ERROR";
        }
        return "ERROR";
    }
    public static void reset(){
        //Reinicia todos los valores.
        valor1 = "";
        valor2 = "";
        pantalla = "";
        estadoOperador = false;
        estadoValor1 = false;
        resultado = 0;
    }
}
