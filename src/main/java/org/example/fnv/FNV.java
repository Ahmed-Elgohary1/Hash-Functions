package org.example.fnv;

public class FNV {
    /**
     * Helps convert a byte into its unsigned value
     */
    public static final int UNSIGNED_MASK = 0xff;

    /**
     * Helps convert integer to its unsigned value
     */
    public static final long UINT_MASK = 0xFFFFFFFFl;

    public static final long prime =16777619;



    public static long fnv(String data){
        byte[] bytes = data.getBytes();

        return fnv(bytes);
    }

    private static long fnv(byte[] bytes) {

      long hash=2166136261L;

      for(byte cur:bytes){
          hash=(hash*prime) & UINT_MASK;
          hash=(hash ^ (cur & UNSIGNED_MASK))&UINT_MASK;
      }

      return hash;
    }


}
