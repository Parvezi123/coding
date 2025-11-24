package Array;

import java.util.Arrays;

public class SortEmailWithDomain {
    public static void main(String[] args) {
        String[] emails = new String[]
        {
        "tamil@gmail.com",
        "bhuvanesh@yahoo.co.in",
        "accounts@vastscience.com",
        "parvez@hotmail.com",
        "koyena@abcmail.com"
        };

        for (int i = 0; i < emails.length; i++) {

            String firstEmail_domain = getDomainFromEmail(emails[i]);

            for (int j = i + 1; j < emails.length; j++) {

                String secondEmail_domain = getDomainFromEmail(emails[j]);

                if (firstEmail_domain.charAt(0) > secondEmail_domain.charAt(0)) {
                    swapEmail(i,j,emails);
                }
            }
        }
        System.out.println("Sorted Emails based on Domain: " + Arrays.toString(emails));
    }

    private static void swapEmail(int i, int j, String[] emails) {
        String tempFirstEmail_domain = emails[i];
        emails[i] = emails[j];
        emails[j] = tempFirstEmail_domain;
    }

    private static String getDomainFromEmail(String email) {
        int at_Index = email.indexOf('@');
        int dot_Index = email.indexOf('.');
        return email.substring(at_Index + 1, dot_Index);
    }
}
