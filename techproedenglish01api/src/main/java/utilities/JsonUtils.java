package utilities;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

//ObjectMapper is a class, it is used to serialization ar de-serialization like GSON

public class JsonUtils {
	
	private static ObjectMapper mapper; 
	
	static {
		mapper = new ObjectMapper();
	}
	
	//1.Method is for "serialization" (Convert Java Object to Json)
	public static String convertJavaToJson(Object obj) {
		
		String jsonResult = "";
		
		try {
			jsonResult = mapper.writeValueAsString(obj);
		} catch (JsonGenerationException e) {
			System.out.println("Object could not be converted to Json" + e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("Object could not be converted to Json" + e.getMessage());
		} catch (IOException e) {
			System.out.println("Object could not be converted to Json" + e.getMessage());
		}
		
		return jsonResult;
		
	}

	//2.Method is for "de-serialization" (Convert Json to Java Object)
	//Generic Method:You will decide return type when you use the method
	
	public static <T> T convertJsonToJava(String json, Class<T> cls) {
		
		T javaResult = null;
		 
		try {
			javaResult = mapper.readValue(json, cls);
		} catch (JsonParseException e) {
			System.out.println("Could not convert Json to Java Object" + e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("Could not convert Json to Java Object" + e.getMessage());
		} catch (IOException e) {
			System.out.println("Could not convert Json to Java Object" + e.getMessage());
		}
		
		return javaResult;
	}

}
