package come.common;

/**
 * Created by xyz on 2017/9/26.
 */
public class CommonResult {
    private static final String SUCCESS="SUCCESS";
    private static final String FAIL="FAIL";

    public CommonResult(){

    }
    public CommonResult(String message,String result){
        this.message=message;
        this.result=result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    private  String message;
    private   String result;
    public static CommonResult getSuccess(String message){
        return  new CommonResult(SUCCESS,message);
    }
    public static CommonResult getFal(String message){
        return  new CommonResult(FAIL,message);
    }
}
