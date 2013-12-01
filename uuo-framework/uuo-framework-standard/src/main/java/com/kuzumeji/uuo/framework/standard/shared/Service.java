// ----------------------------------------------------------------------------
// Copyright (C) Kuzumeji Evolution Laboratory. All rights reserved.
// GNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007
// http://www.gnu.org/licenses/gpl-3.0-standalone.html
// ----------------------------------------------------------------------------
package com.kuzumeji.uuo.framework.standard.shared;
import java.io.Serializable;
/**
 * サービスI/F
 * <dl>
 * <dt>使用条件
 * <dd>
 * <ol>
 * <li>オブジェクトに属さない操作の集合であること。(DDD:Service)</li>
 * <li>問題領域に登場する概念ではなく、疎結合/高凝集性から得られる再利用可能性を実現すること。(GRASP:Pure Fabrication)</li>
 * </ol>
 * </dl>
 * @author nilcy
 */
public interface Service extends Serializable {
}
