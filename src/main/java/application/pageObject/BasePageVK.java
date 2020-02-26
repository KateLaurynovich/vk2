package application.pageObject;

import application.forms.header.Header;
import application.forms.sideBar.SideBar;

public class BasePageVK {

    public Header getHeader() {
        return new Header();
    }

    public SideBar getSideBar() {
        return new SideBar();
    }
}
