// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.kuzumeji.uuo.framework.enterprise;
import static com.kuzumeji.uuo.framework.testing.ArquillianArchiveUtils.*;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
/**
 * テスト用アーカイブ
 * @author nilcy
 */
class ArquillianArchive {
  /**
   * CDIアーカイブの作成
   * @return CDIアーカイブ
   */
  static JavaArchive CDI() {
    return createJavaCdiArchive().addPackages(true, "com.kuzumeji.uuo.framework.enterprise");
  }
  /**
   * CDI/JPAアーカイブの作成
   * @return CDI/JPAアーカイブ
   */
  static JavaArchive CDI_JPA() {
    return createJavaCdiJpaArchive().addPackages(true, "com.kuzumeji.uuo.framework.enterprise");
  }
}
