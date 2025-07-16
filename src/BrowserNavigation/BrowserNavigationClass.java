package BrowserNavigation;

import java.util.*;

// Interface for navigation
interface NavigationManager {
    void openTab(String tab);
    void back();
    void forward();
    void showCurrentTab();
}

// Base class with encapsulated stacks
class TabNavigator implements NavigationManager {
    private Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();
    private String currentTab = null;

    @Override
    public void openTab(String tab) {
        if (currentTab != null) {
            backStack.push(currentTab);
        }
        currentTab = tab;
        forwardStack.clear();
        System.out.println("Opened tab: " + tab);
    }

    @Override
    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentTab);
            currentTab = backStack.pop();
            System.out.println("Back to: " + currentTab);
        } else {
            System.out.println("No tab to go back to.");
        }
    }

    @Override
    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentTab);
            currentTab = forwardStack.pop();
            System.out.println("Forward to: " + currentTab);
        } else {
            System.out.println("No tab to go forward to.");
        }
    }

    @Override
    public void showCurrentTab() {
        System.out.println("Current tab: " + currentTab);
    }
}



// Demo
public class BrowserNavigationClass {
    public static void main(String[] args) {
        NavigationManager navigator = new TabNavigator();
        navigator.openTab("Home");
        navigator.openTab("About");
        navigator.openTab("Contact");
        navigator.back();
        navigator.showCurrentTab();
        navigator.back();
        navigator.showCurrentTab();
        navigator.forward();
        navigator.showCurrentTab();
        navigator.openTab("Blog");
        navigator.showCurrentTab();
        navigator.forward(); // Should say no tab to go forward to
    }
}