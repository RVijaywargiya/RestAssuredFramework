package com.fetch.data;

import java.io.File;

public class Payloads {
    public static File getPayload(String filePath) {
        return new File(filePath);
    }
}
