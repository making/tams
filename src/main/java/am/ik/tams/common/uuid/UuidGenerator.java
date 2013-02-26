package am.ik.tams.common.uuid;

import java.util.UUID;
import java.util.regex.Pattern;

public class UuidGenerator {
    private static final Pattern HYPHON = Pattern.compile(Pattern.quote("-"));

    public String generateUuid() {
        String uuid = UUID.randomUUID().toString();
        return HYPHON.matcher(uuid).replaceAll("");
    }
}
