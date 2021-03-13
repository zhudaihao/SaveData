package com.gemini.cloud.app.mysavedata.saveUtils;

import java.util.Set;

/**
 * @author zhudaihao
 * @data 2021-3-12
 */
public class DataSaveUtils implements Save {
    private static volatile DataSaveUtils mDataSaveUtils;
    private Save mSave;

    private DataSaveUtils() {
    }

    //获取实例对象
    public static DataSaveUtils getInstance() {
        if (mDataSaveUtils == null) {
            synchronized (DataSaveUtils.class) {
                if (mDataSaveUtils == null) {
                }
                mDataSaveUtils = new DataSaveUtils();

            }
        }
        return mDataSaveUtils;
    }

    //初始化 save
    public void initSave(Save save) {
        mSave = save;
    }


    /**
     * 保存值
     *
     * @param key
     * @param value
     */
    @Override
    public void encode(String key, boolean value) {
        if (mSave != null) {
            mSave.encode(key, value);
        }
    }

    @Override
    public void encode(String key, String value) {
        if (mSave != null) {
            mSave.encode(key, value);
        }
    }

    @Override
    public void encode(String key, Set value) {
        if (mSave != null) {
            mSave.encode(key, value);
        }
    }

    @Override
    public void encode(String key, byte[] value) {
        if (mSave != null) {
            mSave.encode(key, value);
        }
    }

    @Override
    public void encode(String key, int value) {
        if (mSave != null) {
            mSave.encode(key, value);
        }
    }

    @Override
    public void encode(String key, long value) {
        if (mSave != null) {
            mSave.encode(key, value);
        }
    }

    @Override
    public void encode(String key, float value) {
        if (mSave != null) {
            mSave.encode(key, value);
        }
    }

    @Override
    public void encode(String key, double value) {
        if (mSave != null) {
            mSave.encode(key, value);
        }
    }

    /**
     * 获取值
     *
     * @param key
     * @return
     */

    @Override
    public boolean decodeBool(String key) {
        if (mSave != null) {
            return mSave.decodeBool(key);
        }
        return true;
    }

    @Override
    public String decodeString(String key) {
        if (mSave != null) {
            return mSave.decodeString(key);
        }
        return null;
    }

    @Override
    public Set decodeStringSet(String key) {
        if (mSave != null) {
            return mSave.decodeStringSet(key);
        }
        return null;
    }

    @Override
    public byte[] decodeBytes(String key) {
        if (mSave != null) {
            return mSave.decodeBytes(key);
        }

        return null;
    }

    @Override
    public int decodeInt(String key) {
        if (mSave != null) {
            return mSave.decodeInt(key);
        }
        return 0;
    }

    @Override
    public long decodeLong(String key) {
        if (mSave != null) {
            return mSave.decodeLong(key);
        }
        return 0;
    }

    @Override
    public double decodeDouble(String key) {
        if (mSave != null) {
            return mSave.decodeDouble(key);
        }
        return 0;
    }

    @Override
    public boolean decodeBool(String key, boolean value) {
        if (mSave != null) {
            return mSave.decodeBool(key);
        }
        return true;
    }

    @Override
    public String decodeString(String key, String value) {
        if (mSave != null) {
            return mSave.decodeString(key);
        }
        return null;
    }

    @Override
    public Set decodeStringSet(String key, Set value) {
        if (mSave != null) {
            return mSave.decodeStringSet(key);
        }
        return null;
    }

    @Override
    public byte[] decodeBytes(String key, byte[] value) {
        if (mSave != null) {
            return mSave.decodeBytes(key);
        }
        return new byte[0];
    }

    @Override
    public int decodeInt(String key, int value) {
        if (mSave != null) {
            return mSave.decodeInt(key);
        }
        return 0;
    }

    @Override
    public long decodeLong(String key, long value) {
        if (mSave != null) {
            return mSave.decodeLong(key);
        }
        return 0;
    }

    @Override
    public double decodeDouble(String key, double value) {
        if (mSave != null) {
            return mSave.decodeDouble(key);
        }
        return 0;
    }


}
