package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Guide;

public interface IGuideService {
	List<Guide> findAll();

	Guide findOne (Long idGuide);
	
	Guide save(Guide guide);
	
	void delete(Long idGuide);
}
