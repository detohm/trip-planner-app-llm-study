package dev.attaphong.tripplannerappllmstudy.config;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class AppConfig {
    @Bean
    ChatLanguageModel chatLanguageModel(){
        String baseUrl = "http://localhost:11434";
        String modelName = "llama3";
        return OllamaChatModel.builder().
                baseUrl(baseUrl).
                modelName(modelName).
                format("json").
                timeout(Duration.ofMinutes(10)).
                build();
    }
}
