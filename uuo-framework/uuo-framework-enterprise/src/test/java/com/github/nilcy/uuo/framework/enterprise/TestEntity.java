// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.github.nilcy.uuo.framework.enterprise;
import static javax.persistence.GenerationType.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.github.nilcy.uuo.framework.standard.shared.AbstractDataObject;
/**
 * テスト用エンティティ
 * @author nilcy
 */
@Entity
public class TestEntity extends AbstractDataObject {
  /** 改定版数 */
  private static final long serialVersionUID = -644488909754538144L;
  /** ID */
  @Id @GeneratedValue(strategy = AUTO) private Long id;
  /** FOO */
  private String foo;
  /** BAR */
  private String bar;
  /** コンストラクタ */
  public TestEntity() {
  }
  /**
   * {@link #id} の取得
   * @return {@link #id}
   */
  public Long getId() {
    return id;
  }
  /**
   * {@link #id} の設定
   * @param id {@link #id}
   */
  public void setId(final Long id) {
    this.id = id;
  }
  /**
   * {@link #foo} の取得
   * @return {@link #foo}
   */
  public String getFoo() {
    return foo;
  }
  /**
   * {@link #foo} の設定
   * @param foo {@link #foo}
   */
  public void setFoo(final String foo) {
    this.foo = foo;
  }
  /**
   * {@link #bar} の取得
   * @return {@link #bar}
   */
  public String getBar() {
    return bar;
  }
  /**
   * {@link #bar} の設定
   * @param bar {@link #bar}
   */
  public void setBar(final String bar) {
    this.bar = bar;
  }
}
