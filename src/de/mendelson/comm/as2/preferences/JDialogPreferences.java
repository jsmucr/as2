//$Header: /cvsroot/mec-as2/b47/de/mendelson/comm/as2/preferences/JDialogPreferences.java,v 1.1 2015/01/06 11:07:45 heller Exp $
package de.mendelson.comm.as2.preferences;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.util.ArrayList;
import java.util.List;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;

import de.mendelson.util.ImageButtonBar;
import de.mendelson.util.MecResourceBundle;

/*
 * Copyright (C) mendelson-e-commerce GmbH Berlin Germany
 *
 * This software is subject to the license agreement set forth in the license.
 * Please read and agree to all terms before using this software.
 * Other product and brand names are trademarks of their respective owners.
 */
/**
 * Dialog to configure a single partner
 * @author S.Heller
 * @version $Revision: 1.1 $
 */
public class JDialogPreferences extends JDialog {

    /**ResourceBundle to localize the GUI*/
    private MecResourceBundle rb = null;
    /**The language should be stored in the client preferences, no client-server comm
     * required here
     */
    private PreferencesAS2 clientPreferences = new PreferencesAS2();
    /**stores all available panels*/
    private List<PreferencesPanel> panelList = new ArrayList<PreferencesPanel>();

    /** Creates new form JDialogPartnerConfig
     *@param parameter Parameter to edit, null for a new one
     *@param parameterList List of available parameter
     */
    public JDialogPreferences(JFrame parent, List<PreferencesPanel> panelList, String selectedTab) {
        super(parent, true);
        this.panelList = panelList;
        //load resource bundle
        try {
            this.rb = (MecResourceBundle) ResourceBundle.getBundle(
                    ResourceBundlePreferences.class.getName());
        } catch (MissingResourceException e) {
            throw new RuntimeException("Oops..resource bundle " + e.getClassName() + " not found.");
        }
        initComponents();
        if (this.clientPreferences.get(PreferencesAS2.LANGUAGE).equals("de")) {
            this.jRadioButtonLangDE.setSelected(true);
        } else if (this.clientPreferences.get(PreferencesAS2.LANGUAGE).equals("en")) {
            this.jRadioButtonLangEN.setSelected(true);
        } else if (this.clientPreferences.get(PreferencesAS2.LANGUAGE).equals("fr")) {
            this.jRadioButtonLangFR.setSelected(true);
        }
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        for (PreferencesPanel preferencePanel : this.panelList) {
            //initialize the panels
            preferencePanel.loadPreferences();
            //add the panels to the layout
            this.jPanelEdit.add(preferencePanel, gridBagConstraints);
        }
        ImageButtonBar buttonBar = new ImageButtonBar(ImageButtonBar.HORIZONTAL);
        buttonBar.setPreferredButtonSize(85, 80);
        boolean selected = selectedTab == null;
        for (PreferencesPanel preferencePanel : this.panelList) {
            if( selectedTab != null && preferencePanel.getTabResource().equals( selectedTab)){
                selected = true;
            }
            buttonBar.addButton(
                    new ImageIcon(this.getClass().getResource(preferencePanel.getIconResource())),
                    this.rb.getResourceString(preferencePanel.getTabResource()),
                    new JComponent[]{preferencePanel},
                    selected);
            selected = false;
        }
        buttonBar.addButton(
                new ImageIcon(this.getClass().getResource("/de/mendelson/comm/as2/preferences/language32x32.gif")),
                this.rb.getResourceString("tab.language"),
                new JComponent[]{this.jPanelLanguage},
                false);
        buttonBar.build();
        //add button bar
        this.jPanelButtonBar.setLayout(new BorderLayout());
        this.jPanelButtonBar.add(buttonBar, BorderLayout.CENTER);
        this.getRootPane().setDefaultButton(this.jButtonOk);

    }

    private void captureGUIValues() {
        if (this.jRadioButtonLangDE.isSelected()) {
            this.clientPreferences.put(PreferencesAS2.LANGUAGE, "de");
        } else if (this.jRadioButtonLangEN.isSelected()) {
            this.clientPreferences.put(PreferencesAS2.LANGUAGE, "en");
        } else if (this.jRadioButtonLangFR.isSelected()) {
            this.clientPreferences.put(PreferencesAS2.LANGUAGE, "fr");
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroupLanguage = new javax.swing.ButtonGroup();
        jPanelEdit = new javax.swing.JPanel();
        jPanelLanguage = new javax.swing.JPanel();
        jRadioButtonLangDE = new javax.swing.JRadioButton();
        jRadioButtonLangEN = new javax.swing.JRadioButton();
        jRadioButtonLangFR = new javax.swing.JRadioButton();
        jPanelSpace = new javax.swing.JPanel();
        jLabelLanguageInfo = new javax.swing.JLabel();
        jPanelButtons = new javax.swing.JPanel();
        jButtonOk = new javax.swing.JButton();
        jPanelButtonBar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(this.rb.getResourceString( "title"));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanelEdit.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanelEdit.setLayout(new java.awt.GridBagLayout());

        jPanelLanguage.setLayout(new java.awt.GridBagLayout());

        buttonGroupLanguage.add(jRadioButtonLangDE);
        jRadioButtonLangDE.setText("Deutsch");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 5, 5);
        jPanelLanguage.add(jRadioButtonLangDE, gridBagConstraints);

        buttonGroupLanguage.add(jRadioButtonLangEN);
        jRadioButtonLangEN.setText("English");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        jPanelLanguage.add(jRadioButtonLangEN, gridBagConstraints);

        buttonGroupLanguage.add(jRadioButtonLangFR);
        jRadioButtonLangFR.setText("Fran�ais");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        jPanelLanguage.add(jRadioButtonLangFR, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanelLanguage.add(jPanelSpace, gridBagConstraints);

        jLabelLanguageInfo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelLanguageInfo.setText(this.rb.getResourceString("info.restart.client"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        jPanelLanguage.add(jLabelLanguageInfo, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanelEdit.add(jPanelLanguage, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jPanelEdit, gridBagConstraints);

        jPanelButtons.setLayout(new java.awt.GridBagLayout());

        jButtonOk.setText(this.rb.getResourceString( "button.ok" ));
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanelButtons.add(jButtonOk, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanelButtons, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanelButtonBar, gridBagConstraints);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-742)/2, (screenSize.height-526)/2, 742, 526);
    }// </editor-fold>//GEN-END:initComponents
    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        for (PreferencesPanel panel : this.panelList) {
            panel.savePreferences();
        }
        this.setVisible(false);
        this.captureGUIValues();
        this.dispose();
    }//GEN-LAST:event_jButtonOkActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupLanguage;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JLabel jLabelLanguageInfo;
    private javax.swing.JPanel jPanelButtonBar;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JPanel jPanelEdit;
    private javax.swing.JPanel jPanelLanguage;
    private javax.swing.JPanel jPanelSpace;
    private javax.swing.JRadioButton jRadioButtonLangDE;
    private javax.swing.JRadioButton jRadioButtonLangEN;
    private javax.swing.JRadioButton jRadioButtonLangFR;
    // End of variables declaration//GEN-END:variables
}
