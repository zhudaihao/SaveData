package com.gemini.cloud.app.mysavedata.saveUtils;

import java.util.Set;

/**
 * @author zhudaihao
 * @data 2013-3-12
 */
public interface Save {
    void encode(String key, boolean value);

    void encode(String key, int value);

    void encode(String key, long value);

    void encode(String key, float value);

    void encode(String key, double value);

    void encode(String key, String value);

    void encode(String key, Set value);

    void encode(String key, byte[] value);


    boolean decodeBool(String key);

    int decodeInt(String key);

    long decodeLong(String key);

    double decodeDouble(String key);

    String decodeString(String key);

    Set decodeStringSet(String key);

    byte[] decodeBytes(String key);

    boolean decodeBool(String key, boolean value);

    int decodeInt(String key, int value);

    long decodeLong(String key, long value);

    double decodeDouble(String key, double value);

    String decodeString(String key, String value);

    Set decodeStringSet(String key, Set value);

    byte[] decodeBytes(String key, byte[] value);

}
