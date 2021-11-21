package graph;


import java.util.Stack;

public class Challenge41 {
    public static String currentUrl = "";
    public static final Stack<String> forwardS = new Stack<>();
    public static final Stack<String> backS = new Stack<>();
    public static String link(String url) {
        if (currentUrl != "") {
            backS.add(currentUrl);
        }
        currentUrl = url;
        return currentUrl;
    }
    public static String forward() {
        if (forwardS.isEmpty() ||
                currentUrl == forwardS.peek()) {
        }
        else {
            backS.add(currentUrl);
            currentUrl = forwardS.peek();
            forwardS.pop();
        }
        return currentUrl;
    }
    public static String back() {
        if (backS.isEmpty() ||
                currentUrl == backS.peek()) {
            System.out.print("null\n");
        }
        else {
            forwardS.add(currentUrl);
            currentUrl = backS.peek();
            backS.pop();
        }
        return currentUrl;
    }


    public static void main(String[] args) {
        System.out.println("Code challenge 41 =>");
        link("1");
        link("2");
        link("3");
        link("4");
        System.out.print(back());
        System.out.print(","+forward());
        link("5");
        System.out.print("," + back()+"\n");
    }
}
