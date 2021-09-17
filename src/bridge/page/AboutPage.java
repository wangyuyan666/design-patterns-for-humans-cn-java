package bridge.page;

import bridge.theme.Theme;

public class AboutPage implements WebPage {
    private final Theme theme;

    public AboutPage(Theme theme) {
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return "About page in " + theme.getColor();
    }
}
