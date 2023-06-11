
public class Main {
    public static void main(String[] args) {
        String s = "         ,r'\"7\n" + 	// \" -> "은 \붙여야 출력
                "r`-_   ,'  ,/\n" +
                " \\. \". L_r'\n" + 		// \\, \" 은 \붙어야 출력
                "   `~\\/\n" + 			// \\ \붙어야 출력
                "      |\n" + 			
                "      |";

        System.out.print(s);
    }
}