package lab10.assignment_10_1.bugreporter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import lab10.assignment_10_1.classfinder.ClassFinder;

/**
 * This class scans the package lab10.assignment_10_1.javapackage for classes with
 * annotation @BugReport. It then generates a bug report bugreport.txt,
 * formatted like this:
 * 
 * Joe Smith reportedBy: classname: description: severity:
 * 
 * reportedBy: classname: description: severity:
 * 
 * Tom Jones reportedBy: classname: description: severity:
 * 
 * reportedBy: classname: description: severity:
 * 
 *
 */
public class BugReportGenerator {
    private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
    private static final String PACKAGE_TO_SCAN = "lab10.assignment_10_1.javapackage";
    private static final String REPORT_NAME = "bug_report.txt";
    private static final String REPORTED_BY = "reportedBy: ";
    private static final String CLASS_NAME = "classname: ";
    private static final String DESCRIPTION = "description: ";
    private static final String SEVERITY = "severity: ";

    public void reportGenerator() {
        List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);

        // sample code for reading annotations -- you will need to change
        // this quite a bit to solve the problem
        // Sample code below obtains a list of names of developers assigned to bugs
        List<String> names = new ArrayList<String>();
        Map<String, String> infos = new HashMap<>();
        for (Class<?> cl : classes) {
            if (cl.isAnnotationPresent(BugReport.class)) {
                BugReport annotation = (BugReport) cl.getAnnotation(BugReport.class);
                String name = annotation.assignedTo();
                String reportedBy = annotation.reportedBy();
                String description = annotation.description();
                int severity = annotation.severity();
                if (!names.contains(name)) {
                    names.add(name);    
                }
                StringBuilder buf = new StringBuilder();
                buf.append("  reported by: ");buf.append(reportedBy + "\n");
                buf.append("  classname: ");buf.append(cl.getClass().getCanonicalName() + "\n");
                buf.append("  description: ");buf.append(description + "\n");
                buf.append("  severity: ");buf.append(severity + "\n");
                if (infos.containsKey(name)) {
                    // the key exists, should append bug info
                    buf.append("\n");
                    buf.append(infos.get(name));
                }
                infos.put(name, buf.toString());
            }
        }
        
        File report = new File("bug_report.txt");
        
        try {
            PrintWriter writer = new PrintWriter(report);
            infos.forEach((name, info) -> { writer.write(name + "\n"); writer.write(info + "\n"); });
            writer.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }

}
