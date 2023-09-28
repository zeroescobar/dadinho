/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas;

import javax.swing.JTextField;

/**
 *
 * @author Aluno
 */
public class utils {
    public static void OnlyNumber(java.awt.event.KeyEvent evt){
        JTextField sujeito = (JTextField) evt.getComponent();
        if(evt.getKeyCode() < 48 || evt.getKeyCode() > 57){
            sujeito.setEditable(false);
        }else{
            sujeito.setEditable(true);
            
        }
    }
}
