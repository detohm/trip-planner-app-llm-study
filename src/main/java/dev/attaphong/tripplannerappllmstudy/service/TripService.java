package dev.attaphong.tripplannerappllmstudy.service;

import dev.attaphong.tripplannerappllmstudy.dto.PlanRequestDTO;
import dev.attaphong.tripplannerappllmstudy.dto.TripDTO;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.service.AiServices;
import org.springframework.stereotype.Service;

@Service
public class TripService {

    private final TripPlanner tripPlanner;

    TripService(ChatLanguageModel chatLanguageModel){
        this.tripPlanner = AiServices.builder(TripPlanner.class).
                chatLanguageModel(chatLanguageModel).
                build();
    }

    public TripDTO plan(PlanRequestDTO req){
        return tripPlanner.planTrip(req.getCity(), req.getRequirements(), req.getDays());
    }
}
