package api.endpoints;

/* 
Swagger URI --> https://petstore.swagger.io

Create user(Post) : https://petstore.swagger.io/v2/user
Get user (Get): https://petstore.swagger.io/v2/user/{username}
Update user (Put) : https://petstore.swagger.io/v2/user/{username}
Delete user (Delete) : https://petstore.swagger.io/v2/user/{username}

*/

public class Routes {

	public static String base_url = "https://petstore.swagger.io/v2" ;
	
	//User module
	public static String post_url = base_url+"/user";
    public static String get_url = base_url+"/user/{username}";
    public static String update_url = base_url+"/user/{username}";
    public static String delete_url = base_url+"/user/{username}";

    //Pet module
    public static final String post_pet = base_url+"/pet";
    public static final String get_petById = base_url+"/pet/{petId}";
    public static final String put_pet = base_url+"/pet";

    public static final String delete_petById = base_url+"/pet/{petId}";







    //Store module

    //Here you will create Store module URL's

    //Here you will create Pet module URL's
    
    
}
