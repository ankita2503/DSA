package random;

public class parseMarkdownHeader {

    public static void main(String[] args) {
        String input = "### This is a header";
        String output = parseMarkdownHeader(input);
        System.out.println(output);
        // Output: <h3>This is a header</h3>
    }

    public static String parseMarkdownHeader(String markdown) {
        if (markdown == null || markdown.isEmpty()) {
            return "";
        }

        int headerLevel = 0;
        while (headerLevel < markdown.length() && markdown.charAt(headerLevel) == '#') {
            headerLevel++;
        }

        if (headerLevel == 0 || headerLevel > 6 || (headerLevel < markdown.length() && markdown.charAt(headerLevel) != ' ')) {
            return markdown;
        }

        String headerText = markdown.substring(headerLevel).trim();
        String headerTag = "h" + headerLevel;

        return "<" + headerTag + ">" + headerText + "</" + headerTag + ">";
    }

}
