package com.example.demo.domain.exception;

/**
 * descript
 *
 * @author orange
 * @Time 2018/2/2 0002
 */
public class Test {

    public static void main(String[] args) throws MyException {
       /* String error = "{" +
                "  \"RequestMethod\": \"PUT\", " +
                "  \"ResponseJsonParam\": \"{\\\"traceId\\\":\\\"1f4c1e356722c930\\\",\\\"code\\\":400,\\\"msg\\\":\\\"答案已公布，禁止再修改公布时间\\\",\\\"description\\\":null,\\\"errors\\\":null}\"," +
                "  \"Description\": \"Bad Request\", " +
                "  \"ErrorCode\": 107000400, " +
                "  \"Url\": \"http:\\/\\/192.168.8.45:8080\\/\\/v2\\/t\\/works\\/5a73c2d7eae4e22098314631\\/uptoTime?uptoTime=0\"," +
                "  \"BodyData\": \"{\\\"timeout\\\":30}\"" +
                "}  ";

        XhMsg xhMsg =  JSONArray.parseObject(error, XhMsg.class);

        ServerException serverException = JSONArray.parseObject(xhMsg.getResponseJsonParam(), ServerException.class);
        System.out.println(serverException.getMsg());*/

        try {
            float i = 1 / 0;
        } catch (Exception e) {
            throw new MyException("被除数不能为0 ---" + e.getMessage());
        }
    }

}
