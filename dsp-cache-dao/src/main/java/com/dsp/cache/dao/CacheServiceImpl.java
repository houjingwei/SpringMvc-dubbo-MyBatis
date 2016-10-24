package com.dsp.cache.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.dsp.service.cache.CacheService;
import com.dsp.utils.exception.CustomException;
import com.dsp.utils.exception.CustomExceptionEnum;


@Service(value = "cacheService")
public class CacheServiceImpl implements CacheService {

	@Autowired
	private RedisTemplate<String, Serializable> redisTemplate;

	public void add(String key, Serializable value, int minutes) throws CustomException {
		try {
			redisTemplate.opsForValue().set(key, value);
			redisTemplate.expire(key, minutes, TimeUnit.MINUTES);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
		}
	}

	public void add(String key, Serializable value) throws CustomException {
		try {
			redisTemplate.opsForValue().set(key, value);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
		}

	}

	public void addList(String key, Collection<Serializable> values) throws CustomException {
		try {
			if (values != null && values.size() > 0) {
				remove(key);
				redisTemplate.opsForList().leftPushAll(key, values);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
		}

	}

	public void addList(String key, Collection<Serializable> values, int minutes) throws CustomException {
		try {
			remove(key);
			redisTemplate.opsForList().leftPushAll(key, values);
			redisTemplate.expire(key, minutes, TimeUnit.MINUTES);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
		}
	}

	public void addOneToList(String key, Serializable value) throws CustomException {
		try {
			redisTemplate.opsForList().leftPush(key, value);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
		}
	}

	public Serializable get(String key) throws CustomException {
		try {
			return redisTemplate.opsForValue().get(key);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
		}
	}

	public List<Serializable> getList(String key) throws CustomException {
		try {
			Long size = redisTemplate.opsForList().size(key);
			return redisTemplate.opsForList().range(key, 0, size);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
		}
	}

	public Serializable getListFirstOne(String key) throws CustomException {
		try {
			List<Serializable> le = redisTemplate.opsForList().range(key, 0, 1);
			if (le != null && le.size() > 0) {
				return le.get(0);
			} else {
				return null;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
		}
	}

	public long getCountLike(String keyPrefix) throws CustomException {
		try {
			if (StringUtils.isNotEmpty(keyPrefix)) {
				Set<String> matchedCacheKeys = redisTemplate.keys(keyPrefix + "*");
				return matchedCacheKeys.size();
			} else {
				return 0;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
		}
	}

	public void remove(String key) throws CustomException {
		try {
			redisTemplate.delete(redisTemplate.keys(key));
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
		}

	}

	public void removeLike(String keyPrefix) throws CustomException {
		try {
			if (StringUtils.isNotEmpty(keyPrefix)) {
				Set<String> matchedCacheKeys = redisTemplate.keys(keyPrefix + "*");
				for (String cacheKey : matchedCacheKeys) {
					this.remove(cacheKey);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
		}
	}

	public int countItemsLike(String keyPrefix) throws CustomException {

		try {
			if (StringUtils.isNotEmpty(keyPrefix)) {
				Set<String> matchedCacheKeys = redisTemplate.keys(keyPrefix + "*");
				return matchedCacheKeys.size();
			} else {
				return 0;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
		}
	}

}
