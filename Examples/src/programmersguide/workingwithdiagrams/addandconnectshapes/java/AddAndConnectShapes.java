/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithdiagrams.addandconnectshapes.java;

import com.aspose.diagram.*;

public class AddAndConnectShapes
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithdiagrams/addandconnectshapes/data/";

        // Load masters from any existing diagram, stencil or template
        // and add in the new diagram
        String visioStencil = dataDir+ "Basic Shapes.vss";

        // Names of the masters present in the stencil
        String rectangleMaster = "Rectangle", starMaster = "Star 7",
                hexagonMaster = "Hexagon", connectorMaster = "Dynamic connector";

        int pageNumber = 0;
        double width = 2, height = 2, pinX = 4.25, pinY = 9.5;

        // Create a new diagram
        Diagram diagram = new Diagram(visioStencil);

        // Add a new rectangle shape
        long rectangleId = diagram.addShape(
                pinX, pinY, width, height, rectangleMaster, pageNumber);

        // Set the new shape's properties
        Shape shape = diagram.getPages().getPage(pageNumber).getShapes().getShape(rectangleId);
        shape.getText().getValue().add(new Txt("Rectangle text."));
        shape.setName("Rectangle1");
        shape.getXForm().getLocPinX().getUfe().setF("Width*0.5");
        shape.getXForm().getLocPinY().getUfe().setF("Height*0.5");
        shape.getLine().getLineColor().setValue("7");
        shape.getLine().getLineWeight().setValue(0.03);
        shape.getFill().getFillBkgnd().setValue("1");
        shape.getFill().getFillForegnd().setValue("3");
        shape.getFill().getFillPattern().setValue(31);

        // Add a new star shape
        pinX = 2.0;
        pinY = 4.5;
        long starId = diagram.addShape(
                pinX, pinY, width, height, starMaster, pageNumber);

        // Set the star shape's properties
        shape = diagram.getPages().getPage(pageNumber).getShapes().getShape(starId);
        shape.getText().getValue().add(new Txt("Star text."));
        shape.setName("Star1");
        shape.getXForm().getLocPinX().getUfe().setF("Width*0.5");
        shape.getXForm().getLocPinY().getUfe().setF("Height*0.5");
        shape.getLine().getLineColor().setValue("#ff0000");
        shape.getLine().getLineWeight().setValue(0.03);
        shape.getFill().getFillBkgnd().setValue("#ff00ff");
        shape.getFill().getFillForegnd().setValue("#0000ff");
        shape.getFill().getFillPattern().setValue(31);

        // Add a new hexagon shape
        pinX = 7.0;
        long hexagonId = diagram.addShape(
                pinX, pinY, width, height, hexagonMaster, pageNumber);

        // Set the hexagon shape's properties
        shape = diagram.getPages().getPage(pageNumber).getShapes().getShape(hexagonId);
        shape.getText().getValue().add(new Txt("Hexagon text."));
        shape.setName("Hexagon1");
        shape.getXForm().getLocPinX().getUfe().setF("Width*0.5");
        shape.getXForm().getLocPinY().getUfe().setF("Height*0.5");
        shape.getLine().getLineWeight().setValue(0.03);
        shape.getFill().getFillPattern().setValue(31);

        // Add master to dynamic connector from the stencil
        diagram.addMaster(visioStencil, connectorMaster);

        // Connect rectangle and star shapes
        Shape connector1 = new Shape();
        long connecter1Id = diagram.addShape(connector1, connectorMaster, 0);
        diagram.getPages().getPage(0).connectShapesViaConnector(rectangleId, ConnectionPointPlace.BOTTOM,
                starId, ConnectionPointPlace.TOP, connecter1Id);

        // Connect rectangle and hexagon shapes
        Shape connector2 = new Shape();
        long connecter2Id = diagram.addShape(connector2, connectorMaster, 0);
        diagram.getPages().getPage(0).connectShapesViaConnector(rectangleId, ConnectionPointPlace.BOTTOM,
                hexagonId, ConnectionPointPlace.LEFT, connecter2Id);

        // Save the diagram
        diagram.save(dataDir+ "Output.vdx", SaveFileFormat.VDX);

        System.out.println("Process Completed Successfully");

    }
}




