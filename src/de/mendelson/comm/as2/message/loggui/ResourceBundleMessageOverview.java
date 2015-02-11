//$Header: /cvsroot/mec-as2/b47/de/mendelson/comm/as2/message/loggui/ResourceBundleMessageOverview.java,v 1.1 2015/01/06 11:07:41 heller Exp $
package de.mendelson.comm.as2.message.loggui;
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
 * @version $Revision: 1.1 $
 */
public class ResourceBundleMessageOverview extends MecResourceBundle{
    
    public Object[][] getContents() {
        return contents;
    }
    
    /**List of messages in the specific language*/
    static final Object[][] contents = {
        {"header.timestamp", "Timestamp" },
        {"header.localstation", "Local station" },        
        {"header.partner", "Partner" },
        {"header.messageid", "Message id" },
        {"header.encryption", "Encryption" },
        {"header.signature", "Signature" },
        {"header.mdn", "MDN" },            
        {"header.payload", "Payload" },    
        {"header.userdefinedid", "Id" },    
        {"number.of.attachments", "* {0} attachments *" },
    };
    
}