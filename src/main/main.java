

import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.model.ZipParameters;

import java.io.File;

public class main {
    public static void main(String[] args) {

        
        //TODO: код не работает из-за версии zip4j. Разберись потом
        String path = "C:\\Users\\kasya\\Desktop\\11";
        ZipParameters parameters = new ZipParameters();
        parameters
                .setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
        parameters
                .setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_ULTRA);
        parameters
                .setEncryptFiles(true);
        parameters
                .setEncryptionMethod(Zip4jConstants.ENC_METHOD_AES);
        parameters
                .setAesKeyStrength(Zip4jConstants.AES_STRENGTH_256);
        parameters
                .setPassword("123");
        try {
            ZipFile zipFile = new ZipFile(path + "archive.zip");
            zipFile.addFile(
                    new File(path + "output.txt"),
                    parameters);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
