// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.kuzumeji.uuo.framework.enterprise.shared;
import java.util.Locale;
import java.util.ResourceBundle;
/**
 * Core Profile.
 * @author nilcy
 */
public final class EnterpriseProfile {
  /** MAX_RESULTS. */
  public static final int MAX_RESULTS;
  /** BUNDLE_BASENAME. */
  public static final String BUNDLE_BASENAME;
  /** REPORT_TO. */
  public static final String REPORT_TO;
  /** REPORT_SUBJECT. */
  public static final String REPORT_SUBJECT;
  /** REPORT_MAILER. */
  public static final String REPORT_MAILER;
  /** コンストラクタ */
  private EnterpriseProfile() {
    super();
  }
  static {
    final ResourceBundle profile = ResourceBundle.getBundle("enterprise-profile",
      Locale.getDefault());
    MAX_RESULTS = Integer.valueOf(profile.getString("MAX_RESULTS")).intValue();
    BUNDLE_BASENAME = profile.getString("BUNDLE_BASENAME");
    REPORT_TO = profile.getString("REPORT_TO");
    REPORT_SUBJECT = profile.getString("REPORT_SUBJECT");
    REPORT_MAILER = profile.getString("REPORT_MAILER");
  }
}
