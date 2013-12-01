// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.github.nilcy.uuo.framework.enterprise.infra.logging;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import javax.ejb.EJB;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
/**
 * @see TestBean
 * @author nilcy
 */
@RunWith(Arquillian.class)
// @Transactional
@SuppressWarnings("all")
public class TraceLoggerInterceptorTest {
  @EJB TestBean testee;
  @Deployment
  public static JavaArchive createDeployment() {
    return ArquillianArchive.CDI();
  }
  @Test
  public final void test() {
    assertThat(testee.sayHello(), is("Hello, World."));
  }
}
