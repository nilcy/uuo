// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.github.nilcy.uuo.framework.enterprise.infra.logging;
import java.io.Serializable;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
/**
 * テスト用ローカルBean
 * @author nilcy
 */
@Stateless
@LocalBean
@TraceLogger
public class TestBean implements Serializable {
  /** 改定版数 */
  private static final long serialVersionUID = 9171788456117369892L;
  /** コンストラクタ */
  public TestBean() {
  }
  /**
   * サンプルメソッド
   * <dl>
   * <dt>使用条件
   * <dd>"Hello, World."を返却すること。
   * </dl>
   * @return "Hello, World."
   */
  @SuppressWarnings("static-method")
  public String sayHello() {
    return "Hello, World.";
  }
}
