package selenium.factoryBrowser;

public class FactoryBrowser {

    public static IBrowser make(String type) {
        IBrowser browser;

        switch (type.toLowerCase()) {
            case "chrome":
                browser = new Chrome();
                break;
            default:
                browser = new Chrome();
                break;
        }

        return browser;

    }

}
