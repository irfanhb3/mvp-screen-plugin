package model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 (2\u00020\u0001:\u0001(B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ&\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u00d6\u0003J&\u0010#\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003J\t\u0010$\u001a\u00020%H\u00d6\u0001J\b\u0010&\u001a\u00020\u0003H\u0016J,\u0010\'\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0002R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f\u00a8\u0006)"}, d2 = {"Lmodel/ScreenElement;", "Ljava/io/Serializable;", "name", "", "template", "fileType", "Lmodel/FileType;", "fileNameTemplate", "(Ljava/lang/String;Ljava/lang/String;Lmodel/FileType;Ljava/lang/String;)V", "getFileNameTemplate", "()Ljava/lang/String;", "setFileNameTemplate", "(Ljava/lang/String;)V", "getFileType", "()Lmodel/FileType;", "setFileType", "(Lmodel/FileType;)V", "getName", "setName", "getTemplate", "setTemplate", "body", "screenName", "packageName", "androidComponent", "androidComponentBaseClass", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "fileName", "hashCode", "", "toString", "replaceVariables", "Companion", "mvp"})
public final class ScreenElement implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String template;
    @org.jetbrains.annotations.NotNull()
    private model.FileType fileType;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fileNameTemplate;
    public static final model.ScreenElement.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String body(@org.jetbrains.annotations.NotNull()
    java.lang.String screenName, @org.jetbrains.annotations.NotNull()
    java.lang.String packageName, @org.jetbrains.annotations.NotNull()
    java.lang.String androidComponent, @org.jetbrains.annotations.NotNull()
    java.lang.String androidComponentBaseClass) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String fileName(@org.jetbrains.annotations.NotNull()
    java.lang.String screenName, @org.jetbrains.annotations.NotNull()
    java.lang.String packageName, @org.jetbrains.annotations.NotNull()
    java.lang.String androidComponent, @org.jetbrains.annotations.NotNull()
    java.lang.String androidComponentBaseClass) {
        return null;
    }
    
    private final java.lang.String replaceVariables(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver, java.lang.String screenName, java.lang.String packageName, java.lang.String androidComponent, java.lang.String androidComponentBaseClass) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTemplate() {
        return null;
    }
    
    public final void setTemplate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final model.FileType getFileType() {
        return null;
    }
    
    public final void setFileType(@org.jetbrains.annotations.NotNull()
    model.FileType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFileNameTemplate() {
        return null;
    }
    
    public final void setFileNameTemplate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public ScreenElement(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String template, @org.jetbrains.annotations.NotNull()
    model.FileType fileType, @org.jetbrains.annotations.NotNull()
    java.lang.String fileNameTemplate) {
        super();
    }
    
    public ScreenElement() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final model.FileType component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final model.ScreenElement copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String template, @org.jetbrains.annotations.NotNull()
    model.FileType fileType, @org.jetbrains.annotations.NotNull()
    java.lang.String fileNameTemplate) {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lmodel/ScreenElement$Companion;", "", "()V", "getDefault", "Lmodel/ScreenElement;", "mvp"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final model.ScreenElement getDefault() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}