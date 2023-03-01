/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class TugasRumah1 {
  public static void main(String[] args){
       JFrame j = new JFrame ("JFrame Pertamaku");
       JLabel name = new JLabel();
       name.setText("Nama");
       name.setBounds(50, 100, 100, 30);
       j.add(name);
       
       JLabel noHp = new JLabel();
       noHp.setText("No Hp");
       noHp.setBounds(50, 150, 100, 30);
       j.add(noHp);
       
        JLabel alamat = new JLabel();
       alamat.setText("Alamat");
       alamat.setBounds(50, 200, 100, 30);
       j.add(alamat);
       
       JLabel jekel = new JLabel();
        jekel.setText("Jenis Kelamin");
        jekel.setBounds(50, 250, 100, 30);
        j.add(jekel);
       
       JLabel tglLahir = new JLabel();
       tglLahir.setText("Tanggal Lahir");
       tglLahir.setBounds(50, 300, 100, 30);
       j.add(tglLahir);
       
       
       
       JTextField nameTxt = new JTextField();
       nameTxt.setBounds(150, 100, 200, 30);
       j.add(nameTxt);
       
        JTextField noHpTxt = new JTextField();
       noHpTxt.setBounds(150, 150, 200, 30);
       j.add(noHpTxt);
       
       JTextField alamatTxt = new JTextField();
       alamatTxt.setBounds(150, 200, 200, 30);
       j.add(alamatTxt);
       
       JRadioButton r1=new JRadioButton("Laki-Laki");    
        JRadioButton r2=new JRadioButton("Perempuan");    
        r1.setBounds(150, 230, 100, 30);    
        r2.setBounds(150, 260, 100, 30);    
        ButtonGroup bg=new ButtonGroup();    
        bg.add(r1);bg.add(r2);    
        j.add(r1);j.add(r2);
       
       JTextField tglLahirTxt = new JTextField();
       tglLahirTxt.setBounds(150, 300, 200, 30);
       j.add(tglLahirTxt);
       
       JTextArea testTxt = new JTextArea();
       testTxt.setBounds(150, 350, 200, 140);
       j.add(testTxt);
        
       JButton registrasiButton = new JButton();
       registrasiButton.setText("Registrasi");
       registrasiButton.setBounds(150, 500, 100, 30);
       j.add(registrasiButton);
       
       j.setSize(800, 800);
       j.setLayout(null);
       j.setVisible(true);
   }    
}
