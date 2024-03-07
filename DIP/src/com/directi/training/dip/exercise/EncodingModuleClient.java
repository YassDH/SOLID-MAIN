package com.directi.training.dip.exercise;

import java.io.IOException;

public class    EncodingModuleClient
{
    private static String beforeEncryptionFile = "DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt";
    private static String afterEncryptionFile = "DIP/src/com/directi/training/dip/exercise/afterEncryption.txt";

    public static void main(String[] args) throws IOException
    {

        IEncoder encodingModule = new Base64Encoder();
        IReader fileReader = new File(beforeEncryptionFile, afterEncryptionFile);
        IWriter fileWriter = new File(beforeEncryptionFile, afterEncryptionFile);

        encodingModule.encode(fileReader, fileWriter);

        IReader networkReader = new Network("http", "myfirstappwith.appspot.com", "/index.html");
        IWriter dbWriter = new DatabaseWriter();

        encodingModule.encode(networkReader, dbWriter);
    }
}
