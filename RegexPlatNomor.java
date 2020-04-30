public class RegexPlatNomor {
  public static void main(String[] args) {
    System.out.print(isValidatePoliceNumber("DE 134 ABC"));
  }
  
  private static boolean isValidatePoliceNumber(String data) {
    String pattern = "([A-Z]{1,2})(\\s|-)*([0-9]{0,4})*(\\s|-)*([A-Z\\d]{0,4})";
    return data.matches(pattern);
  }
}