package ehcache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;
public class TestEhcache {
	public static void  main(String argd[]){
		//key:���ݴ�ֵ��ȡ�����value�������ظ���valueֵ��Ҫ���������
		String key="age";
		String value="18";
		Element element1 = new Element(key, value);
		//cacheName:ָehcache-test.xml�����ļ��еĻ������� name="xxx"�е�ֵ
		Cache cache1 = GetCacheManager.cacheManager.getCache("myCache");
		cache1.put(element1);
		
		
		Cache cache2 = GetCacheManager.cacheManager.getCache("myCache");
		Element element2 = cache2.get(key);
		Object data = element2.getObjectValue();//��ȡ���Ļ�������
		System.out.println(data);
	}
}
