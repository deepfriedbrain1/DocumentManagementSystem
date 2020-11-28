import java.util.Map;

public class Document {
    private final Map<String, String> attributes;

    Document(final Map<String, String> attributes){
        this.attributes = attributes;
    }//end constructor

    public String getAttributes(final String attributeName){
        return attributes.get(attributeName);
    }
}
