package com.directi.training.dip.exercise;

import java.io.*;

public class File implements IReader, IWriter{
    BufferedReader reader = null;
    BufferedWriter writer = null;
    public File(String readerPath, String writerPath) throws IOException {
        try {
            reader = new BufferedReader(new FileReader(readerPath));
            writer = new BufferedWriter(new FileWriter(writerPath));
        } finally {
            if (writer != null) {
                writer.close();
            }
            if (reader != null) {
                reader.close();
            }
        }
    }
    @Override
    public String read() throws IOException {
        StringBuilder buffer = new StringBuilder();
        String aLine;
        while ((aLine = reader.readLine()) != null) {
            buffer.append(aLine);
        }
        return buffer.toString();
    }

    @Override
    public void write(String data) throws IOException {
        writer.write(data);
    }
}
