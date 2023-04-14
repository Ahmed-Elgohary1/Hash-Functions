# FNV Hash Function in Java

This repository contains a Java implementation of the FNV hash function. FNV is a non-cryptographic hash function that is commonly used for hash-based lookups, such as in hash tables or bloom filters.

## Getting Started

To use the FNV hash function in your Java project, simply download the FNV.java file and add it to your project's source code. The FNV class contains two static methods for generating 32-bit and 64-bit hash values:
```
public static long fnv(String data);
```
```
private static long fnv(byte[] bytes);
```


Both methods take an array of bytes as input, along with an optional seed value. The hash32 method returns a 32-bit hash value as an long.

Here's an example of how to use the hash32 method:
```
byte[] data = "hello world".getBytes();
int hash = FNV.hash32(data, 0);
System.out.println("Hash value: " + hash);
```

This will output the following:
```
Hash value: 548DA96F
```

## Contributing

If you find a bug or have a suggestion for improving the FNV hash function implementation, please feel free to open an issue or submit a pull request. We welcome contributions from the community!

## License

This repository is licensed under the MIT License. See the LICENSE file for more information.
