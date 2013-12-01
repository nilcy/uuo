// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.kuzumeji.uuo.framework.enterprise.shared;
import java.io.Serializable;
import com.kuzumeji.uuo.framework.standard.shared.ReferenceObject;
/**
 * 基底エンティティI/F
 * @param <P> エンティティ型
 * @param <I> 識別子オブジェクト型
 * @author nilcy
 */
public interface Persistable<P extends Persistable<P, I>, I extends Serializable> extends
  ReferenceObject<Persistable<P, I>, I> {
  /**
   * 永続済チェック
   * @return TRUE:永続後、FALSE:永続前
   */
  boolean isPersisted();
}
