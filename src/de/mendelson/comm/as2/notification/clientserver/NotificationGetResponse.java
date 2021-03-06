//$Header: /cvsroot/mec-as2/b47/de/mendelson/comm/as2/notification/clientserver/NotificationGetResponse.java,v 1.1 2015/01/06 11:07:42 heller Exp $
package de.mendelson.comm.as2.notification.clientserver;

import java.io.Serializable;
/*
 * Copyright (C) mendelson-e-commerce GmbH Berlin Germany
 *
 * This software is subject to the license agreement set forth in the license.
 * Please read and agree to all terms before using this software.
 * Other product and brand names are trademarks of their respective owners.
 */

import de.mendelson.comm.as2.notification.NotificationData;
import de.mendelson.util.clientserver.messages.ClientServerResponse;

/**
 * Msg for the client server protocol
 *
 * @author S.Heller
 * @version $Revision: 1.1 $
 */
public class NotificationGetResponse extends ClientServerResponse implements Serializable {

    private NotificationData data = null;

    public NotificationGetResponse(NotificationGetRequest request) {
        super(request);
    }

    @Override
    public String toString() {
        return ("Get notification data");
    }

    /**
     * @return the data
     */
    public NotificationData getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(NotificationData data) {
        this.data = data;
    }

}
