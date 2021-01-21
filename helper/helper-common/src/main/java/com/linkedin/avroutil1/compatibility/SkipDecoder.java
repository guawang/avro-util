package com.linkedin.avroutil1.compatibility;

import java.io.IOException;
import org.apache.avro.Schema;
import org.apache.avro.io.Decoder;


public abstract class SkipDecoder extends Decoder {

  public int readStringSize() throws IOException {
    return 0;
  }

  public int readBytesSize() throws IOException {
    return 0;
  }

  public void readStringData(byte[] bytes, int start, int len) throws IOException {

  }

  public void readBytesData(byte[] bytes, int start, int len) throws IOException {

  }

  public boolean isBinaryDecoder() {
    return false;
  }

  public void drain() throws IOException {}

  public Schema.Field[] readFieldOrder() throws IOException {
    return null;
  }

}
