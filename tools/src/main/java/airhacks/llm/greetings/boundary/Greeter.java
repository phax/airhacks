package airhacks.llm.greetings.boundary;

import airhacks.llm.claude.control.ClaudeAccess;
import airhacks.llm.mood.control.MoodDetector;

public interface Greeter {

    static String greet(){
        var model = ClaudeAccess.model();
        var moodDetector = MoodDetector.create(model);
        return moodDetector.greet();
    }
    
}
