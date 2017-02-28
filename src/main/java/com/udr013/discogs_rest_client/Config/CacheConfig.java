package com.udr013.discogs_rest_client.Config;

import net.sf.ehcache.config.CacheConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableCaching
public class CacheConfig {

	@Bean(destroyMethod="shutdown")
	public net.sf.ehcache.CacheManager ehCacheManager() {
		CacheConfiguration cacheConfiguration = new CacheConfiguration();
		cacheConfiguration.setName("Coll_Cache");
		cacheConfiguration.setMaxEntriesLocalHeap(500);
		cacheConfiguration.setTimeToLiveSeconds(10);


		net.sf.ehcache.config.Configuration config = new net.sf.ehcache.config.Configuration();
		config.addCache(cacheConfiguration);

		return net.sf.ehcache.CacheManager.newInstance(config);
	}

}