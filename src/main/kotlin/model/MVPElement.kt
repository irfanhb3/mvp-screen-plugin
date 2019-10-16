package model

import util.toSnakeCase
import java.io.Serializable

private const val UNNAMED_ELEMENT = "UnnamedElement"

data class ScreenElement(var name: String = "",
                         var template: String = "",
                         var fileType: FileType = FileType.KOTLIN,
                         var fileNameTemplate: String = "") : Serializable {

    override fun toString() = name

    fun body(screenName: String, packageName: String, androidComponent: String, androidComponentBaseClass: String) =
            template.replaceVariables(screenName, packageName, androidComponent, androidComponentBaseClass)

    fun fileName(screenName: String, packageName: String, androidComponent: String, androidComponentBaseClass: String) =
            fileNameTemplate.replaceVariables(screenName, packageName, androidComponent, androidComponentBaseClass).run {
                if (fileType == FileType.LAYOUT_XML)
                    toLowerCase()
                else
                    this
            }

    private fun String.replaceVariables(screenName: String, packageName: String, androidComponent: String, androidComponentBaseClass: String) =
            replace(FileNames.NAME.value, screenName)
                    .replace(FileNames.NAME_SNAKE_CASE.value, screenName.toSnakeCase())
                    .replace(FileNames.NAME_LOWER_CASE.value, screenName.decapitalize())
                    .replace(FileNames.SCREEN_ELEMENT.value, name)
                    .replace(FileNames.PACKAGE_NAME.value, packageName)
                    .replace(FileNames.ANDROID_COMPONENT_NAME.value, androidComponent)
                    .replace(FileNames.ANDROID_COMPONENT_NAME_LOWER_CASE.value, androidComponent.decapitalize())
                    .replace(FileNames.ANDROID_COMPONENT_FULL_CLASS_NAME.value, androidComponentBaseClass)
                    .replace(FileNames.ANDROID_COMPONENT_CLASS_NAME.value, androidComponentBaseClass.substring(androidComponentBaseClass.lastIndexOf(".") + 1))

    companion object {
        fun getDefault() = ScreenElement(UNNAMED_ELEMENT, FileType.KOTLIN.defaultTemplate, FileType.KOTLIN, FileType.KOTLIN.defaultFileName)
    }
}