package com.dsp.service.cache;


import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import com.dsp.utils.exception.CustomException;




public interface CacheService {

	/**
	 * 添加对象到缓存
	 * @param key 缓存key
	 * @param value 缓存对象
	 * @param minutes 过期时间
	 * @throws CustomException
	 */
	public void add(String key,Serializable value,int minutes)throws CustomException;
	
	/**
	 * 添加对象到缓存
	 * @param key 缓存key
	 * @param value 缓存对象
	 * @throws CustomException
	 */
	public void add(String key,Serializable value)throws CustomException;
	
	/**
	 * 添加集合到缓存
	 * @param key 缓存key
	 * @param values 缓存对象
	 * @throws CustomException
	 */
	public void addList(String key, Collection<Serializable> values)throws CustomException;
	
	/**
	 * 添加集合到缓存
	 * @param key 缓存key
	 * @param values 缓存对象
	 * @param minutes 过期时间
	 * @throws CustomException
	 */
	public void addList(String key, Collection<Serializable> values,int minutes)throws CustomException;
	
	/**
	 * 添加对象到缓存集合中
	 * @param key 缓存key
	 * @param value 缓存对象
	 * @throws CustomException
	 */
	public void addOneToList(String key,Serializable value)throws CustomException;
	
	/**
	 * 获取缓存对象
	 * @param key 缓存key
	 * @return
	 * @throws CustomException
	 */
	public Serializable get(String key)throws CustomException;
	
	/**
	 * 获取缓存列表
	 * @param key 缓存key
	 * @return
	 * @throws CustomException
	 */
	public List<Serializable> getList(String key)throws CustomException;
	
	/**
	 * 获取列表
	 * @param key
	 * @return
	 * @throws CustomException
	 */
	public Serializable getListFirstOne(String key)throws CustomException;
	
	/**
	 * 获得缓存数量
	 * @param keyPrefix key前缀
	 * @return
	 * @throws CustomException
	 */
	public long getCountLike(String keyPrefix)throws CustomException;
	
	/**
	 * 删除缓存
	 * @param key 缓存key
	 * @throws CustomException
	 */
	public void remove(String key)throws CustomException;
	
	/**
	 * 模糊删除缓存
	 * @param keyPrefix 缓存前缀
	 * @throws CustomException
	 */
	public void removeLike(String keyPrefix)throws CustomException;
	
	/**
	 * 
	 * @param keyPrefix
	 * @return
	 */
	public int countItemsLike(String keyPrefix);
	
	
	
}
