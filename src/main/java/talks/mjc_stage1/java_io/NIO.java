package talks.mjc_stage1.java_io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIO {
    public static void main(String[] args) {
        try(RandomAccessFile aFile = new RandomAccessFile("Profile.txt", "r");
            FileChannel inChannel = aFile.getChannel();) {

            long fileSize = inChannel.size();

            //Create buffer of the file size
            ByteBuffer buffer = ByteBuffer.allocate((int) fileSize);
            inChannel.read(buffer);
            buffer.flip();

            // Verify the file content
            for (int i = 0; i < fileSize; i++) {
                System.out.print((char) buffer.get());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        try(RandomAccessFile aFile = new RandomAccessFile("Profile.txt","r");
//            FileChannel inChannel = aFile.getChannel()){
//            //Buffer size is 1024
//            ByteBuffer buffer = ByteBuffer.allocate(1024);
//
//            while(inChannel.read(buffer) > 0){
//                buffer.flip();
//                for (int i = 0; i < buffer.limit(); i++) {
//                    System.out.print((char) buffer.get());
//                }
//                buffer.clear();
//            }
//        }  catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
    }
}
