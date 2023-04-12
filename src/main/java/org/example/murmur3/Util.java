package org.example.murmur3;

import java.nio.ByteBuffer;

public class Util {


    private final static char[] hexArray = "0123456789ABCDEF".toCharArray();

    /**
     * Rotate left for 32 bits.
     *
     * @param original
     * @param shift
     * @return
     */
    public static long rotl32(long original, int shift) {
        return (original << shift ) | (original >>> (32 - shift)) ;
    }
    public static String display(long x) {
        return bytesToHex(longToBytes(x));
    }

    public static byte[] longToBytes(long x) {
        ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
        buffer.putLong(x);
        return buffer.array();
    }
    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for ( int j = 0; j < bytes.length; j++ ) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }
}
