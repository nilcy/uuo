// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.github.nilcy.uuo.framework.enterprise;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
/**
 * @author nilcy
 */
@SuppressWarnings("all")
class ArquillianArchive {
  static JavaArchive createDeployment() {
    return ShrinkWrap.create(JavaArchive.class)
      .addPackages(true, "com.github.nilcy.uuo.framework.enterprise")
      .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
  }
}
