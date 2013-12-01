// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.kuzumeji.uuo.framework.enterprise.shared;
import java.util.Properties;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.event.CacheManagerEventListener;
/**
 * キャッシュマネージャのイベントリスナーのファクトリー
 * @author nilcy
 */
public final class DefaultCacheManagerEventListenerFactory extends
  net.sf.ehcache.event.CacheManagerEventListenerFactory {
  /** コンストラクタ */
  public DefaultCacheManagerEventListenerFactory() {
  }
  /** {@inheritDoc} */
  @Override
  public CacheManagerEventListener createCacheManagerEventListener(final CacheManager cacheManager,
    final Properties properties) {
    return new DefaultCacheManagerEventListener();
  }
}
