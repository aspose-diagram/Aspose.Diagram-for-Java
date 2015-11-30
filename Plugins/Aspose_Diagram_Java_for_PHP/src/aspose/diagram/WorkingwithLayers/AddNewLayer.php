<?php
namespace Aspose\Diagram\WorkingwithLayers;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\Layer as Layer;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class AddNewLayer{

    public static function run($dataDir=null){
        # Create instance of Diagram
        $diagram = new Diagram($dataDir . "Basic_Shapes.vsd");

        # get Visio page
        $page = $diagram->getPages()->getPage(0);

        # initialize a new Layer class object
        $layer = new Layer();

        # set Layer name
        $layer->getName()->setValue("Layer2");

        # set Layer Visibility
        $layer->getVisible()->setValue(2);

        # add Layer to the particular page sheet
        $page->getPageSheet()->getLayers()->add($layer);

        # add a new shape
        $shape_id=$page->addShape(3.0, 3.0, 0.36, 0.36, "Circle");

        # get the Shape object
        $shape = $page->getShapes()->getShape($shape_id);

        # assign this new Layer
        $shape->getLayerMem()->getLayerMember()->setValue((string)$layer->getIX());

        # Save diagram
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir . "AddNewLayer.vdx", $saveFileFormat->VDX);

        print "Added a new Layer in the Visio Diagram.".PHP_EOL;
    }

}