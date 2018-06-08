package ehcache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;
public class TestEhcache {
	public static void  main(String argd[]){
		//key:根据此值获取缓存的value，不可重复，value值需要缓存的数据
		String key="age";
		String value="18";
		Element element1 = new Element(key, value);
		//cacheName:指ehcache-test.xml配置文件中的缓存名称 name="xxx"中的值
		Cache cache1 = GetCacheManager.cacheManager.getCache("myCache");
		cache1.put(element1);
		
		
		Cache cache2 = GetCacheManager.cacheManager.getCache("myCache");
		Element element2 = cache2.get(key);
		Object data = element2.getObjectValue();//获取到的缓存数据
		System.out.println(data);
	}
}
