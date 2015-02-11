//$Header: /cvsroot/mec-as2/b47/de/mendelson/comm/as2/preferences/PreferencesPanelMDN.java,v 1.1 2015/01/06 11:07:45 heller Exp $
package de.mendelson.comm.as2.preferences;
import de.mendelson.util.*;
import de.mendelson.util.clientserver.BaseClient;
import de.mendelson.util.clientserver.clients.preferences.PreferencesClient;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/*
 * Copyright (C) mendelson-e-commerce GmbH Berlin Germany
 *
 * This software is subject to the license agreement set forth in the license.
 * Please read and agree to all terms before using this software.
 * Other product and brand names are trademarks of their respective owners.
 */
/**
 *Panel to define the MDN preferences
 * @author S.Heller
 * @version: $Revision: 1.1 $
 */
public class PreferencesPanelMDN extends PreferencesPanel {
    
    /**Localize the GUI*/
    private MecResourceBundle rb = null;
    
    /**GUI prefs*/
    private PreferencesClient preferences;
    
    /** Creates new form PreferencesPanelDirectories */
    public PreferencesPanelMDN( BaseClient baseClient) {
        //load resource bundle
        try{
            this.rb = (MecResourceBundle)ResourceBundle.getBundle(
                    ResourceBundlePreferences.class.getName() );
        } catch ( MissingResourceException e ) {
            throw new RuntimeException( "Oops..resource bundle "
                    + e.getClassName() + " not found." );
        }
        this.preferences = new PreferencesClient(baseClient);
        this.initComponents();
    }
    
