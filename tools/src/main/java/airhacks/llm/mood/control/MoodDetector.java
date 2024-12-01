package airhacks.llm.mood.control;

import dev.langchain4j.agent.tool.Tool;
import dev.langchain4j.model.bedrock.BedrockAnthropicMessageChatModel;
import dev.langchain4j.service.AiServices;

public class MoodDetector {

    @Tool("calculates the mood")
    public String howAreYou() {
        return "I written terrible python code, slow and complex. I'm sad";
    }

    public static AIGreeter create(BedrockAnthropicMessageChatModel model) {
        return AiServices
                .builder(AIGreeter.class)
                .chatLanguageModel(model)
                .tools(new MoodDetector())
                .build();
    }
}
