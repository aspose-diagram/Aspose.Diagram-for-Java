<?php
namespace Aspose\Diagram\WorkingwithHyperlinks;

use com\aspose\diagram\Diagram as Diagram;
class GetShapeHyperlinkData{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram = new Diagram($dataDir . "drawing.vdx");

        # Get a particular shape
        $shape=$diagram->getPages()->getPage("Flow 1")->getShapes()->getShape(1);

        $hyperlinks=$shape->getHyperlinks();

        $i=0;
        while ($i<(int)(string)$hyperlinks->getCount()) {
            $hyperlink=$hyperlinks->get($i);
            print "Address: " . (string)$hyperlink->getAddress()->getValue();
            print "Sub Address: " . (string)$hyperlink->getSubAddress()->getValue();
            print "Description: " . (string)$hyperlink->getDescription()->getValue();
            $i+=1;
        }
    }
}