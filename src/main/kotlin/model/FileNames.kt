package model

enum class FileNames(val value: String, val description: String) {
    NAME("%screenName%", "Name of the screen, e.g. ScreenName"),
    NAME_SNAKE_CASE("%screenNameSnakeCase%", "Name of the screen written in snake case, e.g. screen_name"),
    NAME_LOWER_CASE("%screenNameLowerCase%", "Name of the screen written in camel case starting with lower case, e.g. screenName"),
    SCREEN_ELEMENT("%MVPElement%", "Screen element's name, e.g. Presenter"),
    PACKAGE_NAME("%packageName%", "Full package name, e.g. com.sample"),
    ANDROID_COMPONENT_NAME("%component%", "Android component's name, e.g. Activity or Fragment"),
    ANDROID_COMPONENT_NAME_LOWER_CASE("%componentLowerCase%", "Android component's name written in camel case starting with lower case, e.g. activity or fragment"),
    ANDROID_COMPONENT_CLASS_NAME("%componentClass%", "Android component's base class, e.g. AppCompatActivity"),
    ANDROID_COMPONENT_FULL_CLASS_NAME("%componentClassFull%", "Android component's base class with package name, e.g. androidx.appcompat.app.AppCompatActivity")
}