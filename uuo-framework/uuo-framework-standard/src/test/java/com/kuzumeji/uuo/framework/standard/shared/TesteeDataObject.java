// ========================================================================
// Copyright (C) YOYO Project Team. All rights reserved.
// GNU AFFERO GENERAL PUBLIC LICENSE Version 3, 19 November 2007
// http://www.gnu.org/licenses/agpl-3.0.txt
// ========================================================================
package com.kuzumeji.uuo.framework.standard.shared;

import com.kuzumeji.uuo.framework.standard.shared.AbstractDataObject;

/**
 * テスト用データオブジェクト
 * @author nilcy
 */
@SuppressWarnings("all")
public class TesteeDataObject extends AbstractDataObject {
  private String foo;
  private transient String bar;
  public String getFoo() {
    return foo;
  }
  public void setFoo(final String foo) {
    this.foo = foo;
  }
  public String getBar() {
    return bar;
  }
  public void setBar(final String bar) {
    this.bar = bar;
  }
}
