// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.kuzumeji.uuo.framework.enterprise.infra.logging;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import com.kuzumeji.uuo.framework.enterprise.infra.logging.LoggerFactory;
/**
 * @see LoggerFactory
 * @author nilcy
 */
@RunWith(Arquillian.class)
@SuppressWarnings("all")
public class LoggerFactoryTest {
  @Inject Logger log;
  @Deployment
  public static JavaArchive createDeployment() {
    return ArquillianArchive.CDI();
  }
  @Test
  public final void test() {
    assertThat(log, is(not(nullValue())));
    log.trace("追跡({},{},{})", "foo", "bar", "baz");
    log.debug("検査({},{},{})", "foo", "bar", "baz");
    log.info("情報({},{},{})", "foo", "bar", "baz");
    log.warn("警告({},{},{})", "foo", "bar", "baz");
    log.error("異常({},{},{})", "foo", "bar", "baz");
  }
}
