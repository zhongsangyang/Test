package come.common;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * Created by xyz on 2017/9/26.
 */
public class FileUtil {
    public static String getFilepath(HttpServletRequest request){
        String filepath=request.getServletContext().getRealPath("/");
        File file=new File(filepath,"upload");
        if (!file.exists()){
            file.mkdir();
        }
        return file.getAbsolutePath();
    }
}
