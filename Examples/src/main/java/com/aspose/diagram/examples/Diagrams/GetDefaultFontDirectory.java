package com.aspose.diagram.examples.Diagrams;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.examples.Utils;

public class GetDefaultFontDirectory {
    public static void main(String[] args) throws Exception {
        // ExStart:GetDefaultFontDirectory
        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(RetrieveFontInfo.class) + "Diagrams/";

        // Call the diagram constructor to load diagram
        Diagram diagram = new Diagram(dataDir + "RetrieveFontInfo.vsd");

        // Display font default directory
        System.out.println(diagram.getDefaultFontDir());
        // ExEnd:GetDefaultFontDirectory
    }
}
