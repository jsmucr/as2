//$Header: /cvsroot/mec-as2/b47/de/mendelson/comm/as2/sendorder/ResourceBundleSendOrderSender_fr.java,v 1.1 2015/01/06 11:07:49 heller Exp $
package de.mendelson.comm.as2.sendorder;
import de.mendelson.util.MecResourceBundle;
/*
 * Copyright (C) mendelson-e-commerce GmbH Berlin Germany
 *
 * This software is subject to the license agreement set forth in the license.
 * Please read and agree to all terms before using this software.
 * Other product and brand names are trademarks of their respective owners.
 */

/**
 * ResourceBundle to localize a mendelson product
 * @author S.Heller
 * @author E.Pailleau
 * @version $Revision: 1.1 $
 */
public class ResourceBundleSendOrderSender_fr extends MecResourceBundle{
    
    public Object[][] getContents() {
        return contents;
    }
    
    /**List of messages in the specific language*/
    static final Object[][] contents = {
        {"message.packed", "{0}: Message AS2 sortant cr�� avec \"{1}\" du destinataire \"{2}\" dans {4}, taille brute du message: {3}" },
    };
    
}
