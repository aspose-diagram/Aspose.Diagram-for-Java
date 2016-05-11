package com.aspose.diagram.examples.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.Set;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.FormatTxt;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.Txt;
import com.aspose.diagram.examples.Utils;

public class FindAndReplaceShapeText {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:FindAndReplaceShapeText
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(FindAndReplaceShapeText.class); 
        // load diagram
        Diagram diagram = new Diagram(dataDir + "FindReplaceText.vsdx");

        DateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy");
        Date myDate = new Date(System.currentTimeMillis());
        Calendar cal = Calendar.getInstance();

        // Prepare a collection old and new text
        Hashtable<String, String> replacements = new Hashtable<String, String>();
        replacements.put("[[CompanyName]]", "Research Society of XYZ");
        replacements.put("[[CompanyName]]", "Research Society of XYZ");
        replacements.put("[[EmplyeeName]]", "James Bond");
        replacements.put("[[SubjectTitle]]", "The affect of the internet on social behavior in the industrialize world");

        cal.setTime(myDate);
        cal.add(Calendar.YEAR, -1);
        System.out.println(dateFormat.format(cal.getTime()));
        replacements.put("[[TimePeriod]]", dateFormat.format(cal.getTime()) + " -- " + dateFormat.format(myDate));

        cal.setTime(myDate);
        cal.add(Calendar.DAY_OF_MONTH, -7);
        System.out.println(dateFormat.format(cal.getTime()));
        replacements.put("[[SubmissionDate]]", dateFormat.format(cal.getTime()));
        replacements.put("[[AmountReq]]", "$100,000");

        cal.setTime(myDate);
        cal.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println(dateFormat.format(cal.getTime()));
        replacements.put("[[DateApproved]]", dateFormat.format(cal.getTime()));

        // Iterate through the shapes of a page
        for (Shape shape : (Iterable<Shape>) diagram.getPages().getPage("Page-1").getShapes())
        {
            Set<String> keys = replacements.keySet();
            for(String key: keys)
            {
                for (FormatTxt txt : (Iterable<FormatTxt>) shape.getText().getValue())
                {
               	    Txt tx = (Txt)((txt instanceof Txt) ? txt : null);
                    if (tx != null && tx.getText().contains(key))
                    {
                        //find and replace text of a shape
                        tx.setText(tx.getText().replace(key, replacements.get(key)));
                    }
                }
            }
        }
        // Save the diagram
        diagram.save(dataDir + "FindAndReplaceShapeText_Out.vsdx", SaveFileFormat.VSDX);
        //ExEnd:FindAndReplaceShapeText
	}

}
