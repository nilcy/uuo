// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.kuzumeji.uuo.framework.enterprise.shared;
import java.util.logging.Logger;
import net.sf.ehcache.Status;
import net.sf.ehcache.event.CacheManagerEventListener;
/**
 * キャッシュマネージャのイベントリスナー
 * @author nilcy
 */
public final class DefaultCacheManagerEventListener implements CacheManagerEventListener {
  /** ロガー */
  private static final Logger LOG = Logger.getAnonymousLogger();
  /** コンストラクタ */
  public DefaultCacheManagerEventListener() {
  }
  /** {@inheritDoc} */
  @Override
  public void init() {
    LOG.fine("initialized");
  }
  /** {@inheritDoc} */
  @Override
  public Status getStatus() {
    return null;
  }
  /** {@inheritDoc} */
  @Override
  public void dispose() {
    LOG.fine("disposed");
  }
  /** {@inheritDoc} */
  @Override
  public void notifyCacheAdded(final String cacheName) {
    LOG.fine("added cache " + cacheName);
  }
  /** {@inheritDoc} */
  @Override
  public void notifyCacheRemoved(final String cacheName) {
    LOG.fine("removed cache " + cacheName);
  }
}
