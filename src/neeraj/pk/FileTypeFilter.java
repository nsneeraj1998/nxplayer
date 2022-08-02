/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neeraj.pk;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Welcome
 */
public class FileTypeFilter extends FileFilter {
    private final String extension;
    private final String description;
    
    public FileTypeFilter(String extension,String description){
        this.extension=extension;
        this.description=description;
    }
    @Override
    public boolean accept(File f) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       if(f.isDirectory()){
           return true;
        }
       return f.getName().endsWith(extension);
    }

    @Override
    public String getDescription() {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      return description+String.format("*%s",extension);
    }
    
}
