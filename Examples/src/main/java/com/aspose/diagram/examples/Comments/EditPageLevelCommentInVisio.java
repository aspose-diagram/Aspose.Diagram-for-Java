package com.aspose.diagram.examples.Comments;

import com.aspose.diagram.Annotation;
import com.aspose.diagram.AnnotationCollection;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;

public class EditPageLevelCommentInVisio {

	public static void main(String[] args) throws Exception
    {
		//ExStart:EditPageLevelCommentInVisio
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(EditPageLevelCommentInVisio.class);
        // load Visio
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

        // get collection of the annotations
        AnnotationCollection annotations = diagram.getPages().getPage("Page-1").getPageSheet().getAnnotations();

        // iterate through the annotations
        for (Annotation annotation : (Iterable<Annotation>) annotations) 
        {
            String comment = annotation.getComment().getValue();
            comment += "Updation mark";
            annotation.getComment().setValue(comment);
        }
        // save Visio
        diagram.save(dataDir + "EditPageLevelCommentInVisio_Out.vsdx", SaveFileFormat.VSDX);
		//ExEnd:EditPageLevelCommentInVisio
	}

}
