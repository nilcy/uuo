// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.github.nilcy.uuo.framework.coding;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 * @see com.github.nilcy.uuo.framework.coding.Example
 * @author nilcy
 */
@SuppressWarnings("all")
public class ExampleTest {
  @Test
  public final void testSayHello() {
    assertThat(Example.sayHello(), is("Hello, World."));
  }
}
