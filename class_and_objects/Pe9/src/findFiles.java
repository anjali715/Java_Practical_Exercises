import java.io.File;
import java.io.FilenameFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
public class findFiles {

    public static void main(String[] args) {
        
        File file = new File("/home/anjali/example");
        File[] files = file.listFiles(new FilenameFilter() {
                        
           public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".html")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        
        for(File f:files){
            String fileName = f.getAbsolutePath();
            InputStream is = null;
            try {
                is = new FileInputStream(fileName);
                byte content[] = new byte[1024];
                int readCount = 0;
                while((readCount = is.read(content)) > 0){
                    System.out.println(new String(content, 0, readCount-1));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try{
                    if(is != null) is.close();
                } catch(Exception ex){
                    
                }
            }
        }

    }

}