package utility;

import cucumber.api.DataTable;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

public class Apiutil {
    public static void performGetOps(String url){
//        given()
//                .contentType(ContentType.JSON)
//        .when()
//                .get(url)
//        .then()
//                .statusCode(200)
//                .body("author1",containsString("RAVI")); // validating Response without printing response in console
        Response res=given()
                    .contentType(ContentType.JSON)
                .when()
                    .get(url);
         //To print response in console
        String resbody=res.getBody().prettyPrint();

    }

    public static void performGetWithPathparams(String value){
        given()
                .contentType(ContentType.JSON)
        .with()
                .pathParam("post",value)
        .when()
                .get("http://localhost:3000/posts/{post}") // equal to https://localhost:3000/posts/1(value passed)
        .then()
                .statusCode(200) //validAating statuscode
                .body("author1",is("RAVI")); // validating response body
    }

    public static void performPostwithBodyParameter(String URL){
        HashMap<String,String> map=new HashMap<String,String>();
        map.put("id","5");
        map.put("title" ,"JsonServer5");
        map.put("author5" ,"sankar");
        given()
                .contentType(ContentType.JSON)
                .body(map)
        .when()
                .post(URL)
        .then()
                .statusCode(201)
                .body("author5",is("sankar"));

    }


    public static void performPostwithBodyParameterasDatatable(DataTable dataTable,String URL){
        List<List<String>> data = dataTable.raw();
        HashMap<String,String> map=new HashMap<String,String>();
        map.put("id",data.get(1).get(0));
        map.put("title" ,data.get(1).get(1));
        map.put("author5" ,data.get(1).get(2));
        given()
                .contentType(ContentType.JSON)
                .body(map)
                .when()
                .post(URL)
                .then()
                .statusCode(201)
                .body("author5",is(data.get(1).get(2)));

    }

    public static void performDeleteWithPathparams(String value){
        given()
                .contentType(ContentType.JSON)
                .with()
                .pathParam("post",value)
         .when()
                .delete("http://localhost:3000/author/{post}") // equal to https://localhost:3000/author/1(value passed)
         .then()
                .statusCode(200); //validAating statuscode

    }

    public static void performPUTtwithBodyParameterasDatatable(DataTable dataTable,String URL){
        List<List<String>> data = dataTable.raw();
        HashMap<String,String> map=new HashMap<String,String>();
        map.put("id",data.get(1).get(0));
        map.put("title" ,data.get(1).get(1));
        map.put("author5" ,data.get(1).get(2));
        given()
                .contentType(ContentType.JSON)
                .pathParam("post",data.get(1).get(0))
                .body(map)
        .when()
                .put("http://localhost:3000/author/{post}")
       .then()
                .statusCode(200)
                .body("author5",is(data.get(1).get(2)));

    }
}
