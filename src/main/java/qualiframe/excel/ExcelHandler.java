package qualiframe.excel;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import java.util.Map;
import java.util.TreeMap;

public class ExcelHandler
{
    public static Map<String,String> getTestDataInMap(String testDataFile,String sheetName,String testCaseID) throws Exception
    {
        Map<String,String> TestDataInMap=new TreeMap<String, String>();
        String query=null;
        query=String.format("SELECT * FROM %s WHERE Run='Yes' and TestCaseID='%s'",sheetName,testCaseID);
        Fillo fillo=new Fillo();
        Connection conn=null;
        Recordset recordset=null;
        try{
            conn=fillo.getConnection(testDataFile);
            recordset=conn.executeQuery(query);
            while(recordset.next())
            {
                for (String field:recordset.getFieldNames())
                {
                    TestDataInMap.put(field,recordset.getField(field));
                }
            }
        }
        catch (FilloException e)
        {
            e.printStackTrace();
            throw new Exception("Test Data not found...");
        }
        conn.close();
        return TestDataInMap;

    }
}
