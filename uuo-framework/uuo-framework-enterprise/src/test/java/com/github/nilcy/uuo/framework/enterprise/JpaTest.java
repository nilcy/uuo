// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.github.nilcy.uuo.framework.enterprise;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
/**
 * @see javax.persistence.EntityManager
 * @author nilcy
 */
@RunWith(Arquillian.class)
@SuppressWarnings("all")
public class JpaTest {
  private final EntityManager testee = Persistence.createEntityManagerFactory("primary")
    .createEntityManager();
  // @PersistenceContext private EntityManager testee;
  @Deployment
  public static JavaArchive createDeployment() {
    return TesteeArchive.minimal();
  }
  @Test
  public void test() {
    assertThat(testee, is(not(nullValue())));
  }
}
