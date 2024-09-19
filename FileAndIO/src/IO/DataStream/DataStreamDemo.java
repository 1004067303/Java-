package IO.DataStream;

import java.io.*;

public class DataStreamDemo {
    public static void main(String[] args) {
        try (DataOutputStream out=new DataOutputStream(new FileOutputStream("FileAndIO/src/IO/DataStream/file.txt"));
             DataInputStream in =new DataInputStream(new FileInputStream("FileAndIO/src/IO/DataStream/file.txt"))
        ){
            out.write(97);
            out.writeInt(97);
            out.writeInt(9);
            out.writeLong(972333333);
            out.writeBoolean(true);
            out.writeDouble(23.1414);
            out.writeUTF("asdasdsd芜湖");
//读取的时候 必须按照顺序来进行读取
            System.out.println(in.readByte());
            System.out.println(in.readInt());
            System.out.println(in.readInt());
            System.out.println(in.readLong());
            System.out.println(in.readBoolean());
            System.out.println(in.readDouble());
            System.out.println(in.readUTF());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
