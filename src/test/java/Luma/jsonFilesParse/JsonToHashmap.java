package Luma.jsonFilesParse;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToHashmap {
	
	public static List<HashMap<String, String>> hashmapConverter() throws IOException {
		String stringJson=FileUtils.readFileToString(new File(System.getProperty("user.dir")+"//src//test//java//Luma//jsonFilesParse//params.json"),StandardCharsets.UTF_8);
		ObjectMapper mapper=new ObjectMapper();
		List<HashMap<String,String>> paramData=mapper.readValue(stringJson, new TypeReference<List<HashMap<String,String>>>() {
		});
		return paramData;
	}

}
