public class KonversiTipeDataNumber {
    public static void main(String[] args) {
        //Widening
        short tipeDataShort = 10;
        int tipeDataInt = tipeDataShort;
        long tipeDataLong = tipeDataInt;

        //Narrowing
        int tipeDataInteger2 = 10;
        byte tipeDataByte = (byte) tipeDataInteger2;

        //number overflow
        int tipeDataInteger = 128;
        byte tipeDataByteConverted = (byte) tipeDataInteger;
        System.out.println(tipeDataByteConverted);
    }
}
