package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object Username
     
    /**
     * <p></p>
     */
    public static Object Password
     
    /**
     * <p></p>
     */
    public static Object AdminPortalHeaderText
     
    /**
     * <p></p>
     */
    public static Object CampaignCodeField
     
    /**
     * <p></p>
     */
    public static Object Intakeyear
     
    /**
     * <p></p>
     */
    public static Object SalesStaff
     
    /**
     * <p></p>
     */
    public static Object BrandCampus
     
    /**
     * <p></p>
     */
    public static Object BrandCampusMapping
     
    /**
     * <p></p>
     */
    public static Object ContactPersonCampaign
     
    /**
     * <p></p>
     */
    public static Object AssesmentProcessName
     
    /**
     * <p></p>
     */
    public static Object AssesmentProcessNameWithStage
     
    /**
     * <p></p>
     */
    public static Object ProgramName
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            url = selectedVariables['url']
            Username = selectedVariables['Username']
            Password = selectedVariables['Password']
            AdminPortalHeaderText = selectedVariables['AdminPortalHeaderText']
            CampaignCodeField = selectedVariables['CampaignCodeField']
            Intakeyear = selectedVariables['Intakeyear']
            SalesStaff = selectedVariables['SalesStaff']
            BrandCampus = selectedVariables['BrandCampus']
            BrandCampusMapping = selectedVariables['BrandCampusMapping']
            ContactPersonCampaign = selectedVariables['ContactPersonCampaign']
            AssesmentProcessName = selectedVariables['AssesmentProcessName']
            AssesmentProcessNameWithStage = selectedVariables['AssesmentProcessNameWithStage']
            ProgramName = selectedVariables['ProgramName']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
