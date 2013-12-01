// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.kuzumeji.uuo.framework.enterprise.shared;
import java.io.Serializable;
import java.util.Date;
/**
 * 監査可能エンティティI/F
 * @param <P> エンティティ型
 * @param <I> 識別子オブジェクト型
 * @param <U> 利用者オブジェクト型
 * @author nilcy
 */
public interface Auditable<P extends Persistable<P, I>, I extends Serializable, U> extends
  Versionable<P, I> {
  /**
   * 作成者の取得
   * @return 作成者
   */
  U getCreatedBy();
  /**
   * 作成者の設定
   * @param createdBy 作成者
   */
  void setCreatedBy(U createdBy);
  /**
   * 作成日時の取得
   * @return 作成日時の取得
   */
  Date getCreatedDate();
  /**
   * 作成日時の設定
   * @param createdDate 作成日時
   */
  void setCreatedDate(Date createdDate);
  /**
   * 最終更新者の取得
   * @return 最終更新者
   */
  U getLastModifiedBy();
  /**
   * 最終更新者の設定
   * @param lastModifiedBy 最終更新者
   */
  void setLastModifiedBy(U lastModifiedBy);
  /**
   * 最終更新日時の取得
   * @return 最終更新日時
   */
  Date getLastModifiedDate();
  /**
   * 最終更新日時の設定
   * @param lastModifiedDate 最終更新日時
   */
  void setLastModifiedDate(Date lastModifiedDate);
}
