// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.github.nilcy.uuo.framework.standard.shared;
import java.io.Serializable;
/**
 * 参照オブジェクトI/F
 * <dl>
 * <dt>使用条件
 * <dd>データオブジェクトI/Fが継承されること。
 * </dl>
 * @param <R> 参照オブジェクト型
 * @param <I> 識別子オブジェクト型
 * @author nilcy
 */
public interface ReferenceObject<R extends ReferenceObject<R, I>, I extends Serializable> extends
  DataObject {
  /**
   * 同一性の確認
   * <dl>
   * <dt>使用条件
   * <dd>参照オブジェクトの同一性を確認することを保証する。
   * </dl>
   * @param other 比較オブジェクト
   * @return 同一性(true:おなじ, false:ちがう)
   */
  boolean sameIdentityAs(R other);
  /**
   * 識別子
   * <dl>
   * <dt>使用条件
   * <dd>参照オブジェクトの識別子を返却することを保証する。
   * </dl>
   * @return 識別子
   */
  I identity();
}
