package come.controller;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import come.common.CommonResult;
import come.common.FileUtil;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by xyz on 2017/9/26.
 */
@Controller
@RequestMapping("/upload")
public class UploadController {
   @PostMapping("/file")
   @ResponseBody
    public CommonResult upload(MultipartFile file, HttpServletRequest request) {
        String path = file.getOriginalFilename();
        System.out.println(FileUtil.getFilepath(request));
        try {
//            FileUtils.copyInputStreamToFile(file.getInputStream(),
//                    new File(FileUtil.getFilepath(request) + "/" + path));
            file.transferTo(new File(FileUtil.getFilepath(request)+"/"+path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return CommonResult.getSuccess("CHENG gong!");
    }
    @RequestMapping("upload_page")
    public String upload_jsp(){

       return "upload";
    }
}
