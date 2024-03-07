package com.directi.training.dip.exercise;

public class DatabaseWriter implements IWriter{
    MyDatabase database = new MyDatabase();
    public  void write(String data){
        database.write(data);
    }
}
