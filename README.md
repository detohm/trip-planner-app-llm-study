# trip-planner-app-llm-study
A trip planner using a recommendation from LLM. This project is for my educational purpose to understand a bit more about AI application development using LangChain and Ollama.

## Features
- User can provide target city, how many days, and requirements such as travel styles, focusing, constraints, etc. 
- System will generate itinerary per day with attractions in a structured format.
- This application relies on llama3 model which is locally deployed.

## Pre-requisite
- Install Ollama and run the llama3 model. The default url is http://localhost:11434

## Example 
This is an example HTTP request and response.
URI: POST /trip/plan
```javascript
// REQUEST
{
    "city":"Tokyo",
    "days":3,
    "requirements":"explore culinary, jazz bars, and national scenaries"
}

// RESPONSE
{
    "itineraries": [
        {
            "summary": "Discover the best of Tokyo's culinary and jazz scene in this first day",
            "area": "Shibuya",
            "morning": [
                {
                    "name": "Tsukiji Fish Market",
                    "activities": "Explore the world-famous fish market and try some fresh sushi for breakfast"
                }
            ],
            "afternoon": [
                {
                    "name": "Shibuya Crossing",
                    "activities": "Take a stroll around the famous Shibuya district, take in the neon lights and bustling atmosphere, and grab some lunch at one of the many food stalls or restaurants"
                }
            ],
            "evening": [
                {
                    "name": "JZ Bratwurst",
                    "activities": "Enjoy some German-inspired jazz tunes and a cold beer at this unique bar"
                }
            ],
            "night": [
                {
                    "name": "Nonbei Yokocho",
                    "activities": "Explore the hidden alleys of Golden Gai, visit some small bars and try some local craft beer"
                }
            ],
            "day": 1
        },
        {
            "summary": "Immerse yourself in Tokyo's national scenery and cultural experiences on this second day",
            "area": "Asakusa",
            "morning": [
                {
                    "name": "Senso-ji Temple",
                    "activities": "Visit the iconic temple dedicated to the goddess of mercy, Kannon, and explore the nearby Nakamise Shopping Street"
                }
            ],
            "afternoon": [
                {
                    "name": "Ueno Park",
                    "activities": "Take a leisurely stroll around the beautiful park, visit the Tokyo National Museum, and enjoy the cherry blossom viewing in season (or other gardens in non-season)"
                }
            ],
            "evening": [
                {
                    "name": "Asakusa's Don Quixote",
                    "activities": "Browse through this famous department store, which has been around since 1932, for some unique souvenirs and snacks"
                }
            ],
            "night": [
                {
                    "name": "Ryogoku Kokugikan",
                    "activities": "Watch a sumo tournament (if scheduled) or take a guided tour of the sumo arena and learn about its history and significance"
                }
            ],
            "day": 2
        },
        {
            "summary": "Conclude your Tokyo adventure with a day focused on culinary delights and cultural exploration",
            "area": "Shinjuku",
            "morning": [
                {
                    "name": "Tori-Q",
                    "activities": "Try some delicious yakitori at this popular chain restaurant"
                }
            ],
            "afternoon": [
                {
                    "name": "Shinjuku Gyoen National Garden",
                    "activities": "Explore the beautiful gardens, which offer a peaceful retreat from the hustle and bustle of the city"
                }
            ],
            "evening": [
                {
                    "name": "Jazz Live Kitazawa",
                    "activities": "Enjoy some live jazz music at this small bar with an intimate atmosphere"
                }
            ],
            "night": [
                {
                    "name": "Shinjuku's Omoide Yokocho",
                    "activities": "Visit the 'Reminiscence Alley' and explore the many small bars, restaurants, and shops in the area"
                }
            ],
            "day": 3
        }
    ]
}
```


## Improvement Backlog
- Try playing around with RAG (Retrieval-Augmented Generation)
- Persistence store for vector database
- Frontend layer to improve UX

## License
MIT, Attaphong Rattanaveerachanon