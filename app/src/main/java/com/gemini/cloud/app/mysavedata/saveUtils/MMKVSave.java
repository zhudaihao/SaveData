package com.gemini.cloud.app.mysavedata.saveUtils;

import android.app.Activity;
import android.content.Context;

import com.tencent.mmkv.MMKV;

import java.util.Set;

/**
 * @author zhudaihao
 * @data 2021-3-12
 */
public class MMKVSave implements Save {

    public MMKVSave(Context context) {
        Context mContext;
        if (context instanceof Activity) {
            mContext = context.getApplicationContext();
        } else {
            mContext = context;
        }

        MMKV.initialize(mContext);
    }

    @Override
    public void encode(String key, boolean value) {
        MMKV.defaultMMKV().encode(key, value);
    }

    @Override
    public void encode(String key, String value) {
        MMKV.defaultMMKV().encode(key, value);
    }

    @Override
    public void encode(String key, Set value) {
        MMKV.defaultMMKV().encode(key, value);
    }


    /**
     * 保存值
     *
     * @param key
     * @param value
     */
    @Override
    public void encode(String key, byte[] value) {
        MMKV.defaultMMKV().encode(key, value);
    }

    @Override
    public void encode(String key, int value) {
        MMKV.defaultMMKV().encode(key, value);
    }

    @Override
    public void encode(String key, long value) {
        MMKV.defaultMMKV().encode(key, value);
    }

    @Override
    public void encode(String key, float value) {
        MMKV.defaultMMKV().encode(key, value);
    }

    @Override
    public void encode(String key, double value) {
        MMKV.defaultMMKV().encode(key, value);
    }


    /**
     * 获取值
     *
     * @param key
     * @return
     */
    @Override
    public boolean decodeBool(String key) {
        return MMKV.defaultMMKV().decodeBool(key);
    }

    @Override
    public String decodeString(String key) {
        return MMKV.defaultMMKV().decodeString(key);
    }

    public Set decodeStringSet(String key) {
        return MMKV.defaultMMKV().decodeStringSet(key);
    }

    @Override
    public byte[] decodeBytes(String key) {
        return MMKV.defaultMMKV().decodeBytes(key);
    }

    @Override
    public int decodeInt(String key) {
        return MMKV.defaultMMKV().decodeInt(key);
    }

    @Override
    public long decodeLong(String key) {
        return MMKV.defaultMMKV().decodeLong(key);
    }


    @Override
    public double decodeDouble(String key) {
        return MMKV.defaultMMKV().decodeDouble(key);
    }

    @Override
    public boolean decodeBool(String key, boolean value) {
        return MMKV.defaultMMKV().decodeBool(key);
    }

    @Override
    public String decodeString(String key, String value) {
        return MMKV.defaultMMKV().decodeString(key);
    }

    @Override
    public Set decodeStringSet(String key, Set value) {
        return MMKV.defaultMMKV().decodeStringSet(key);
    }

    @Override
    public byte[] decodeBytes(String key, byte[] value) {
        return MMKV.defaultMMKV().decodeBytes(key);
    }

    @Override
    public int decodeInt(String key, int value) {
        return MMKV.defaultMMKV().decodeInt(key);
    }

    @Override
    public long decodeLong(String key, long value) {
        return MMKV.defaultMMKV().decodeLong(key);
    }


    @Override
    public double decodeDouble(String key, double value) {
        return MMKV.defaultMMKV().decodeDouble(key);
    }
}
