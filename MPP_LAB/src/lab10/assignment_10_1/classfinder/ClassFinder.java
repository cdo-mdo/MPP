package lab10.assignment_10_1.classfinder;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

//DO NOT MODIFY
public class ClassFinder {

    private static final char DOT = '.';
    private static final char SLASH = '/';
    private static final String CLASS_SUFFIX = ".class";
    private static final String BAD_PACKAGE_ERROR = "Unable to get resources from path '%s'. Are you sure the package '%s' exists?";

    public static void main(String[] args) {
        List<Class<?>> classes = find("lab10.assignment_10_1.javapackage");
        classes.forEach(cl -> System.out.println(cl.getName()));
    }

    public static List<Class<?>> find(String scannedPackage) {
        String scannedPath = scannedPackage.replace(DOT, SLASH);
        URL scannedUrl = Thread.currentThread().getContextClassLoader().getResource(scannedPath);
        if (scannedUrl == null) {
            throw new IllegalArgumentException(String.format(BAD_PACKAGE_ERROR, scannedPath, scannedPackage));
        }
//        File scannedDir = new File(scannedUrl.getFile());
        File scannedDir = new File(scannedUrl.getFile().replace("%20", " ")); // First solution
//        File scannedDir = null; // Second solution
//        try {
//            scannedDir = new File(scannedUrl.toURI());
//        } catch (URISyntaxException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        File scannedDir = null; // Third solution
//        try {
//            scannedDir = new File(URLDecoder.decode(scannedUrl.getFile(), "UTF-8"));
//        } catch (UnsupportedEncodingException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        List<Class<?>> classes = new ArrayList<Class<?>>();
        for (File file : scannedDir.listFiles()) {
            classes.addAll(find(file, scannedPackage));
        }
        return classes;
    }

    private static List<Class<?>> find(File file, String scannedPackage) {
        List<Class<?>> classes = new ArrayList<Class<?>>();
        String resource = scannedPackage + DOT + file.getName();
        if (file.isDirectory()) {
            for (File child : file.listFiles()) {
                classes.addAll(find(child, resource));
            }
        } else if (resource.endsWith(CLASS_SUFFIX)) {
            int endIndex = resource.length() - CLASS_SUFFIX.length();
            String className = resource.substring(0, endIndex);
            try {
                classes.add(Class.forName(className));
            } catch (ClassNotFoundException ignore) {
            }
        }
        return classes;
    }

}
