package org.springframework.samples.petclinic.feeding;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FeedingService {
	
	@Autowired
	private FeedingRepository feedingRepository;
	
    public List<Feeding> getAll(){
        List<Feeding> f = feedingRepository.findAll();
        return f;
    }

    public List<FeedingType> getAllFeedingTypes(){
        return null;
    }

    public FeedingType getFeedingType(String typeName) {
        FeedingType tipoComida = feedingRepository.findFeedingType(typeName);
    	return tipoComida;
    }

    public Feeding save(Feeding p) throws UnfeasibleFeedingException {
    	return null;       
    }
    public List<FeedingType> findAllFeedingTypes(){
		List<FeedingType> ft = feedingRepository.findAllFeedingTypes();
		return ft;
	}

    
}