    /**Sets new preferences to this panel to changes/modify
     */
    @Override
    public void loadPreferences(){
        this.jTextFieldAsyncMDNTimeout.setText( this.preferences.get( PreferencesAS2.ASYNC_MDN_TIMEOUT ));
        this.jTextFieldSendHttpTimeout.setText( this.preferences.get( PreferencesAS2.HTTP_SEND_TIMEOUT ));
        this.jTexFieldRetryCount.setText( this.preferences.get( PreferencesAS2.MAX_CONNECTION_RETRY_COUNT ));
        this.jTextFieldRetryWaittime.setText( this.preferences.get( PreferencesAS2.CONNECTION_RETRY_WAIT_TIME_IN_S ));
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabelMinutes = new javax.swing.JLabel();
        jPanelSpace = new javax.swing.JPanel();
        jLabelAsyncMDNTimeout = new javax.swing.JLabel();
        jTextFieldSendHttpTimeout = new javax.swing.JTextField();
        jLabelHttpSendTimeout = new javax.swing.JLabel();
        jTextFieldAsyncMDNTimeout = new javax.swing.JTextField();
        jLabelMilliseconds = new javax.swing.JLabel();
        jLabelConnectionRetryCount = new javax.swing.JLabel();
        jTexFieldRetryCount = new javax.swing.JTextField();
        jLabelConnectionRetryTime = new javax.swing.JLabel();
        jTextFieldRetryWaittime = new javax.swing.JTextField();
        jLabelSeconds = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        jLabelMinutes.setText(this.rb.getResourceString( "label.min"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 5);
        add(jLabelMinutes, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        add(jPanelSpace, gridBagConstraints);

        jLabelAsyncMDNTimeout.setText(this.rb.getResourceString( "label.asyncmdn.timeout"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        add(jLabelAsyncMDNTimeout, gridBagConstraints);

        jTextFieldSendHttpTimeout.setPreferredSize(new java.awt.Dimension(50, 20));
        jTextFieldSendHttpTimeout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSendHttpTimeoutKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 15, 5);
        add(jTextFieldSendHttpTimeout, gridBagConstraints);

        jLabelHttpSendTimeout.setText(this.rb.getResourceString( "label.httpsend.timeout"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 15, 5);
        add(jLabelHttpSendTimeout, gridBagConstraints);

        jTextFieldAsyncMDNTimeout.setPreferredSize(new java.awt.Dimension(50, 20));
        jTextFieldAsyncMDNTimeout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldAsyncMDNTimeoutKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        add(jTextFieldAsyncMDNTimeout, gridBagConstraints);

        jLabelMilliseconds.setText("ms");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 15, 5);
        add(jLabelMilliseconds, gridBagConstraints);

        jLabelConnectionRetryCount.setText(this.rb.getResourceString( "label.retry.max"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabelConnectionRetryCount, gridBagConstraints);

        jTexFieldRetryCount.setPreferredSize(new java.awt.Dimension(50, 20));
        jTexFieldRetryCount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTexFieldRetryCountKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jTexFieldRetryCount, gridBagConstraints);

        jLabelConnectionRetryTime.setText(this.rb.getResourceString( "label.retry.waittime"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabelConnectionRetryTime, gridBagConstraints);

        jTextFieldRetryWaittime.setPreferredSize(new java.awt.Dimension(50, 20));
        jTextFieldRetryWaittime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldRetryWaittimeKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jTextFieldRetryWaittime, gridBagConstraints);

        jLabelSeconds.setText(this.rb.getResourceString( "label.sec"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 5);
        add(jLabelSeconds, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
        
    private void jTextFieldSendHttpTimeoutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSendHttpTimeoutKeyReleased
        try{
            int value = Integer.valueOf( this.jTextFieldSendHttpTimeout.getText().trim() ).intValue();
            this.preferences.putInt( PreferencesAS2.HTTP_SEND_TIMEOUT, value );
        } catch( NumberFormatException e ){
            //nop
        }
}//GEN-LAST:event_jTextFieldSendHttpTimeoutKeyReleased

    private void jTextFieldAsyncMDNTimeoutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAsyncMDNTimeoutKeyReleased
       try{
            int value = Integer.valueOf( this.jTextFieldAsyncMDNTimeout.getText().trim() ).intValue();
            this.preferences.putInt( PreferencesAS2.ASYNC_MDN_TIMEOUT, value );
        } catch( NumberFormatException e ){
            //nop
        }
}//GEN-LAST:event_jTextFieldAsyncMDNTimeoutKeyReleased

    private void jTexFieldRetryCountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTexFieldRetryCountKeyReleased
        try{
            int value = Integer.valueOf( this.jTexFieldRetryCount.getText().trim() ).intValue();
            this.preferences.putInt( PreferencesAS2.MAX_CONNECTION_RETRY_COUNT, value );
        } catch( NumberFormatException e ){
            //nop
        }
    }//GEN-LAST:event_jTexFieldRetryCountKeyReleased

    private void jTextFieldRetryWaittimeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRetryWaittimeKeyReleased
        try{
            int value = Integer.valueOf( this.jTextFieldRetryWaittime.getText().trim() ).intValue();
            this.preferences.putInt( PreferencesAS2.CONNECTION_RETRY_WAIT_TIME_IN_S, value );
        } catch( NumberFormatException e ){
            //nop
        }
    }//GEN-LAST:event_jTextFieldRetryWaittimeKeyReleased
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAsyncMDNTimeout;
    private javax.swing.JLabel jLabelConnectionRetryCount;
    private javax.swing.JLabel jLabelConnectionRetryTime;
    private javax.swing.JLabel jLabelHttpSendTimeout;
    private javax.swing.JLabel jLabelMilliseconds;
    private javax.swing.JLabel jLabelMinutes;
    private javax.swing.JLabel jLabelSeconds;
    private javax.swing.JPanel jPanelSpace;
    private javax.swing.JTextField jTexFieldRetryCount;
    private javax.swing.JTextField jTextFieldAsyncMDNTimeout;
    private javax.swing.JTextField jTextFieldRetryWaittime;
    private javax.swing.JTextField jTextFieldSendHttpTimeout;
    // End of variables declaration//GEN-END:variables
   

    @Override
    public void savePreferences() {
        //NOP
    }

    @Override
    public String getIconResource() {
       return( "/de/mendelson/comm/as2/preferences/preferences32x32.gif" );
    }

    @Override
    public String getTabResource() {
        return( "tab.misc" );
    }
    
}
