package comp3350.kitchn.application;

import comp3350.kitchn.persistence.DataAccessStub;
/**
 * Created by kendel on 2017-02-11.
 */

public class Services {


    private static DataAccessStub dataAccessService = null;

    public static DataAccessStub createDataAccess(String dbName)
    {
        if (dataAccessService == null)
        {
            dataAccessService = new DataAccessStub(dbName);
            dataAccessService.open(MainActivity.dbName);
        }
        return dataAccessService;
    }

    public static DataAccessStub getDataAccess(String dbName)
    {
        if (dataAccessService == null)
        {
            System.out.println("Connection to data access has not been established.");
            System.exit(1);
        }
        return dataAccessService;
    }

    public static void closeDataAccess()
    {
        if (dataAccessService != null)
        {
            dataAccessService.close();
        }
        dataAccessService = null;
    }

}
