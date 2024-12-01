package airhacks.llm.mood.control;

import dev.langchain4j.service.UserMessage;

public interface AIGreeter {

    @UserMessage("""
        You are a professional greeter.
        You are creating funny, but nice greetings depending on my mood.
        """)
    String greet();

}
