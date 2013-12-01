// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.kuzumeji.uuo.framework.enterprise;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.transaction.api.annotation.TransactionMode;
import org.jboss.arquillian.transaction.api.annotation.Transactional;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @see javax.persistence.EntityManager
 * @author nilcy
 */
@RunWith(Arquillian.class)
@Transactional
@SuppressWarnings("all")
public class EntityManagerTest {
  private static Logger LOG = LoggerFactory.getLogger(EntityManagerTest.class);
  @PersistenceContext(unitName = "primary") private EntityManager testee;
  @Deployment
  public static JavaArchive createDeployment() {
    return ArquillianArchive.CDI_JPA();
  }
  @Test
  @Transactional(TransactionMode.ROLLBACK)
  public void test() {
    LOG.trace("trace");
    LOG.debug("debug");
    LOG.info("info");
    LOG.warn("warn");
    LOG.error("error");
    assertThat(testee, is(not(nullValue())));
    final TestEntity test = new TestEntity();
    LOG.info("test={}", test);
    testee.persist(test);
    for (final TestEntity testEntity : (Collection<TestEntity>) testee.createQuery(
      "select t from TestEntity t").getResultList()) {
      LOG.trace("testEntity={}", testEntity);
    }
    final TestEntity result = testee.find(TestEntity.class, 1L);
    LOG.info("result={}", result);
    result.setFoo("foo#0");
    result.setBar("bar#0");
    testee.merge(result);
    testee.remove(result);
  }
}
