package com.dsp.service.user;

import java.util.List;

import com.dsp.model.Resource;

public interface ResourceService {
	
	
	List<Resource> findUserResourcesById(Integer id);

	List<Resource> findAllResources();
	
	List<Resource> findAllResourcesAndMenu();
	
	List<Resource> findAllResourcesAndMenuAndItem();
	
}
