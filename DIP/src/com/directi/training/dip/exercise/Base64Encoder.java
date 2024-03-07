package com.directi.training.dip.exercise;

import java.io.IOException;
import java.util.Base64;

public class Base64Encoder implements IEncoder{
    @Override
    public void encode(IReader reader, IWriter writer) throws IOException {
        String data = reader.read();
        String encodedLine = Base64.getEncoder().encodeToString(data.getBytes());
        writer.write(encodedLine);
    }
}
