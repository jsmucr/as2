//$Header: /cvsroot/mec-as2/b47/de/mendelson/comm/as2/clientserver/message/ConfigurationCheckRequest.java,v 1.1 2015/01/06 11:07:39 heller Exp $
package de.mendelson.comm.as2.clientserver.message;

import java.io.Serializable;
/*
 * Copyright (C) mendelson-e-commerce GmbH Berlin Germany
 *
 * This software is subject to the license agreement set forth in the license.
 * Please read and agree to all terms before using this software.
 * Other product and brand names are trademarks of their respective owners.
 */

import de.mendelson.util.clientserver.messages.ClientServerMessage;

/**
 * Msg for the client server protocol
 *
 * @author S.Heller
 * @version $Revision: 1.1 $
 */
public class ConfigurationCheckRequest extends ClientServerMessage implements Serializable {

    public ConfigurationCheckRequest() {
    }

    @Override
    public String toString() {
        return ("Check server configuration");
    }

}
