public class ConfigurationCheck {

    public static void main(String[] args) {

       
        int maxUsers = 1500;                
        double threshold = 0.85;            
        boolean featureEnabled = true;      
        String environment = "PROD";        

        
        System.out.println("Environment    : " + environment);
        System.out.println("Max Users      : " + maxUsers);
        System.out.println("Threshold      : " + threshold);
        System.out.println("Feature Enabled: " + featureEnabled);

        
        int maxUserLimit = 1000;
        double thresholdLimit = 0.80;

        
        if (maxUsers > maxUserLimit) {
            System.out.println("WARNING: Max users exceed the allowed limit!");
        }

        if (threshold > thresholdLimit) {
            System.out.println("WARNING: Threshold exceeds the safe limit!");
        }
    }
}