// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.github.nilcy.uuo.framework.enterprise;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
/**
 * @see com.github.nilcy.uuo.framework.enterprise.Example
 * @author nilcy
 */
@RunWith(Arquillian.class)
@SuppressWarnings("all")
public class ExampleTest {
  @Inject Example testee;
  @Deployment
  public static JavaArchive createDeployment() {
    return ArquillianArchive.CDI();
  }
  @Test
  public void test() {
    assertThat(testee.sayHello(), is("Hello, World."));
  }
}
