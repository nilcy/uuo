// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.kuzumeji.uuo.framework.enterprise.shared;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
/**
 * Faces Helper.
 * @author nilcy
 */
public final class EnterpriseBundle {
  /** コンストラクタ */
  private EnterpriseBundle() {
  }
  /**
   * bundle.
   * @return bundle
   */
  private static ResourceBundle getBundle() {
    return ResourceBundle.getBundle(EnterpriseProfile.BUNDLE_BASENAME, Locale.getDefault());
  }
  /**
   * bundle message.
   * @param aKey key
   * @return bundle message
   */
  public static String getMessage(final String aKey) {
    return getBundle().getString(aKey);
  }
  /**
   * Format bundle message.
   * @param aKey key
   * @param aValues values
   * @return bundle message
   */
  public static String formatMessage(final String aKey, final Object... aValues) {
    return MessageFormat.format(getMessage(aKey), aValues);
  }
}
