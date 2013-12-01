// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.kuzumeji.uuo.framework.standard.shared;
/**
 * 値オブジェクトI/F
 * <dl>
 * <dt>使用条件
 * <dd>データオブジェクトI/Fが継承されること。
 * </dl>
 * @param <V> 値オブジェクト型
 * @author nilcy
 */
public interface ValueObject<V extends ValueObject<V>> extends DataObject {
  /**
   * 同一性の確認
   * <dl>
   * <dt>使用条件
   * <dd>値オブジェクトの同一性を確認することを保証する。
   * </dl>
   * @param other 比較オブジェクト
   * @return 同一性(true:おなじ, false:ちがう)
   */
  boolean sameValueAs(V other);
}
