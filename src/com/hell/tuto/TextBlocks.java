package com.hell.tuto;

public class TextBlocks {

    public static void main(String[] args) {

        String query = """
            SELECT "EMP_ID", "EMP_LASTNAME", FROM "EMPLOYEE" WHERE "CITY" = 'INDIANAPOLIS' " +
            " ORDER BY "EMP_ID", "EMP_LASTNAME"
            """;

        String html = """
                <html>
                    <body>
                        <p>Hello World</p>
                    </body>
                </html>
                """;
        }

        

}


