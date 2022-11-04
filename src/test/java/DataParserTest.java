import de.unitrier.st.core.CountryDataPoint;
import de.unitrier.st.core.DataLoader;
import de.unitrier.st.core.DataParser;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class DataParserTest {

    @Test
    public void testParseJsonData() {
        DataLoader dataLoader = new DataLoader();
        DataParser dataParser = new DataParser();
        String json = dataLoader.loadJsonFile("countries-aggregated_json.json");
        Map<String, List<CountryDataPoint>> data = dataParser.parseJsonData(json);
        Assert.assertFalse(data.isEmpty());
    }
}