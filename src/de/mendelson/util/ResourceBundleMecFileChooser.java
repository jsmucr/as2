//$Header: /cvsroot/mec-as2/b47/de/mendelson/util/ResourceBundleMecFileChooser.java,v 1.1 2015/01/06 11:07:51 heller Exp $
package de.mendelson.util;
/*
 * Copyright (C) mendelson-e-commerce GmbH Berlin Germany
 *
 * This software is subject to the license agreement set forth in the license.
 * Please read and agree to all terms before using this software.
 * Other product and brand names are trademarks of their respective owners.
 */


/** 
 * ResourceBundle to localize the file chooser GUI - if you want to localize 
 * eagle to your language, please contact us: localize@mendelson.de
 * @author  S.Heller
 * @version $Revision: 1.1 $
 */
public class ResourceBundleMecFileChooser extends MecResourceBundle{

  public Object[][] getContents() {
    return contents;
  }

   /**List of messages in the specific language*/
  static final Object[][] contents = {
    {"button.select", "Select"},   
  };		
  
}