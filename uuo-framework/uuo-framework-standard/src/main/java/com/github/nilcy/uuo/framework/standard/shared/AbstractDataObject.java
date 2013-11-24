// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.github.nilcy.uuo.framework.standard.shared;
import static org.apache.commons.lang3.builder.ToStringStyle.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
/**
 * 基底データオブジェクト
 * <dl>
 * <dt>使用条件
 * <dd>
 * <ol>
 * <li>データオブジェクトI/F({@link DataObject})が実装されること。</li>
 * <li>参照オブジェクトと値オブジェクトは本クラスを継承すること。</li>
 * </ol>
 * </dl>
 * @author nilcy
 */
public abstract class AbstractDataObject implements DataObject {
  /** 改訂番号 */
  private static final long serialVersionUID = 3030362922246369464L;
  /** コンストラクタ */
  public AbstractDataObject() {
  }
  /**
   * {@inheritDoc}
   * <dl>
   * <dt>使用条件
   * <dd>オブジェクト状態から短縮形式で文字列化することを保証する。(一時フィールド(transient)も対象の範囲)
   * </dl>
   */
  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, SHORT_PREFIX_STYLE, true);
  }
  /**
   * {@inheritDoc}
   * <dl>
   * <dt>使用条件
   * <dd>オブジェクトと比較対象オブジェクトが等しいか検査することを保証する。(一時フィールド(transient)も検査の対象)
   * </dl>
   */
  @Override
  public boolean equals(final Object other) {
    return EqualsBuilder.reflectionEquals(this, other, true);
  }
  /**
   * {@inheritDoc}
   * <dl>
   * <dt>使用条件
   * <dd>オブジェクト状態からハッシュコードを生成することを保証する。(一時フィールド(transient)も生成キーの対象)
   * </dl>
   */
  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this, true);
  }
}
