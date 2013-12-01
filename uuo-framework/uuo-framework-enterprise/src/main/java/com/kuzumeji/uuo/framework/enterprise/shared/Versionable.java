// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.kuzumeji.uuo.framework.enterprise.shared;
import java.io.Serializable;
/**
 * 版管理エンティティI/F
 * @param <P> エンティティ型
 * @param <I> 識別子オブジェクト型
 * @author nilcy
 */
public interface Versionable<P extends Persistable<P, I>, I extends Serializable> extends
  Persistable<P, I> {
  /**
   * 版数の取得
   * @return 版数
   */
  Long getVersion();
  /**
   * 版数の設定
   * @param version 版数
   */
  void setVersion(Long version);
}
