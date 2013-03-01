package am.ik.tams.common.json;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;

public class DateDeserializer
                             extends
                             org.codehaus.jackson.map.deser.std.DateDeserializer {

    @Override
    protected Date _parseDate(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String str = jp.getText().trim();
        if (str.length() == 0) {
            return (Date) getEmptyValue();
        }
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(str);
        } catch (ParseException e) {
            throw ctxt.weirdStringException(_valueClass,
                    "not a valid representation (error: " + e.getMessage()
                            + ")");
        }
    }
}
