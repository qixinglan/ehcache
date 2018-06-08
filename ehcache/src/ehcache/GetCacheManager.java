package ehcache;

import net.sf.ehcache.CacheManager;

public class GetCacheManager {
	public static CacheManager cacheManager = CacheManager.create("ehcache.xml");
}
