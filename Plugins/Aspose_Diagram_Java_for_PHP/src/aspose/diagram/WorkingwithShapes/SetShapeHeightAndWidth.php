<?php
namespace Aspose\Diagram\WorkingwithShapes;

use com\aspose\diagram\Diagram as Diagram;
use com\aspose\diagram\SaveFileFormat as SaveFileFormat;
class SetShapeHeightAndWidth{

    public static function run($dataDir=null){

        # Create instance of Diagram
        $diagram=new Diagram($dataDir."Drawing.vsd");

        $shapes=$diagram->getPages()->getPage(0)->getShapes();

        $i=0;
        while ($i <sizeof($shapes->getCount())) {
            $shape = $shapes->get($i);
            if ((string)$shape->getNameU()=="Process" && (int)(string)$shape->getID()==1) {
            $shape->setWidth(2 * (int)(string)$shape->getXForm()->getWidth()->getValue());
            $shape->setHeight(2 * (int)(string)$shape->getXForm()->getHeight()->getValue());
            }
            $i += 1;
        }
        # Save diagram
        $saveFileFormat=new SaveFileFormat();
        $diagram->save($dataDir."SetShapeHeightAndWidth.vdx",$saveFileFormat->VDX);
        print "Set height and width of shape.".PHP_EOL;
    }
}