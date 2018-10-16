package com.guina.uteis;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author agnaldo
 */
public class uteis {

    public static int confirma(String msg, String titulo, String[] opcoes, int selecao) {
        int escolha = JOptionPane.showOptionDialog(null, msg, titulo, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, opcoes, opcoes[selecao]);
        return escolha;
    }

    public static void entraCampo(java.awt.event.FocusEvent evt) {
        if (evt.getSource() instanceof JTextField) {
            ((JTextField) evt.getSource()).setBackground(Color.YELLOW);
        } else if (evt.getSource() instanceof JComboBox) {
            ((JComboBox) evt.getSource()).setBackground(Color.YELLOW);
        } else if (evt.getSource() instanceof JTextArea) {
            ((JTextArea) evt.getSource()).setBackground(Color.YELLOW);
        }
    }
    
    public static void saiCampo(java.awt.event.FocusEvent evt) {
        if (evt.getSource() instanceof JTextField) {
            ((JTextField) evt.getSource()).setBackground(Color.WHITE);
        } else if (evt.getSource() instanceof JComboBox) {
            ((JComboBox) evt.getSource()).setBackground(Color.WHITE);
        } else if (evt.getSource() instanceof JTextArea) {
            ((JTextArea) evt.getSource()).setBackground(Color.WHITE);
        }
    }
    //Letras maiscula
    public static void maiscula(java.awt.event.KeyEvent evt) {                                      
       JTextField tf = (JTextField) evt.getComponent();  
       if (evt.getKeyCode()!=32 & evt.getKeyCode()!=8 & evt.getKeyCode()!=37 & evt.getKeyCode()!=39)  
           tf.setText(tf.getText().toUpperCase());  
   }  
    
 public static boolean validar(String email)
    {
        boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        return isEmailIdValid;
    }
    

}