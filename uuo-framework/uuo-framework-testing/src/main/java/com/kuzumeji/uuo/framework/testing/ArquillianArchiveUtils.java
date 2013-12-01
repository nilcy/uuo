// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.kuzumeji.uuo.framework.testing;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
/**
 * テスト用アーカイブのユーティリティ
 * @author nilcy
 */
public final class ArquillianArchiveUtils {
  /** コンストラクタ */
  private ArquillianArchiveUtils() {
  }
  /**
   * CDIアーカイブの作成
   * @return CDIアーカイブ
   */
  public static JavaArchive createJavaCdiArchive() {
    return createJavaArchive().addAsResource("META-INF/beans.xml");
  }
  /**
   * CDI/JPAアーカイブの作成
   * @return CDI/JPAアーカイブ
   */
  public static JavaArchive createJavaCdiJpaArchive() {
    return createJavaCdiArchive().addAsResource("META-INF/persistence.xml");
  }
  /**
   * Javaアーカイブの作成
   * @return Javaアーカイブ
   */
  private static JavaArchive createJavaArchive() {
    return ShrinkWrap.create(JavaArchive.class);
  }
}
