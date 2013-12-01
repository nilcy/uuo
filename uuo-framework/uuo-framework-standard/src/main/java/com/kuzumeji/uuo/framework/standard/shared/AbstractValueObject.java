// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.kuzumeji.uuo.framework.standard.shared;
import org.apache.commons.lang3.builder.EqualsBuilder;
/**
 * 値オブジェクト
 * @param <V> 値オブジェクト型
 * @author nilcy
 */
public abstract class AbstractValueObject<V extends AbstractValueObject<V>> extends
  AbstractDataObject implements ValueObject<V> {
  /** 改訂番号 */
  private static final long serialVersionUID = 8578442819084872323L;
  /** コンストラクタ */
  public AbstractValueObject() {
  }
  /** {@inheritDoc} */
  @Override
  public boolean sameValueAs(final V other) {
    return EqualsBuilder.reflectionEquals(this, other, false);
  }
}
