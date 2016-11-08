package com.dsp.user.mapper;

import java.util.List;

import com.dsp.model.Resource;


public interface ResourceMapper {


	List<Resource> findAllResources();

	List<Resource> findUserResourcesById(Integer id);


	List<Resource> findAllResourcesAndMenu();

	List<Resource> findAllResourcesAndMenuAndItem();
}
