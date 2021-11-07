package com.example.reto3.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.reto3.reto3.model.Audience;
import com.example.reto3.reto3.repository.AudienceRepository;


@Service
public class AudienceService {

    @Autowired
    private AudienceRepository audienceRepository;

    public List<Audience> getAll(){

        return audienceRepository.getAll();

    }

    public Optional<Audience> getAudience(int id){

        return audienceRepository.getAudience(id);
    }

    public Audience save(Audience audi){

        if(audi.getId()==null){

            return audienceRepository.save(audi);
        }

        else{

            Optional<Audience> audiaux=audienceRepository.getAudience(audi.getId());
            if(audiaux.isEmpty()){

                return audienceRepository.save(audi);
            }
            else{

                return audi;
            }
        }


    }

    
}

