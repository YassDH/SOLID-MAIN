package com.directi.training.dip.exercise;

import java.io.IOException;

public interface IEncoder {
    void encode(IReader reader, IWriter writer) throws IOException;
}
