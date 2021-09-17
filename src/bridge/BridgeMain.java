package bridge;

import bridge.page.AboutPage;
import bridge.page.CareersPage;
import bridge.theme.DarkTheme;

public class BridgeMain {
    public static void main(String[] args) {
        DarkTheme darkTheme = new DarkTheme();

        AboutPage aboutPage = new AboutPage(darkTheme);
        CareersPage careersPage = new CareersPage(darkTheme);

        System.out.println(aboutPage.getContent());// "About page in Dark Black";
        System.out.println(careersPage.getContent());// "Careers page in Dark Black";
    }
}
