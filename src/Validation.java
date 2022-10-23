public class Validation {
    public static String validOrDefaultValue(String value, String defaultValue){
        if(value == null|| value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }
}
