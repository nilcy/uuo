// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.github.nilcy.uuo.framework.enterprise.infra.logging;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import org.slf4j.Logger;
/**
 * ロガーのファクトリ
 * @author nilcy
 */
@SuppressWarnings("static-method")
public class LoggerFactory {
  /** 非公開コンストラクタ */
  public LoggerFactory() {
  }
  /**
   * ロガーの作成
   * @param point 注入ポイント
   * @return ロガー
   */
  @Produces
  @Default
  private Logger createLogger(final InjectionPoint point) {
    return org.slf4j.LoggerFactory.getLogger(point.getMember().getDeclaringClass());
  }
}
