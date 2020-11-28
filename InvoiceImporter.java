import static org.constant.attributes.Attributes.*;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class InvoiceImporter implements Importer{
    @Override
    public Document importFile(File file) throws IOException {
        final Map<String, String> attributes;
        final TextFile textFile = new TextFile(file);
        textFile.addLineSuffix(NAME_PREFIX, PATIENT);
        textFile.addLineSuffix(AMOUNT_PREFIX, AMOUNT);

        attributes = textFile.getAttributes();
        attributes.put(TYPE, "INVOICE");

        return new Document(attributes);
    }
}
