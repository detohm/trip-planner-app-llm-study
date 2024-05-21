package dev.attaphong.tripplannerappllmstudy.service;

import dev.attaphong.tripplannerappllmstudy.dto.TripDTO;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;

public interface TripPlanner {
    @UserMessage("Plan a trip for {{city}} for {{days}} days. Provides 1 travel attractions for morning, afternoon, evening and night in each day based on the provided requirements here: {{requirements}}")
    TripDTO planTrip(@V("city") String city, @V("requirements") String requirements, @V("days") Integer days);
}
