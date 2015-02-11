//$Header: /cvsroot/mec-as2/b47/de/mendelson/util/security/cert/gui/ResourceBundleInfoOnExternalCertificate_fr.java,v 1.1 2015/01/06 11:07:59 heller Exp $
package de.mendelson.util.security.cert.gui;

import de.mendelson.util.MecResourceBundle;
/*
 * Copyright (C) mendelson-e-commerce GmbH Berlin Germany
 *
 * This software is subject to the license agreement set forth in the license.
 * Please read and agree to all terms before using this software.
 * Other product and brand names are trademarks of their respective owners.
 */

/**
 * ResourceBundle to localize gui entries
 *
 * @author S.Heller
 * @author E.Pailleau
 * @version $Revision: 1.1 $
 */
public class ResourceBundleInfoOnExternalCertificate_fr extends MecResourceBundle {

    public Object[][] getContents() {
        return contents;
    }

    /**
     * List of messages in the specific language
     */
    static final Object[][] contents = {
        {"button.ok", "Importer >>"},
        {"button.cancel", "Annuler"},
        {"title.single", "Info sur le certificat externe"},
        {"title.multiple", "Info sur les certificats externe"},
        {"certinfo.certfile", "Dossier de certificat: {0}"},
        {"certinfo.index", "Certificat {0} de {1}"},
    };

}
