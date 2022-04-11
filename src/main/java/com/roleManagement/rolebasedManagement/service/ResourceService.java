package com.roleManagement.rolebasedManagement.service;

import com.roleManagement.rolebasedManagement.entity.Resource;
import com.roleManagement.rolebasedManagement.repository.ResourceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {
    @Autowired
    private ResourceRepository resourceRepository;
    Logger logger=  LoggerFactory.getLogger(ResourceService.class);

    public List<Resource> listAllResource() {
        if (resourceRepository.count()>0){
            logger.info("This resource table has total : " + resourceRepository.count() + " resources");
        }
        return resourceRepository.findAll();
    }

    public void saveResource(Resource resource) {
        resourceRepository.save(resource);
    }
}
