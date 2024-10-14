package Task5;

interface Encryption {
    byte [] encryption(byte [] plainData);
    byte [] decryption(byte [] cipherData);
}
interface SymmetricEncryption extends Encryption {
    void setKey(byte[] key);
}

interface AsymmetricEncryption extends Encryption {
    void setPublicKey(byte[] publicKey);
    void setPrivateKey(byte[] privateKey);
}
public class StreamXOREncryption implements SymmetricEncryption {
    private byte[] xorKey;

    @Override
    public void setKey(byte[] key) {
        if (key.length < 1) {
            throw new IllegalArgumentException("XOR key must be >= single byte.");
        }
        this.xorKey = key;
    }

    public static byte[] xor(byte[] data, byte[] xorKey) {
        byte[] result = new byte[data.length];
        for (int i = 0; i < data.length; i++) {
            //System.out.printf("%d^%d = %d\n", data[i], xorKey[i % xorKey.length], data[i] ^ xorKey[i % xorKey.length]);
            result[i] = (byte) (data[i] ^ xorKey[i % xorKey.length]);
        }
        return result;
    }

    @Override
    public byte[] encryption(byte[] data) {
        return xor(data, this.xorKey);
    }

    // Реалізація методу дешифрування (в XOR шифруванні це одна і та ж операція)
    @Override
    public byte[] decryption(byte[] encryptedData) {
        return xor(encryptedData, this.xorKey);
    }
}
