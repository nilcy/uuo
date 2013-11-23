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
    LOG.trace("TRACE");
    LOG.debug("DEBUG");
    LOG.info("INFO");
    LOG.warn("WARN");
    LOG.error("ERROR");
  }
}
