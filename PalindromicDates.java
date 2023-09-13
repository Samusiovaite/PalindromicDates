public class PalindromicDates{
  public static void printBonusDatesBetween (int fromYear, int toYear) {
    for (int year = fromYear; year <= toYear; year++) {
      for (int month = 1; month <= 12; month++) {
          for (int day = 1; day <= 31; day++) {
            String dateString = String.format("%04d-%02d-%02d", year, month, day);
            String input = dateString.replaceAll("-", "");
              if (input.equals(new StringBuilder(input).reverse().toString())) {
                System.out.println(dateString);
              }
          }
      }
    }
  }
}