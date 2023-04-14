# Murmur3 Hash Function in Java

This repository contains a Java implementation of the Murmur3 hash function. Murmur3 is a non-cryptographic hash function that is commonly used for hash-based lookups, such as in hash tables or bloom filters.

## Getting Started

To use the Murmur3 hash function in your Java project, simply download the Murmur3.java file and add it to your project's source code. The Murmur3 class contains one static methods for generating 32-bit hash values:
```
public static long hash32(String data,  long seed);
```
```
public static long hash32(final byte[] data, int length, long seed);
```
Both methods take an array of bytes as input, along with an optional seed value. The hash32 method returns a 32-bit hash value as an long. 

Here's an example of how to use the hash32 method:
```
byte[] data = "hello world".getBytes();
int hash = Murmur3.hash32(data, 0);
System.out.println("Hash value: " + hash);
```

This will output the following:
```
Hash value: 7EC86198
```

## Contributing

If you find a bug or have a suggestion for improving the Murmur3 hash function implementation, please feel free to open an issue or submit a pull request. We welcome contributions from the community!

## License

This repository is licensed under the MIT License. See the LICENSE file for more information.
