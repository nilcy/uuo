// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.github.nilcy.uuo.framework.standard;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author nilcy
 */
@SuppressWarnings("all")
public class LoggingTest {
  private static final Logger LOG = LoggerFactory.getLogger(LoggingTest.class);
  @Test
  public final void test() {
    LOG.trace("追跡({},{},{})", "foo", "bar", "baz");
    LOG.debug("検査({},{},{})", "foo", "bar", "baz");
    LOG.info("情報({},{},{})", "foo", "bar", "baz");
    LOG.warn("警告({},{},{})", "foo", "bar", "baz");
    LOG.error("異常({},{},{})", "foo", "bar", "baz");
  }
}
