package com.directi.training.dip.exercise;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Network implements IReader{
    private URL url;
    private InputStream reader;
    public Network(String protocol, String host, String file) throws IOException {
        url = new URL(protocol, host, file);
        reader = url.openStream();
    }
    @Override
    public String read() throws IOException {
        StringBuilder inputString = new StringBuilder();
        int c;
        c = reader.read();
        while (c != -1) {
            inputString.append((char) c);
            c = reader.read();
        }
        return inputString.toString();
    }
}
