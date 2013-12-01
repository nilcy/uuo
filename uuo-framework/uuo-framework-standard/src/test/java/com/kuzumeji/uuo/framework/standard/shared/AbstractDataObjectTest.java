// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.kuzumeji.uuo.framework.standard.shared;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 * @see com.kuzumeji.uuo.framework.standard.shared.AbstractDataObject
 * @author nilcy
 */
@SuppressWarnings("all")
public class AbstractDataObjectTest {
  private final TesteeDataObject testee = new TesteeDataObject();
  @Before
  public void before() {
    testee.setFoo("foo-01");
    testee.setBar("bar-01");
  }
  @Test
  public final void testAbstractDataObject() {
    assertThat(new TesteeDataObject(), is(not(nullValue())));
  }
  @Test
  public final void testToString() {
    assertThat(testee.toString(), is("TesteeDataObject[foo=foo-01,bar=bar-01]"));
  }
  @Test
  public final void testEqualsObject() {
    final TesteeDataObject eqObject = new TesteeDataObject();
    eqObject.setFoo("foo-01");
    eqObject.setBar("bar-01");
    assertThat(testee.equals(eqObject), is(true));
    final TesteeDataObject neqObject = new TesteeDataObject();
    neqObject.setFoo("foo-02");
    neqObject.setBar("bar-02");
    assertThat(testee.equals(neqObject), is(false));
  }
  @Test
  public final void testHashCode() {
    assertThat(testee.hashCode(), is(not(nullValue())));
  }
}
