// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.kuzumeji.uuo.framework.enterprise.shared;
import javax.ejb.ApplicationException;
import com.kuzumeji.uuo.framework.standard.shared.StandardRuntimeException;
/**
 * エンタープライズ非キャッチ例外(JavaEE)
 * @author nilcy
 */
@ApplicationException(inherited = true, rollback = true)
public class EnterpriseRuntimeException extends StandardRuntimeException {
  /** 識別番号 */
  private static final long serialVersionUID = 1628775946067528606L;
  /** コンストラクタ */
  public EnterpriseRuntimeException() {
  }
  /**
   * コンストラクタ
   * @param message メッセージ
   */
  public EnterpriseRuntimeException(final String message) {
    super(message);
  }
  /**
   * コンストラクタ
   * @param cause 例外クラス
   */
  public EnterpriseRuntimeException(final Throwable cause) {
    super(cause);
  }
  /**
   * コンストラクタ
   * @param message メッセージ
   * @param cause 例外クラス
   */
  public EnterpriseRuntimeException(final String message, final Throwable cause) {
    super(message, cause);
  }
  /**
   * コンストラクタ
   * @param message メッセージ
   * @param cause 例外クラス
   * @param enableSuppression 抑制するか
   * @param writableStackTrace スタックトレースが書き込み可能であるべきか
   */
  public EnterpriseRuntimeException(final String message, final Throwable cause,
    final boolean enableSuppression, final boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
