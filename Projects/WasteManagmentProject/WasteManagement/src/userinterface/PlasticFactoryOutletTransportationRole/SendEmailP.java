/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PlasticFactoryOutletTransportationRole;
import Business.Enterprise.Enterprise;
import Business.Organization.GarbageCollectionManagerOrganization;
import Business.Organization.PlasticFactoryOutletTransportationOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GarbageManagerWorkRequest;
import java.awt.CardLayout;
import java.io.File;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author pranalinarkar
 */
public class SendEmailP extends javax.swing.JPanel {
private JPanel userProcessContainer;
    private PlasticFactoryOutletTransportationOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private GarbageCollectionManagerOrganization gco;
    private GarbageManagerWorkRequest gm;
    /**
     * Creates new form SendEmail
     */
    public SendEmailP(JPanel userProcessContainer, UserAccount userAccount, PlasticFactoryOutletTransportationOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        jButton1.setBorder(BorderFactory.createEmptyBorder());
        jButton1.setContentAreaFilled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSubject = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jAttach = new javax.swing.JButton();
        jPathA = new javax.swing.JTextField();
        name_attach = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/emailicon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 100, 70));

        jTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToActionPerformed(evt);
            }
        });
        add(jTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 122, 136, -1));

        jLabel2.setText("To");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 125, -1, -1));
        add(jSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 160, 136, -1));

        jLabel3.setText("Subject");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 163, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 198, 254, 229));

        jAttach.setText("Attachment");
        jAttach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAttachActionPerformed(evt);
            }
        });
        add(jAttach, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 339, 157, -1));
        add(jPathA, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 373, 157, -1));

        name_attach.setText("attach_name");
        name_attach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_attachActionPerformed(evt);
            }
        });
        add(name_attach, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 405, 157, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 404, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Email");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 43, -1, 39));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
        
        
        
        
        String to=jTo.getText();
        String subject=jSubject.getText();
        String textf=jTextArea1.getText();
        
        
        
       if (!isValidEmailAddress(to)){
         
    JOptionPane.showMessageDialog(null, "Invalid Email Address");
    return;
    }
       
       if(jSubject.equals("")||jTextArea1.equals("")||name_attach.equals("")){
       JOptionPane.showMessageDialog(null, "Fields Cannot be empty");
    return;
       
       }
        Properties properties = System.getProperties();

          properties.put("mail.smtp.starttls.enable", "true"); 
          properties.put("mail.smtp.host", "smtp.gmail.com");

          properties.put("mail.smtp.port", "587");
          properties.put("mail.smtp.auth", "true");
          
        
//        
//        Properties props = new Properties();
//props.put("mail.smtp.host", "smtp.gmail.com");
//props.put("mail.smtp.socketFactory.port", "465");
//props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
//props.put("mail.smtp.auth", "true");
//props.put("mail.smtp.port", "465");
        Session session = Session.getDefaultInstance(properties, 
                
                
                new javax.mail.Authenticator() {
                    
                    protected PasswordAuthentication getPasswordAuthentication(){
                    
                    return new PasswordAuthentication("pranali.narkar017@gmail.com", "Windows@123");}
});
        
        
        try{
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("pranali.narkar017@gmail.com"));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
        message.setSubject(subject);
            MimeBodyPart mbp= new MimeBodyPart();
             mbp.setText(textf);
             Multipart mp= new MimeMultipart() ;
             mp.addBodyPart(mbp);
             
             mbp=new MimeBodyPart();
             javax.activation.DataSource s= new FileDataSource(attachment_path);
             mbp.setDataHandler(new DataHandler(s));
             
             mbp.setFileName(name_attach.getText());
              mp.addBodyPart(mbp);
              message.setContent(mp);
        Transport.send(message);
        
         
        JOptionPane.showMessageDialog(null, "Message Sent");
       
        
        } catch (Exception e){
        
            JOptionPane.showMessageDialog(null, e);
        }
       
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToActionPerformed

    private void jAttachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAttachActionPerformed
        JFileChooser c= new JFileChooser();
        c.showOpenDialog(null);
        File f=c.getSelectedFile();
        attachment_path=f.getAbsolutePath();
        jPathA.setText(attachment_path);
        
                
    }//GEN-LAST:event_jAttachActionPerformed

    private void name_attachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_attachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_attachActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

public static boolean isValidEmailAddress(String email) {
   boolean result = true;
   try {
      InternetAddress emailAddr = new InternetAddress(email);
      emailAddr.validate();
   } catch (AddressException ex) {
      result = false;
   }
   return result;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jAttach;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jPathA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSubject;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTo;
    private javax.swing.JTextField name_attach;
    // End of variables declaration//GEN-END:variables
String attachment_path; //globalvariable
private File file;


}
