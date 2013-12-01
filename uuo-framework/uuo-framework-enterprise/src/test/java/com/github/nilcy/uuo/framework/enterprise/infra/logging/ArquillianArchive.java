// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.github.nilcy.uuo.framework.enterprise.infra.logging;
import org.jboss.shrinkwrap.api.ShrinkWrap;
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
    return ShrinkWrap.create(JavaArchive.class)
      .addPackages(true, "com.github.nilcy.uuo.framework.enterprise.infra")
      .addAsResource("META-INF/beans.xml");
  }
  /**
   * CDI/JPAアーカイブの作成
   * @return CDI/JPAアーカイブ
   */
  static JavaArchive CDI_JPA() {
    return ShrinkWrap.create(JavaArchive.class)
      .addPackages(true, "com.github.nilcy.uuo.framework.enterprise.infra")
      .addAsResource("META-INF/beans.xml").addAsResource("META-INF/persistence.xml");
  }
}
