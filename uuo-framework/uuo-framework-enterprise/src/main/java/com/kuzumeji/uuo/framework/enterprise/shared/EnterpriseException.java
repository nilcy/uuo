// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.kuzumeji.uuo.framework.enterprise.shared;
import java.util.Map;
import javax.ejb.ApplicationException;
import com.kuzumeji.uuo.framework.standard.shared.StandardException;
/**
 * エンタープライズキャッチ例外(JavaEE)
 * @author nilcy
 */
@ApplicationException(inherited = true, rollback = true)
public class EnterpriseException extends StandardException {
  /** 識別番号 */
  private static final long serialVersionUID = -2800101543289045004L;
  /**
   * コンストラクタ
   * @param key キー
   * @param values バリュー配列
   * @see StandardException#StandardException(String, Object...)
   */
  public EnterpriseException(final String key, final Object... values) {
    super(key, values);
  }
  /**
   * コンストラクタ
   * @param causeMap {@link StandardException#getCauseMap()}
   */
  public EnterpriseException(final Map<String, Object[]> causeMap) {
    super(causeMap);
  }
}
