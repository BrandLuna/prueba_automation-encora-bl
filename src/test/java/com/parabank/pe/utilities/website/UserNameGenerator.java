package com.parabank.pe.utilities.website;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserNameGenerator {
    public static String generateUsername() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMddHHmm");
        String uniqueId = dateFormat.format(new Date());
        return "Bluna_Test_" + uniqueId;
    }
}
