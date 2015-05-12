/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithshapes.protectunprotectshapes.java;

import com.aspose.diagram.*;

public class ProtectUnprotectShapes
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithshapes/protectunprotectshapes/data/";

        //Load diagram
        Diagram diagram = new Diagram(dataDir+ "Drawing1.vsd");

        Page page = diagram.getPages().getPage(0);

        Shape shape = page.getShapes().getShape(1);
        shape.getProtection().getLockAspect().setValue(BOOL.TRUE);
        shape.getProtection().getLockBegin().setValue(BOOL.TRUE);
        shape.getProtection().getLockCalcWH().setValue(BOOL.TRUE);
        shape.getProtection().getLockCrop().setValue(BOOL.TRUE);
        shape.getProtection().getLockCustProp().setValue(BOOL.TRUE);
        shape.getProtection().getLockDelete().setValue(BOOL.TRUE);
        shape.getProtection().getLockEnd().setValue(BOOL.TRUE);
        shape.getProtection().getLockFormat().setValue(BOOL.TRUE);
        shape.getProtection().getLockFromGroupFormat().setValue(BOOL.TRUE);
        shape.getProtection().getLockGroup().setValue(BOOL.TRUE);
        shape.getProtection().getLockHeight().setValue(BOOL.TRUE);
        shape.getProtection().getLockMoveX().setValue(BOOL.TRUE);
        shape.getProtection().getLockMoveY().setValue(BOOL.TRUE);
        shape.getProtection().getLockRotate().setValue(BOOL.TRUE);
        shape.getProtection().getLockSelect().setValue(BOOL.TRUE);
        shape.getProtection().getLockTextEdit().setValue(BOOL.TRUE);
        shape.getProtection().getLockThemeColors().setValue(BOOL.TRUE);
        shape.getProtection().getLockThemeEffects().setValue(BOOL.TRUE);
        shape.getProtection().getLockVtxEdit().setValue(BOOL.TRUE);
        shape.getProtection().getLockWidth().setValue(BOOL.TRUE);
        diagram.save(dataDir+ "output.vdx", SaveFileFormat.VDX);

        System.out.println("Process Completed Successfully");
    }
}




