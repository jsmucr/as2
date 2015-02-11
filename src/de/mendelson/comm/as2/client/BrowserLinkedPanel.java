//$Header: /cvsroot/mec-as2/b47/de/mendelson/comm/as2/client/BrowserLinkedPanel.java,v 1.1 2015/01/06 11:07:37 heller Exp $
package de.mendelson.comm.as2.client;

import java.awt.Cursor;
import java.awt.Desktop;
import java.net.URL;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.swing.JPanel;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.html.HTMLDocument;

/*
 * Copyright (C) mendelson-e-commerce GmbH Berlin Germany
 *
 * This software is subject to the license agreement set forth in the license.
 * Please read and agree to all terms before using this software.
 * Other product and brand names are trademarks of their respective owners.
 */
/**
 * Panel that may contain HTML Clicking onto a link will open an external browser with the URL
 * @author S.Heller
 * @version $Revision: 1.1 $
 */
public class BrowserLinkedPanel extends JPanel implements HyperlinkListener {

    private TextCycler cycler = null;

    /** Creates new form BrowserLinkedPanel */
    public BrowserLinkedPanel() {
        initComponents();
        this.jEditorPane.setContentType("text/html");
        if (Desktop.isDesktopSupported()) {
            this.jEditorPane.addHyperlinkListener(this);
        }
        String cssRule = "div {font-size: 11pt; font-family:Dialog;}";
        HTMLDocument doc = (HTMLDocument) this.jEditorPane.getDocument();
        doc.getStyleSheet().addRule(cssRule);
    }

    public void setText(String text) {
        this.jEditorPane.setText("<div>" + text + "</div>");
    }

    public void cyleText(String[] text) {
        if (this.cycler != null) {
            this.cycler.pleaseStop();
        }
        this.cycler = new TextCycler(text);
        Executors.newSingleThreadExecutor().submit(this.cycler);
    }

    /**Listen to be a HyperlinkListener*/
    @Override
    public void hyperlinkUpdate(HyperlinkEvent e) {
        if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
            URL url = e.getURL();
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().browse(url.toURI());
                } catch (Exception ex) {
                    //nop
                }
            }
        } else if (e.getEventType() == HyperlinkEvent.EventType.ENTERED) {
            this.jEditorPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        } else if (e.getEventType() == HyperlinkEvent.EventType.EXITED) {
            this.jEditorPane.setCursor(Cursor.getDefaultCursor());
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane = new javax.swing.JScrollPane();
        jEditorPane = new javax.swing.JEditorPane();

        setLayout(new java.awt.GridBagLayout());

        jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane.setMinimumSize(new java.awt.Dimension(8, 25));
        jScrollPane.setPreferredSize(new java.awt.Dimension(110, 25));

        jEditorPane.setEditable(false);
        jScrollPane.setViewportView(jEditorPane);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jScrollPane, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane;
    private javax.swing.JScrollPane jScrollPane;
    // End of variables declaration//GEN-END:variables

    private class TextCycler implements Runnable {

        private boolean cycle = true;
        private String[] text;
        private int index = 0;
        private long cycleTime = TimeUnit.MINUTES.toMillis(1);

        public TextCycler(String[] text) {
            this.text = text;
        }

        public void run() {
            while (this.cycle) {
                if (this.index > this.text.length - 1) {
                    this.index = 0;
                }
                setText(this.text[this.index++]);
                try {
                    Thread.sleep(cycleTime);
                } catch (Exception e) {
                    //nop
                }
            }
        }

        public void pleaseStop() {
            this.cycle = false;
        }
    }
}
