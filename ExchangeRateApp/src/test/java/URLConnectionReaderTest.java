import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import static org.junit.Assert.*;

public class URLConnectionReaderTest {

    @Test
    public void testReaderNotNull() throws Exception {
        //When
        String SUT = URLConnectionReader.reader();
        //Then
        assertNotNull(SUT);
    }
    @Test
    public void testReaderDataFormat() throws Exception {
        //When
        String SUT = URLConnectionReader.reader();
        //Then
        try{
            new JSONObject(SUT);
        }catch(JSONException e){
            fail("Wrong data format: " + e.getMessage());
        }
    }
}