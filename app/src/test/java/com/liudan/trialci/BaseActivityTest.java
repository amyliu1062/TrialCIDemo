package com.liudan.trialci;

/**
 * Created by Hubert on 15/11/19.
 */
public class BaseActivityTest {


    public static final String SUCCESS_JSON = "{success:true}";
    public static final String FAILED_JSON = "{success:false, msg:'Test'}";

    static {
    }


    protected void createMockDB() {
    }

    /**
     * Add database initial here
     */
    protected void initialMockDB() {
    }

    protected void createMockHttpNetwork() {
    }

    protected void setUp() {
        createMockDB();
        createMockHttpNetwork();
        createMockRemoteService();
    }

    private void createMockRemoteService() {
    }

}
