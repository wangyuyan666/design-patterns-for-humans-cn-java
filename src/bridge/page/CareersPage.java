package bridge.page;

import bridge.theme.Theme;

public class CareersPage implements WebPage {
    private final Theme theme;

    public CareersPage(Theme theme) {
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return "Careers page in " + theme.getColor();
    }
}
