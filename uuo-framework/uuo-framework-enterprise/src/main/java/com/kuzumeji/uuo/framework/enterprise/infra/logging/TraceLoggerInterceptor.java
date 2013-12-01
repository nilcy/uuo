// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.kuzumeji.uuo.framework.enterprise.infra.logging;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * トレースロガーのインターセプタ
 * @author nilcy
 */
@Interceptor
@TraceLogger
public class TraceLoggerInterceptor {
  /** コンストラクタ */
  public TraceLoggerInterceptor() {
  }
  /**
   * トレースログの出力
   * @param context コンテキスト
   * @return 処理結果
   * @throws Exception 処理例外
   */
  @SuppressWarnings("static-method")
  @AroundInvoke
  public Object trace(final InvocationContext context) throws Exception {
    final Logger log = LoggerFactory.getLogger(context.getMethod().getDeclaringClass());
    final String methodName = context.getMethod().getName();
    log.info("Entering #{} with {}.", methodName, context.getParameters());
    try {
      final Object result = context.proceed();
      log.info("Exiting #{} with {}.", methodName, result);
      return result;
    } catch (final Exception e) {// OK to catch Exception here
      log.warn(e.getLocalizedMessage());
      throw e;
    }
  }
}
