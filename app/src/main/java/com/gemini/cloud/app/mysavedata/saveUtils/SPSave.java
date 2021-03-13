package com.gemini.cloud.app.mysavedata.saveUtils;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Set;

public class SPSave implements Save {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    public SPSave(Context context) {
        sharedPreferences = context.getSharedPreferences("name", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

    }

    @Override
    public void encode(String key, boolean value) {
        editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.apply();

    }

    @Override
    public void encode(String key, String value) {
        editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }


    @Override
    public void encode(String key, int value) {
        editor = sharedPreferences.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    @Override
    public void encode(String key, long value) {
        editor = sharedPreferences.edit();
        editor.putLong(key, value);
        editor.apply();
    }

    @Override
    public void encode(String key, float value) {
        editor = sharedPreferences.edit();
        editor.putFloat(key, (long) value);
        editor.apply();
    }

    @Override
    public void encode(String key, double value) {
        editor = sharedPreferences.edit();
        editor.putFloat(key, (float) value);
        editor.apply();
    }


    @Override
    public void encode(String key, Set value) {
        editor = sharedPreferences.edit();
        editor.putStringSet(key, value);
        editor.apply();
    }

    @Override
    public void encode(String key, byte[] value) {

    }


    /**
     * @param key
     * @return
     */
    @Override
    public boolean decodeBool(String key) {
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean(key, false);
        }
        return false;
    }

    @Override
    public String decodeString(String key) {
        if (sharedPreferences != null) {
            return sharedPreferences.getString(key, "");
        }
        return null;
    }



    @Override
    public int decodeInt(String key) {
        if (sharedPreferences != null) {
            return sharedPreferences.getInt(key, 0);

        }
        return 0;
    }

    @Override
    public long decodeLong(String key) {
        if (sharedPreferences != null) {
            return sharedPreferences.getLong(key, 0);

        }
        return 0;
    }

    @Override
    public double decodeDouble(String key) {
        if (sharedPreferences != null) {
            return sharedPreferences.getFloat(key, 0);
        }
        return 0;
    }

    @Override
    public Set decodeStringSet(String key) {
        if (sharedPreferences != null) {
            return sharedPreferences.getStringSet(key, null);

        }
        return null;
    }

    @Override
    public byte[] decodeBytes(String key) {
        return new byte[0];
    }

    @Override
    public boolean decodeBool(String key, boolean value) {
        return false;
    }

    @Override
    public String decodeString(String key, String value) {
        return null;
    }

    @Override
    public Set decodeStringSet(String key, Set value) {
        return null;
    }

    @Override
    public byte[] decodeBytes(String key, byte[] value) {
        return new byte[0];
    }

    @Override
    public int decodeInt(String key, int value) {
        return 0;
    }

    @Override
    public long decodeLong(String key, long value) {
        return 0;
    }

    @Override
    public double decodeDouble(String key, double value) {
        return 0;
    }



}
