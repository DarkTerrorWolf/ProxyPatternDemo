public class Client {
    public static void main(String[] args) {
        IProxyInterfrace failCondition = new ProxyWebpage("egator.greenriver.edu");

        //load webpage from the website
        System.out.println("---Load and show ---");
        failCondition.display();

        IProxyInterfrace passCondition = new ProxyWebpage("Freedom.com");

        //load the webpage from the site
        System.out.println("---Load and show ---");
        passCondition.display();

        System.out.println("---No load and show ---");
        passCondition.display();
    }
}
