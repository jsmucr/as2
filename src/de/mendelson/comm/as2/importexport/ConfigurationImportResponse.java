//$Header: /cvsroot/mec-as2/b47/de/mendelson/comm/as2/importexport/ConfigurationImportResponse.java,v 1.1 2015/01/06 11:07:40 heller Exp $
package de.mendelson.comm.as2.importexport;

import java.io.Serializable;
/*
 * Copyright (C) mendelson-e-commerce GmbH Berlin Germany
 *
 * This software is subject to the license agreement set forth in the license.
 * Please read and agree to all terms before using this software.
 * Other product and brand names are trademarks of their respective owners.
 */

import de.mendelson.util.clientserver.clients.datatransfer.UploadResponseFile;

/**
 * Msg for the client server protocol
 * @author S.Heller
 * @version $Revision: 1.1 $
 */
public class ConfigurationImportResponse extends UploadResponseFile implements Serializable {

    public ConfigurationImportResponse(ConfigurationImportRequest request) {
        super(request);
    }

    @Override
    public String toString() {
        return ("Import response");
    }
}
